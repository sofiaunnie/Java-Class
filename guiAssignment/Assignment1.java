package guiAssignment;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Assignment1 {

	public static void main(String[] args) {

		System.out.println("Start");
//		jframe title syntax 
		// method 1
//		JFrame jframe = new JFrame ("My JFrame Title");
		JFrame frame = new JFrame("GUI is too easy");
		frame.setVisible(true);
//		jframe title syntax 
		// method 2
//		jframe.setTitle ("My JFrame Title");
		frame.setTitle("GUI is easy");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setDefaultCloseOperation(3);
		frame.setSize(300, 500);
		frame.getContentPane().setBackground(Color.red);
		frame.setLayout(new FlowLayout());

		JLabel label = new JLabel("First name: ");
		label.setForeground(Color.white);
		label.setFont(new Font("Ink Free", Font.BOLD, 30));
		frame.add(label);

		// The 25 is the character Count
		JTextField userNameField = new JTextField("Default Text", 15);
		userNameField.setBackground(Color.black);
		userNameField.setForeground(Color.white);
		userNameField.setFont(new Font("Ink Free", Font.BOLD, 20));
		userNameField.setCaretColor(Color.yellow);
		frame.add(userNameField);

		JLabel label2 = new JLabel("Last name: ");
		label2.setForeground(Color.white);
		label2.setFont(new Font("Ink Free", Font.BOLD, 30));
		frame.add(label2);

		JTextField userNameField2 = new JTextField("Default Text", 15);
		userNameField2.setBackground(Color.black);
		userNameField2.setForeground(Color.white);
		userNameField2.setFont(new Font("Ink Free", Font.BOLD, 20));
		userNameField2.setCaretColor(Color.yellow);
		frame.add(userNameField2);

		JButton btn = createButton("Click btn1");
		btn.setText("Submit");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("FullName is : " + userNameField.getText() + " " + userNameField2.getText());
			userNameField.setText("");
			userNameField2.setText("");
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
