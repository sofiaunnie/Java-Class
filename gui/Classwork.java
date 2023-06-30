package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

//import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Classwork extends JFrame {
	
	Color frameColor = Color.blue;
	Color btnFg = Color.white;
	
	public Classwork() {
	setLayout(new BorderLayout());
		setLayout(new FlowLayout());
		
		JPanel panel = new JPanel();
		panel.setBackground(frameColor);
	panel.setLayout( new GridLayout(1,4));
		
		JButton btn1 = createButton("Reset");
		btn1.setBackground(Color.red);
		
		JButton btn2 = createButton("Magneta");
		btn2.setBackground(Color.magenta);
		
		JButton btn3 = createButton("yellow");
		btn3.setBackground(Color.yellow);
		
		JButton btn4 = createButton("pink");
		btn4.setBackground(Color.pink);
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		add(panel, BorderLayout.NORTH);
		
	btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn1.setBackground(Color.red);
				btn2.setBackground(Color.magenta);
				btn3.setBackground(Color.yellow);
				btn4.setBackground(Color.pink);
			}
			
			});
	
	btn2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			btn1.setBackground(Color.magenta);
			btn2.setBackground(Color.magenta);
			btn3.setBackground(Color.magenta);
			btn4.setBackground(Color.magenta);
		}
		
		});
	
	btn3.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			btn1.setBackground(Color.yellow);
			btn2.setBackground(Color.yellow);
			btn3.setBackground(Color.yellow);
			btn4.setBackground(Color.yellow);
		}
		
		});
		
	btn4.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			btn1.setBackground(Color.pink);
			btn2.setBackground(Color.pink);
			btn3.setBackground(Color.pink);
			btn4.setBackground(Color.pink);
		}
		
		});
//		FRAME PROPERTIES
		setTitle("Classwork");
		setVisible(true);
		setSize(300, 500);
		getContentPane().setBackground(frameColor);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}
	

	private JButton createButton(String txt) {
		JButton btn = new JButton(txt);
		btn.setFocusable(false);
		btn.setForeground(btnFg);
		btn.setFont(new Font("San Serif", Font.BOLD, 30));

		return btn;
	}
	
	public static void main(String[] args) {
		new Classwork();
	}
}
