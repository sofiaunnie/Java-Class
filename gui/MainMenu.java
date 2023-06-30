package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainMenu extends JFrame implements ActionListener {
	
	Font font;
	Color bgColor, fgColor, panelColor;
	
	public MainMenu() {
		font = new Font("Verdana", Font.BOLD, 20);
		bgColor = Color.black;
		fgColor = Color.yellow;
		panelColor = Color.black;
		
		JPanel panel = new JPanel();
		panel.setBackground(panelColor);
		add(panel);
		
		String [] frames = {"Hang Man", "Tic Tac Toe", "Calculator"};
		for (String frame : frames) {
			panel.add(createButton(frame));
		}
		
		//FRAME PROPERTIES
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MainMenu");
		setVisible(true);
		pack();
		getContentPane().setBackground(Color.blue);
		setLocationRelativeTo(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		
		if(action.equals("Hang Man")) {
//			JOptionPane.showMessageDialog(null, "Hang-man called.");
			new HangMan();
		} else 	if(action.equals("Calculator")) {
//			JOptionPane.showMessageDialog(null, "Calc called.");
			new Calculator();
		} else 	if(action.equals("Tic Tac Toe")) {
//			JOptionPane.showMessageDialog(null, "X and O called.");
			new TicTacToe();
		}
		dispose();
		
	}
	public static void main(String[] args) {
		new MainMenu();
	}
	
	private JButton createButton(String text) {
		JButton btn = new JButton(text);
		btn.setBackground(bgColor);
		btn.setForeground(fgColor);
		btn.addActionListener(this);
		btn.setFocusable(false);
		
		return btn;

}
}
