package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class TicTacToe extends JFrame implements ActionListener {
	Font btnFont;
	Color bgColor, fgColor, winColor, panelColor;
	boolean isPlayerOne;

	String[] plays;
	JButton[] buttons;
	JButton btn;
	BorderFactory Border;
	int result;
	int Player1Score = 0, Player2Score = 0;
	JLabel p1Scorelabel, p2Scorelabel;
	JLabel p1label,myturn, p2label;
	String Xturn,Oturn;

	public TicTacToe() {
		btnFont = new Font("Ink Free", Font.ITALIC, 55);
		isPlayerOne = true;

		String path = "C:/Users/User/Pictures/download.png";
		ImageIcon image= new ImageIcon(path);
		setIconImage(image.getImage());
		
		
		plays = new String[9];
		buttons = new JButton[9];

		bgColor = Color.black;
		fgColor = Color.yellow;
		winColor = Color.gray;
		panelColor = Color.black;
		
		GridLayout grid = new GridLayout(2,1);
		grid.setVgap(20);

		JPanel panel = new JPanel();
//		panel.setLayout(new GridLayout(3, 3));
		panel.setBackground(Color.ORANGE);
		add(panel, BorderLayout.CENTER);
		
		GridLayout gl = new GridLayout(3,3);
		gl.setVgap(5);
		gl.setHgap(5);
		panel.setLayout(gl);
		
		Border bd = BorderFactory.createLineBorder(Color.MAGENTA,20,true);
		panel.setBorder(bd);

		for (int i = 0; i < 9; i++) {
			JButton btn = createButton();
			btn.setActionCommand(String.valueOf(i));
			panel.add(btn);

			buttons[i] = btn;
		}

		JPanel scorePanel = new JPanel();
		scorePanel.setBackground(panelColor);
		add(scorePanel, BorderLayout.SOUTH);
		
		p1label = createLabel(acceptName("player 1"));
		scorePanel.add(p1label);
		
		p1Scorelabel = createLabel("0");
		scorePanel.add(p1Scorelabel);
		
		p2label = createLabel(acceptName("player 2"));
		scorePanel.add(p2label);
		
		p2Scorelabel = createLabel("0");
		scorePanel.add(p2Scorelabel);

		btn = createButton();
		btn.setText("Restart");
		btn.setActionCommand("reset");
		btn.setBorder(BorderFactory.createLineBorder(Color.red));
		scorePanel.add(btn);
		
		btn = createButton();
		btn.setText("Exit");
		btn.setActionCommand("exit");
		btn.setBorder(BorderFactory.createLineBorder(Color.red));
		scorePanel.add(btn);
		
//		JOptionPane.showConfirmDialog(null, Confirm)
		
		scorePanel.setLayout(new GridLayout(3,2));

		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(panelColor);
		add(titlePanel, BorderLayout.NORTH);
		JPanel titlePanel1 = new JPanel();
		titlePanel1.setBackground(panelColor);
		JPanel titlePanel2 = new JPanel();
		titlePanel2.setBackground(panelColor);
		
		

		JLabel title = new JLabel("TIC TAC TOE");
		titlePanel.add(titlePanel1);
		titlePanel.add(titlePanel2);
		titlePanel1.add(title);
		myturn = createLabel(Xturn+"'s turn");
		title.setBorder(BorderFactory.createLineBorder(Color.red));
		titlePanel.setLayout(new GridLayout(2,1));
		titlePanel2.add(myturn);
		
//		titlePanel.add(title);
		title.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Entered");
				title.setForeground(Color.gray);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("Exited");
				title.setForeground(Color.yellow);
			}
		});
		
		title.setFont(btnFont);
		title.setBackground(btn.getBackground());
		title.setForeground(btn.getForeground());
		

		addWindowListener(new BackToMainMenu());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("TicTacToe");
		setVisible(true);
		setSize(750, 750);
		getContentPane().setBackground(Color.blue);
		setLocationRelativeTo(null);
	}

	private JLabel createLabel(String text) {
		JLabel label = new JLabel(text);
		label.setFont(btnFont);
		label.setBackground(bgColor);
		label.setForeground(fgColor);
		label.setHorizontalAlignment(JLabel.CENTER);
		return label;
	}
	
	public String acceptName(String text) {
		String res = JOptionPane.showInputDialog(null,
				text + "\nEnter your name").toUpperCase();
		if (text.equalsIgnoreCase("Player 2") && 
				p1label.getText().equalsIgnoreCase(res)) {
			return acceptName(text);
		}
		return res.isBlank() ?
				acceptName(text) : res;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		btn = (JButton) e.getSource();
		if (e.getActionCommand().equals("exit")) {
			int option = JOptionPane.showConfirmDialog(null, "Sure to exit?");
			if (option == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
			}

		if (e.getActionCommand().equals("reset")) {
			result = JOptionPane.showConfirmDialog(null, "Sure to Restart?",
														"Warning Dialog",
														JOptionPane.YES_NO_OPTION,
														JOptionPane.WARNING_MESSAGE);
			if (result == 0) {
				Player1Score = 0;
				Player2Score = 0;
				reset();
			
			int option1 = JOptionPane.showConfirmDialog(null, "Are you sure you want to play with the same player?",
																				"Confirmation Dialog",
																				JOptionPane.YES_NO_OPTION,
																				JOptionPane.WARNING_MESSAGE);
			
			if (option1 == JOptionPane.NO_OPTION) {
				p1label.setText(acceptName("Player 1"));
				p2label.setText(acceptName("Player 2"));
				Player1Score = 0;
				Player2Score = 0;
				p1Scorelabel.setText("0");
				p2Scorelabel.setText("0");
				reset();
//				p1label.setText(acceptName("Player 1"));
//				p2label.setText(acceptName("Player 2"));
				
			}else {
				Player1Score = 0;
				Player2Score = 0;
				p1Scorelabel.setText("0");
				p2Scorelabel.setText("0");
			}
			}
			}
		else if (btn.getText().equals("")) {

			String played;
			if (isPlayerOne) {
				btn.setForeground(Color.white);
				played = "X";
				myturn.setText("O's turn");
			} else {
				btn.setForeground(Color.red);
				played = "O";
				myturn.setText("X's turn");
			}

			int index = Integer.valueOf(e.getActionCommand());

			btn.setText(played);
			plays[index] = played;

			isPlayerOne = !isPlayerOne;
			checkwin(played);

			boolean vacant = false;
			for (String str : plays) {
				if (str == null) {

					vacant = true;
				}
			}

			if (vacant == false) {
				JOptionPane.showMessageDialog(this, "No Winner\n Play Again");
				reset();
			}
		}
	}

	public static void main(String[] args) {
		new TicTacToe();
	}

	void checkwin(String text) {
		int[][] winningPositions = {
				{ 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 },
				{ 6, 3, 0 }, { 7, 4, 1 }, { 5, 8, 2 },
				{ 0, 4, 8 }, { 2, 4, 6 } };

		for (int[] arr : winningPositions) {

			int first = arr[0];
			int second = arr[1];
			int third = arr[2];

			if (plays[first] == null || plays[second] == null || plays[third] == null) {
				continue;
			}

			if (plays[first].equals(text) && plays[second].equals(text) && plays[third].equals(text)) {

				buttons[first].setBackground(winColor);
				buttons[second].setBackground(winColor);
				buttons[third].setBackground(winColor);
				JOptionPane.showMessageDialog(this, "win");
				reset();
				if (isPlayerOne)
					Player1Score++;
				else
					Player2Score++;
				setscore();
				break;
			}
		}
	}
	
	void setscore() {
		p1Scorelabel.setText(Player1Score + "");
		p2Scorelabel.setText(Player2Score + "");
	}

	void reset() {
		for (int i = 0; i < buttons.length; i++) {
			plays[i] = null;
			buttons[i].setText("");
			buttons[i].setBackground(bgColor);
		}
	}
	private JButton createButton() {
		JButton btn = new JButton();
		btn.setText("");
		btn.setFont(btnFont);
		btn.setBackground(bgColor);
		btn.setForeground(fgColor);
		btn.addActionListener(this);
		btn.setFocusable(false);

		return btn;
	}

}