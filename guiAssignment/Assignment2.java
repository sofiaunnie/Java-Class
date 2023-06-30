package guiAssignment;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Assignment2 {
	public static void main(String[] args) {

		System.out.println("Start");
		JFrame frame = new JFrame("GUI is easy");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 500);
		frame.getContentPane().setBackground(Color.red);
		frame.setLayout(new FlowLayout());

		JLabel label = new JLabel("First number: ");
		label.setForeground(Color.white);
		label.setFont(new Font("Ink Free", Font.BOLD, 30));
		frame.add(label);

		JTextField userNameField = new JTextField(15);
		userNameField.setBackground(Color.black);
		userNameField.setForeground(Color.white);
		userNameField.setFont(new Font("Ink Free", Font.BOLD, 20));
		userNameField.setCaretColor(Color.yellow);
		frame.add(userNameField);

		JLabel label2 = new JLabel("Second Number: ");
		label2.setForeground(Color.white);
		label2.setFont(new Font("Ink Free", Font.BOLD, 30));
		frame.add(label2);

		// The 25 is the character Count
		JTextField userNameField2 = new JTextField(15);
		userNameField2.setBackground(Color.black);
		userNameField2.setForeground(Color.white);
		userNameField2.setFont(new Font("Ink Free", Font.BOLD, 20));
		userNameField2.setCaretColor(Color.yellow);
		frame.add(userNameField2);

		JTextField userNameField3 = new JTextField(15);
		userNameField3.setBackground(Color.black);
		userNameField3.setForeground(Color.white);
		userNameField3.setFont(new Font("Ink Free", Font.BOLD, 20));
		userNameField3.setCaretColor(Color.yellow);
		frame.add(userNameField3);
		
		JButton btn = createButton("Click btn1");
		btn.setText("Submit");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String text1 = userNameField.getText();
				if (text1.length() == 0) {
					text1 = "0";
				}
				int val1 = Integer.parseInt(text1);

				String text2 = userNameField2.getText();
				if (text2.length() == 0) {
					text2 = "0";
				}
				int val2 = Integer.parseInt(text2);
				int sum = val1 + val2;

				System.out.println("The Sum is : " + sum);
			}
		});

		frame.add(btn);
		frame.setLocationRelativeTo(null);
		System.out.println("End");
	}

	static JButton createButton(String txt) {
		JButton btn2 = new JButton();
		Color btnBgColor = Color.green;
		Color btnFgColor = new Color(155, 0, 155);

		btn2.setText(txt);
		btn2.setFocusable(false);
		btn2.setBackground(btnBgColor);
		btn2.setForeground(btnFgColor);

		Font btnFont = new Font("Verdana", Font.BOLD, 30);
		btn2.setFont(btnFont);
		return btn2;
	}
}
