package gui;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Numbers extends JFrame {

	public Numbers() {

		setVisible(true);
		setTitle("GUI is easy");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.red);
		setLayout(new FlowLayout());

		// First Assignment

		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.black);
		add(panel1);

		JLabel fNumber = createLabel("First Number: ");
		panel1.add(fNumber);

		JTextField fNumberField = createTextField();
		panel1.add(fNumberField);

		JLabel lNumber = createLabel("Last Number: ");
		panel1.add(lNumber);

		JTextField lNumberField = createTextField();
		panel1.add(lNumberField);

		JButton submit2 = Intro.createButton("Click!");
		panel1.add(submit2);

		JLabel display2 = createLabel("Result: ");
		panel1.add(display2);
		
//		JTextField display2 = createTextField();
//		display2.setEditable(false);
//		panel1.add(display2);
		
		submit2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(fNumberField.getText());
				int num2 = Integer.parseInt(lNumberField.getText());

				String res = num1 + " + " + num2 + " = " + (num1 + num2);
				System.out.println(res);
				JOptionPane.showMessageDialog(null, res);

				display2.setText(res);
				fNumberField.setText("");
				lNumberField.setText("");
			}
		});

		// Second Assignment
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.blue);
		add(panel2);

		JLabel fName = createLabel("First Name: ");
		panel2.add(fName);

		JTextField fNameField = createTextField();
		panel2.add(fNameField);

		JLabel lName = createLabel("Last Name: ");
		panel2.add(lName);

		JTextField lNameField = createTextField();
		panel2.add(lNameField);

		JButton submit = Intro.createButton("Click!");
		panel2.add(submit);

		JLabel display = createLabel("Result: ");
		panel2.add(display);

		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(fNameField.getText() + " " + lNameField.getText());
				JOptionPane.showMessageDialog(null, "Name is: " + fNameField.getText() + " " + lNameField.getText() );
				fNameField.setText("");
				lNameField.setText("");
			}
		});

		pack();
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		new Numbers();
	}

	public JLabel createLabel(String txt) {
		JLabel label = new JLabel(txt);
		label.setForeground(Color.white);
		label.setFont(new Font("Ink Free", Font.BOLD, 30));
		return label;
	}

	public JTextField createTextField() {
		JTextField txtField = new JTextField("Default text", 15);
		txtField.setBackground(Color.black);
		txtField.setForeground(Color.white);
		txtField.setFont(new Font("Ink Free", Font.BOLD, 20));
		txtField.setCaretColor(Color.yellow);
		return txtField;
	}

}

