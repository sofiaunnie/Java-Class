package gui;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridBags extends JFrame implements ActionListener {
	
	private JButton createButton(String text) {
		JButton btn = new JButton(text);
		
		btn.setFont(new Font("Ink Free", Font.ITALIC, 25));
		btn.setBackground(Color.black);
		btn.setForeground(Color.yellow);
		btn.addActionListener(this);
		btn.setFocusable(false);
		
		return btn;

	}
	
	GridBags() {
		JButton btn = createButton("Click");
		btn.addActionListener(this);
		add(btn);
		
		//FRAME PROPERTIES
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Dialog Demo");
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
	
	}
	
	public static void main(String[] args) {
		new GridBags();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JDialog dialog = new JDialog();
		dialog.setLocationRelativeTo(null);
		dialog.setTitle("The Title");
		dialog.setVisible(true);
		dialog.setLayout(new FlowLayout());
		dialog.getContentPane().setBackground(Color.black);

		JPanel panel = new JPanel();
		panel.setBackground(Color.blue);
		
		JButton btn1 = createButton("One");
		JButton btn2 = createButton("Two");
		JButton btn3 = createButton("Three");
		JButton btn4 = createButton("Four");
		JButton btn5 = createButton("Five");
		
		GridBagConstraints gc = new GridBagConstraints();
		panel.setLayout(new GridBagLayout());
		
		gc.gridx = 0;
		gc.gridy = 0;
		panel.add(btn1, gc);
		
		gc.gridx = 2;
		panel.add(btn2, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		panel.add(btn3, gc);
		
		gc.gridx = 0;
		gc.gridy = 2;
		panel.add(btn4, gc);
		
		gc.gridx = 2;
		panel.add(btn5, gc);
		
		dialog.add(panel);	
//		dialog.pack();
		dialog.setSize(300, 150);
		
	}
}
