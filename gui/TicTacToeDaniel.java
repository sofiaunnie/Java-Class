package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TicTacToeDaniel extends JFrame implements ActionListener{
	Font btnFont;
	Color bgColor, fgColor,winColor, panelColor;
	boolean isplayerOne;
	int scoreX, scoreO;
	JLabel playerXscore;
	JLabel playerOscore;
	
	String[] plays;
	JButton[] buttons;
	
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
	
	
	//Constructor
	public TicTacToeDaniel() {
		btnFont = new Font("Ink Free", Font.ITALIC, 55);
		isplayerOne = true;
		
		plays = new String[9];
		buttons = new JButton[9];
		
		bgColor = Color.black;
		fgColor = Color.YELLOW;
		winColor = Color.gray;
		panelColor = Color.black;
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,3));
		add(panel, BorderLayout.CENTER);
		
		for(int i = 0; i < 9; i++) {
			JButton btn = createButton();
			btn.setActionCommand(String.valueOf(i));
			panel.add(btn);
			
			buttons[i] = btn;
		}
		
		JPanel scorePanel = new JPanel();
		scorePanel.setBackground(panelColor);
		add(scorePanel, BorderLayout.SOUTH);
		
		scorePanel.setLayout(new GridLayout(2,2));
		
		JLabel playerX = new JLabel("Player X");
		playerX.setFont(btnFont);
		playerX.setBackground(bgColor);
		playerX.setForeground(fgColor);
		
		JLabel playerO = new JLabel("Player O");
		playerO.setFont(btnFont);
		playerO.setBackground(bgColor);
		playerO.setForeground(fgColor);
		
		 playerXscore = new JLabel();
		playerXscore.setFont(btnFont);
		playerXscore.setBackground(bgColor);
		playerXscore.setForeground(fgColor);
		
		 playerOscore = new JLabel();
		playerOscore.setFont(btnFont);
		playerOscore.setBackground(bgColor);
		playerOscore.setForeground(fgColor);
		
		scorePanel.add(playerX);
		scorePanel.add(playerXscore);
		scorePanel.add(playerO);
		scorePanel.add(playerOscore);
		
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(panelColor);
		add(titlePanel, BorderLayout.NORTH);
		
		JLabel title = new JLabel("Tic Tac Toe");
		titlePanel.add(title);
		title.setFont(btnFont);
		title.setBackground(bgColor);
		title.setForeground(fgColor);
		
		
		//Frame properties
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tic Tac Toe");
		setVisible(true);
		setSize(750,750);
		getContentPane().setBackground(Color.blue);
		setLocationRelativeTo(null);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btn = (JButton)e.getSource();
		int index = Integer.parseInt(e.getActionCommand());
		
		if(btn.getText().equals("")) {
			String played;
			
			if(isplayerOne) {
				btn.setForeground(Color.white);
				played = "X";
			}else {
				btn.setForeground(Color.red);
				played = "0";
			}
			btn.setText(played);
			plays[index] = played;
			
			isplayerOne = !isplayerOne;
			checkWin(played);
			
			boolean vacant = false;
			for(String str: plays) {
				if(str == null)
					vacant = true;
			}
			
			if(vacant == false) {
				JOptionPane.showMessageDialog(this,"No Winner\nPlay Again");
				reset();
			}
		}
	}
	
	public static void main(String[] args) {
		new TicTacToeDaniel();
	}
	
	void checkWin(String text) {
		int[][] winningPositions = {
				{0,1,2}, {3,4,5}, {6,7,8},
				{6,3,0}, {7,4,1}, {5,8,2},
				{0,4,8}, {2,4,6} 
		};
		
		for(int[] arr : winningPositions) {
			int first = arr[0];
			int second = arr[1];
			int third = arr[2];
			
			if(plays[first] == null ||
					plays[second] == null ||
					plays[third] == null) {
				continue;
			}
			
			if(plays[first].equals(text) && plays[second].equals(text)
					&& plays[third].equals(text)) {
				buttons[first].setBackground(winColor);
				buttons[second].setBackground(winColor);
				buttons[third].setBackground(winColor);
				if(text.equals("X")) {
					JOptionPane.showMessageDialog(this, "X win");
					scoreX++;
					System.out.println(scoreX);
					playerXscore.setText(String.valueOf(scoreX));
					
				}
				else {
					JOptionPane.showMessageDialog(this, "O win");
					scoreO++;
					System.out.println(scoreO);
					playerOscore.setText(String.valueOf(scoreO));
				}
				
				reset();
				break;
			}
		}
	}
	
	void reset() {
		for(int i = 0; i < buttons.length; i++) {
			plays[i] = null;
			buttons[i].setText("");
			buttons[i].setBackground(bgColor);
		}
	}

}

