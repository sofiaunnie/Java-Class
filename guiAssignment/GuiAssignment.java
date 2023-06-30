package guiAssignment;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.*;
import java.util.Scanner;

public class GuiAssignment extends JFrame{

	 Scanner scan = new Scanner(System.in);
	
	Color frameColor = Color.magenta;
	Color btnBg = Color.yellow;
	Color btnFg = Color.black;
	Color panelColor = Color.black;
	
	public GuiAssignment() {
		setLayout(new BorderLayout());
	
	
	JPanel panel = new JPanel();
	panel.setBackground(frameColor);
	panel.setLayout( new FlowLayout());
	
	
	JButton Shutdownbtn = createButton("ShutDown");
	panel.add(Shutdownbtn);
	
	JButton Hibernatebtn = createButton("Hibernate");
	panel.add(Hibernatebtn);
	
	JButton Restartbtn = createButton("Restart");
	panel.add(Restartbtn);
	
	
	Shutdownbtn.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		      
//		      System.out.print("Enter the Number of Seconds: ");
//		      int seconds = scan.nextInt();
		      Runtime run1 = Runtime.getRuntime();
		      try
		      {
//		         System.out.println("Shutting down the PC after " +seconds+" seconds.");
		         run1.exec("shutdown -s -t 5");
		      }
		      catch(IOException es)
		      {
		         System.out.println("Exception: " +es);
		      }
			
		}});
	
	Hibernatebtn.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		      
//		      System.out.print("Enter the Number of Seconds: ");
//		      int seconds = scan.nextInt();
		      Runtime run2 = Runtime.getRuntime();
		      try
		      {
//		         System.out.println("Shutting down the PC after " +seconds+" seconds.");
		        run2.exec("shutdown -h");
		      }
		      catch(IOException eh)
		      {
		         System.out.println("Exception: " +eh);
		      }
			
		}});
	
	Restartbtn.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		      
//			   System.out.print("Enter the Number of Seconds: ");
//			      int sec = scan.nextInt();
			      Runtime run3 = Runtime.getRuntime();
			      try
			      {
//			         System.out.println("The PC will get restarted after " +sec+" seconds.");
			         run3.exec("shutdown -r -t 5");
			      }
			      catch(IOException er)
			      {
			         System.out.println("Exception: " +er);
			      }
			
		}});
	
	add(panel, BorderLayout.NORTH);
	
//	FRAME PROPERTIES
	setTitle("Keyboard");
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
		btn.setBackground(btnBg);
		btn.setFont(new Font("Ink Free", Font.BOLD, 30));

		return btn;
	}
	
	public static void main(String[] args) {
		new GuiAssignment();
	}
	

}

