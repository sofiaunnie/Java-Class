package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.WindowConstants;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

public class DialogBox extends JFrame implements ActionListener{

	private JButton createButton(String text) {
		JButton btn = new JButton(text);
		btn.setFocusCycleRoot(false);
		btn.setFont(new Font("Ink Free", Font.ITALIC, 25));
		btn.setBackground(getColor());
		btn.setForeground(Color.yellow);
		btn.setFocusable(false);
		return btn;
	}
	
	DialogBox() {
	JButton btn = createButton("Hi..Am Inside Here..Click Me!!!");
	btn.addActionListener(this);
	btn.setFocusable(false);
	add(btn);
	
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	setVisible(true);
	setTitle("The Main Frame");
	pack();
	setLocationRelativeTo(null);
}
	public static void main(String[] args) {
		new DialogBox();
	}
	
	Color [] Colors = {Color.red, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE,
			Color.MAGENTA, Color.CYAN};
         Color getColor() {
//		String [] Colors = {Color.BLACK};
	   int rad = new Random().nextInt(Colors.length);
	   return Colors[rad];
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JDialog dialog = new JDialog();
//		dialog.setLocationRelativeTo(null);
		dialog.setTitle("The Dialog Boxes");
		dialog.setVisible(true);
		dialog.setLayout(new FlowLayout());
		dialog.getContentPane().setBackground(Color.black);
		dialog.setLocationRelativeTo(null);
		
//		String [] Colors = { "Green", "Red", "Yellow", "White", "Grey"};
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.blue);
		
		GridBagConstraints gc = new GridBagConstraints();
		panel.setLayout(new GridBagLayout());
		int num = 
				Integer.parseInt(JOptionPane.showInputDialog("Number of steps"));
//		
//		try {
//			int num1 = Integer.parseInt("");
//		} catch (NumberFormatException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
		
		gc.gridx = 0;
		for (int i = 0; i < num; i++) {
			gc.gridy = i;
			JButton btn = createButton("-" + i + "-");
			panel.add(btn,gc);
			gc.gridx++ ;
		}
		
		for (int i = num; i >= 0; i--) {
			gc.gridy = i;
			JButton btn = createButton("+" + i + "+");
			panel.add(btn,gc);
			gc.gridx++ ;
		}
		
        dialog.add(panel);
		
//		dialog.setSize(700, 215);
		dialog.pack();   
}
}

