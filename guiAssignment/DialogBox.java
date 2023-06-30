package guiAssignment;

import javax.swing.JFrame;
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
		
		JButton btn1 = createButton("One..");
		JButton btn2 = createButton("Two..");
		JButton btn3 = createButton("Three");
		JButton btn4 = createButton("Four..");
		JButton btn5 = createButton("Five....");
		JButton btn6 = createButton("Six......");
		JButton btn7 = createButton("Seven");
		JButton btn8 = createButton("Eight");
		JButton btn9 = createButton("Nine");
//		JButton btn10 = createButton("Ten");
		
		GridBagConstraints grid = new GridBagConstraints();
		panel.setLayout(new GridBagLayout());
		
//		grid.gridx = 0;
//		grid.gridy = 0;
		grid.gridx = 0;
		grid.gridy = 0;
		panel.add(btn1, grid);
		
//		grid.gridx = 2;
//		panel.add(btn2, grid);
		
		grid.gridx = 1;
		grid.gridy = 1;
		panel.add(btn2, grid);
		
		grid.gridx = 2;
		grid.gridy = 2;
		panel.add(btn3, grid);
		
		grid.gridx = 3;
		grid.gridy = 3;
		panel.add(btn4, grid);
		
		grid.gridx = 4;
		grid.gridy = 4;
		panel.add(btn5, grid);
		
		grid.gridx = 5;
		grid.gridy = 3;
		panel.add(btn6, grid);
		
		grid.gridx = 6;
		grid.gridy = 2;
		panel.add(btn7, grid);
		
		grid.gridx = 7;
		grid.gridy = 1;
		panel.add(btn8, grid);
		
		grid.gridx = 8;
		grid.gridy = 0;
		panel.add(btn9, grid);
		
        dialog.add(panel);
		
//		dialog.setSize(700, 215);
		dialog.pack();   
}
}

