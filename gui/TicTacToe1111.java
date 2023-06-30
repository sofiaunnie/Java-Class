package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TicTacToe1111 extends JFrame implements ActionListener {
	Font btnFont;
	Color bgColor, fgColor, winColor, panelColor;
	boolean isPlayerOne;

	String[] plays;
	JButton[] buttons;
	int player1Score = 0, player2Score = 0;
	JLabel p1ScoreLabel, p2ScoreLabel;

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

	// Constructor
	public TicTacToe1111() {
		btnFont = new Font("Ink Free", Font.ITALIC, 55);
		isPlayerOne = true;

		// To add Image to your gui
		String path = "C:\\Users\\sofia\\OneDrive\\Pictures\\Hyune's painting\\hyune.jpg";
		ImageIcon image = new ImageIcon(path);
		setIconImage(image.getImage());

		plays = new String[9];
		buttons = new JButton[9];

		bgColor = Color.black;
		fgColor = Color.YELLOW;
		winColor = Color.gray;
		panelColor = Color.black;

		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(panelColor);
		add(titlePanel, BorderLayout.NORTH);

		JLabel title = createLabel("Tic Tac Toe");
		title.setBorder(BorderFactory.createLineBorder(Color.red));
		titlePanel.add(title);
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
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 3));
		add(panel, BorderLayout.CENTER);

		for (int i = 0; i < 9; i++) {
			JButton btn = createButton();
			btn.setActionCommand(String.valueOf(i));
			panel.add(btn);

			buttons[i] = btn;
		}

		JPanel scorePanel = new JPanel();
		scorePanel.setBackground(panelColor);
		add(scorePanel, BorderLayout.SOUTH);

		JButton btn = createButton();
		btn.setText("South Panel Button");
		scorePanel.add(btn);

		// South Panel
		JLabel p1Label = createLabel(acceptName("Player 1"));
		scorePanel.add(p1Label);

		p1ScoreLabel = createLabel("0");
		scorePanel.add(p1ScoreLabel);

		JLabel p2Label = createLabel(acceptName("Player 2"));
		scorePanel.add(p2Label);

		p2ScoreLabel = createLabel("0");
		scorePanel.add(p2ScoreLabel);

		scorePanel.setLayout(new GridLayout(2, 2));

		// Frame properties

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tic Tac Toe");
		setVisible(true);
		setSize(750, 750);
		getContentPane().setBackground(Color.blue);
		setLocationRelativeTo(null);

	}

	private String acceptName(String text) {
		String res = JOptionPane.showInputDialog(null,
				text + "\nEnter your name");
		return res.isBlank() ? 
				acceptName(text) : res;
	}

	private JLabel createLabel(String text) {

		JLabel label = new JLabel(text);
		label.setFont(btnFont);
		label.setBackground(bgColor);
		label.setForeground(fgColor);
		label.setHorizontalAlignment(JLabel.CENTER);

		return label;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton btn = (JButton) e.getSource();
		int index = Integer.parseInt(e.getActionCommand());

		if (btn.getText().equals("")) {
			
			String played;
			if (isPlayerOne) {
				btn.setForeground(Color.white);
				played = "X";
			} else {
				btn.setForeground(Color.red);
				played = "0";
			}
			
			btn.setText(played);
			plays[index] = played;
			
			checkWin(played);
			isPlayerOne = !isPlayerOne;
			
			boolean vacant = false;
			for (String str : plays) {
				if (str == null) {
					vacant = true;
				}
			}

			if (vacant == false) {
				JOptionPane.showMessageDialog(this,
						    "No Winner\nPlay Again");
				reset();
			}
		}
	}

	public static void main(String[] args) {
		new TicTacToeDaniel();
	}

	void checkWin(String text) {
		int[][] winningPositions = { 
				{ 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 },
				{ 6, 3, 0 }, { 7, 4, 1 }, { 5, 8, 2 },
				{ 0, 4, 8 }, { 2, 4, 6 } };

		for (int[] arr : winningPositions) {
			int first = arr[0];
			int second = arr[1];
			int third = arr[2];

			if (plays[first] == null || 
					     plays[second] == null || 
					     plays[third] == null) {
				continue;
			}
			if (plays[first].equals(text) && plays[second].equals(text) && plays[third].equals(text)) { 
				buttons [first].setBackground (winColor);
				buttons [second].setBackground (winColor);
				buttons [third].setBackground (winColor); 
				JOptionPane.showMessageDialog(this, "win");
				reset();
				if (isPlayerOne)
					player1Score++;
				else
					player2Score++;
				p1ScoreLabel.setText(player1Score + "");
				p2ScoreLabel.setText(player2Score + "");

			    break;
			}
		}
	}

	void reset() {
		for (int i = 0; i < buttons.length; i++) {
			plays[i] = null;
			buttons[i].setText("");
			buttons[i].setBackground(bgColor);
		}
	}

}
