package gui;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialog extends JFrame implements ActionListener {
	
	private JButton createButton(String text) {
		JButton btn = new JButton(text);
		
		btn.setFont(new Font("Ink Free", Font.ITALIC, 25));
		btn.setBackground(Color.black);
		btn.setForeground(Color.yellow);
		btn.addActionListener(this);
		btn.setFocusable(false);
		
		return btn;

	}
	
	Dialog() {
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
		new Dialog();
		
//		retrieve available fonts in java
		
//		String [] fonts = GraphicsEnvironment.
//				getLocalGraphicsEnvironment().
//				getAvailableFontFamilyNames();
//		
//		for(String l : fonts)
//			System.out.println(l);
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
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		dialog.add(panel);	
//		dialog.pack();
		dialog.setSize(300, 150);
		
	}
}
