package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Simple extends JFrame implements ActionListener{
	
	Color frameColor = Color.blue;
	Color btnBg = Color.red;
	Color btnFg = Color.white;
	Color LabelFg = Color.white;
	Font font;
	JPanel panel;
	JButton Button;
	JButton btn1, btn2, btn3;

	Simple() {
		
	setLayout(new BorderLayout());
		
	font = new Font("Ink Free",Font.PLAIN,40);
	
	JPanel panel = new JPanel();
	add(panel, BorderLayout.CENTER);
	panel.setBackground(frameColor);
	
	btn1 = createButton("Class One");
	btn2 = createButton("Class Two");
	btn3 = createButton("Class Three");
	
	panel.add(btn1);
	panel.add(btn2);
	panel.add(btn3);
	
	
//	FRAME PROPERTIES
	setTitle("Main Class");
	setVisible(true);
	setSize(500, 500);
	getContentPane().setBackground(frameColor);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocationRelativeTo(null);

}
	public static void main(String[] args) {
		new ClassOne();
		new ClassTwo();
		new ClassThree();
		new Simple();
	}
	

	
	private JButton createButton(String txt) {
		JButton btn = new JButton(txt);
		btn.setFocusable(false);
		btn.setBackground(btnBg);
		btn.setForeground(btnFg);
		btn.addActionListener(this);
		btn.setFont(new Font("Ink Free",Font.BOLD, 30));
		return btn;
	}
	
	private JLabel createLabel(String txt) {

		JLabel label = new JLabel(txt);
		label.setForeground(LabelFg);
		label.setFont(new Font("Ink Free", Font.BOLD, 30));
		label.setHorizontalAlignment(JLabel.CENTER);

		return label;
	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
//		setVisible(false);
		new ClassOne().setVisible(true);;
		}
		else if (e.getSource() == btn2) {
			setVisible(false);
			new ClassTwo().setVisible(true);;}
		else if (e.getSource() == btn3) {
			setVisible(false);
			new ClassThree().setVisible(true);; }
		
	}

}

class ClassOne extends JFrame {
	Color frameColor = Color.red;
	ClassOne() {
		
		setLayout(new BorderLayout());
		
		JLabel label1 = createLabel("Class One");
		add(label1);
		
		setTitle("Main Class");	
		setVisible(false);
		setSize(200, 200);
		getContentPane().setBackground(frameColor);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
 
	private JLabel createLabel(String txt) {

	JLabel label = new JLabel(txt);
	label.setForeground(Color.white);
	label.setFont(new Font("Ink Free", Font.BOLD, 30));
	label.setHorizontalAlignment(JLabel.CENTER);

	return label;
	}
}

class ClassTwo extends JFrame {
	Color frameColor = Color.red;
	
	 ClassTwo() {
		 
		 setLayout(new BorderLayout());
		 
		 JLabel label2 = createLabel("Class Two");
			add(label2);
			
			setTitle("Class Two");	
			setVisible(false);
			setSize(200, 200);
			getContentPane().setBackground(frameColor);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
		 
	 }
	
	private JLabel createLabel(String txt) {

	JLabel label = new JLabel(txt);
	label.setForeground(Color.white);
	label.setFont(new Font("Ink Free", Font.BOLD, 30));
	label.setHorizontalAlignment(JLabel.CENTER);
	
	return label;
	}

}

class ClassThree extends JFrame {
	Color frameColor = Color.red;
	ClassThree () {
		setLayout(new BorderLayout());
		 
		 JLabel label3 = createLabel("Class Three ");
			add(label3);
			
			setTitle("Class Three");	
			setVisible(false);
			setSize(200, 200);
			getContentPane().setBackground(frameColor);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
	}
	
	private JLabel createLabel(String txt) {

	JLabel label = new JLabel(txt);
	label.setForeground(Color.green);
	label.setFont(new Font("Ink Free", Font.BOLD, 30));
	label.setHorizontalAlignment(JLabel.CENTER);
	

	return label;
	}
}