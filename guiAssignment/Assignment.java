package guiAssignment;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
// import java.awt.FlowLayout;

public class Assignment {
	public static void main(String[] args) {
		System.out.println("Start");
		JFrame jframe = new JFrame("Sofiat");
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(300, 500);
//		jframe.getContentPane().setBackground(Color.magenta);
		jframe.setLayout(new BorderLayout());
		
		JButton btn1 = new JButton();
		btn1.setText("North");
		jframe.add(btn1, BorderLayout.NORTH);
		btn1.setFocusable(false);
		btn1.setBackground(Color.yellow);
		btn1.setForeground(Color.black);
//		btn.setForeground(new Color(0,0,255));
//		btn.setForeground(new Color(155,0,155));
//		btn.setFont(new Font("Verdana", Font.BOLD, 30)); 
		Font btn1Font = new Font("Verdana", Font.BOLD, 30);
		btn1.setFont(btn1Font);
		
		JButton btn2 = new JButton();
		btn2.setText("South");
		jframe.add(btn2, BorderLayout.SOUTH);
		btn2.setFocusable(false);
		btn2.setBackground(Color.magenta);
		btn2.setForeground(Color.black);
//		btn.setForeground(new Color(0,0,255));
//		btn.setForeground(new Color(155,0,155));
//		btn.setFont(new Font("Verdana", Font.BOLD, 30)); 
		Font btn2Font = new Font("Verdana", Font.BOLD, 30);
		btn2.setFont(btn2Font);
		
		JButton btn3 = new JButton();
		btn3.setText("East");
		jframe.add(btn3, BorderLayout.EAST);
		btn3.setFocusable(false);
		btn3.setBackground(Color.blue);
		btn3.setForeground(Color.black);
//		btn.setForeground(new Color(0,0,255));
//		btn.setForeground(new Color(155,0,155));
//		btn.setFont(new Font("Verdana", Font.BOLD, 30)); 
		Font btn3Font = new Font("Verdana", Font.BOLD, 30);
		btn3.setFont(btn3Font);
		
		JButton btn4 = new JButton();
		btn4.setText("West");
		jframe.add(btn4, BorderLayout.WEST);
		btn4.setFocusable(false);
		btn4.setBackground(Color.green);
		btn4.setForeground(Color.black);
//		btn.setForeground(new Color(0,0,255));
//		btn.setForeground(new Color(155,0,155));
//		btn.setFont(new Font("Verdana", Font.BOLD, 30)); 
		Font btn4Font = new Font("Verdana", Font.BOLD, 30);
		btn4.setFont(btn4Font);
		
		JButton btn5 = new JButton();
		btn5.setText("Center");
		jframe.add(btn5, BorderLayout.CENTER);
		btn5.setFocusable(false);
		btn5.setBackground(Color.white);
		btn5.setForeground(Color.black);
//		btn.setForeground(new Color(0,0,255));
//		btn.setForeground(new Color(155,0,155));
//		btn.setFont(new Font("Verdana", Font.BOLD, 30)); 
		Font btn5Font = new Font("Verdana", Font.BOLD, 30);
		btn5.setFont(btn5Font);
		
		jframe.setLocationRelativeTo(null);
		System.out.println("End");
		}
}
