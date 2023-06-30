package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {
	Font font;
	Color bgColor, fgColor, panelColor;
	JTextField textField;
	JRadioButton off;
	String operators = "*/-+";
	double num1 = 0, num2 = 0, res;

	Calculator() {
		setLayout(new GridLayout());

		font = new Font("Verdana", Font.BOLD, 20);
		bgColor = Color.black;
		fgColor = Color.yellow;
		panelColor = Color.black;

		JPanel panel = new JPanel();

		textField = new JTextField("0", 10);
		textField.setFont(font);
		panel.add(textField);

		JRadioButton on = new JRadioButton("ON");
		on.addActionListener(this);
		on.setSelected(true);

		off = new JRadioButton("OFF");
		off.addActionListener(this);

		ButtonGroup bg = new ButtonGroup();
		bg.add(off);
		bg.add(on);

		panel.add(off);
		panel.add(on);

		// Buttons Panel
		for (int i = 0; i < 9; i++) {
			JButton btn = createButton(i + "");
			panel.add(btn);
		}
		panel.add(createButton("."));

	char[] ops = operators.toCharArray();
	for (char op : ops) {
		panel.add(createButton(op + ""));
	}

	add(panel);
		addWindowListener(new BackToMainMenu());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Calculator Gui");
		setVisible(true);
		pack();
		getContentPane().setBackground(Color.blue);
		setLocationRelativeTo(null);
}

	public static void main(String[] args) {
		new Calculator();
	}

	private JButton createButton(String text) {
	JButton btn = new JButton(text);
	btn.setBackground(bgColor);
	btn.setForeground(fgColor);
	btn.addActionListener(this);
	btn.setFocusable(false);

	return btn;
}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		
		if(action.equalsIgnoreCase("off")) {
			
			textField.setEnabled(false);
			textField.setText("");
			textField.setEditable(false);
		} else if (action.equalsIgnoreCase("on")) {
			
			textField.setEnabled(true);
			textField.setText("0");
		} else {
			if (off.isSelected()) {
				return;
		} else if(action.equals(".")) {
			if (textField.getText().contains("."))
				return;
			else
				textField.setText(textField.getText() + action);
		} else if (textField.getText().equals("0")) {
			textField.setText(action);
		} else {
			
			if (operators.contains(action)) {
				if (num1 == 0)
					num1 = Double.parseDouble(textField.getText());
				else if (num2 == 0)
					num2 = Double.parseDouble(textField.getText());
				System.out.format("num1 : %s, num2 : %s/n", num1, num2 );
				
				textField.setText("0");
			} else 
			
				textField.setText(textField.getText() + action);
		}
		
		}
		
	}

}
