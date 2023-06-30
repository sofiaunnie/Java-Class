package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame implements ActionListener {

	Font font;
	JTextField txtField;
	JButton[] buttons;
	int count = 0;

	public Calc() {
		font = new Font("Ink Free", Font.PLAIN, 30);

		JPanel panel = new JPanel();
		add(panel);

		txtField = new JTextField(10);
		txtField.setEditable(false);
		txtField.setBackground(Color.black);
		txtField.setForeground(Color.white);
		txtField.setCaretColor(Color.yellow);
		txtField.setFont(font);

		panel.add(txtField);

		JButton btnOnOrOff = createButton("OFF");
		btnOnOrOff.setBackground(Color.red);
		btnOnOrOff.setActionCommand("power");
		panel.add(btnOnOrOff);

		JButton btn1, btn2, btn3, btn4, btn5, btn6;

		btn1 = createButton("1");
		btn2 = createButton("2");
		btn3 = createButton("3");
		btn4 = createButton("0");
		btn5 = createButton(".");
		btn6 = createButton("C");

		buttons = new JButton[] { btn1, btn2, btn3, btn4, btn5, btn6 };

		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);

		setDefaultCloseOperation(3);
		setTitle("Simple Calculator");
		setResizable(true);
		setVisible(true);
		setLocationRelativeTo(null);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String clicked = e.getActionCommand();
		JButton btn = (JButton) e.getSource();

		if (e.getActionCommand().equals("C")) {
			txtField.setText("");
		} else if (e.getActionCommand().equals("power")) {
			if (btn.getText().equals("OFF")) {
				btn.setText("ON");
				btn.setBackground(Color.green);
				for (JButton button : buttons) {
					button.setBackground(Color.yellow);
					button.setEnabled(false);
				}
			} else {
				btn.setText("OFF");
				btn.setBackground(Color.red);
				for (JButton button : buttons) {
					button.setBackground(Color.black);
					button.setEnabled(true);
				}
			}
		} else {
			if (clicked.equals(".")) {
				if (txtField.getText().length() > 0) {
					if (!txtField.getText().contains(".")) {
						txtField.setText(txtField.getText() + clicked);
					}

				} else
					txtField.setText("0.");
			} else if (txtField.getText().equals("0")) {
				txtField.setText(clicked);
			}

			else
				txtField.setText(txtField.getText() + clicked);

		}
	}

	JButton createButton(String key) {

		JButton btn = new JButton(key);
		btn.setFocusable(false);
		btn.setForeground(Color.white);
		btn.setBackground(Color.black);
		btn.setFont(font);
		btn.addActionListener(this);

		return btn;
	}

	public static void main(String[] args) {
		new Calc();
	}

}
