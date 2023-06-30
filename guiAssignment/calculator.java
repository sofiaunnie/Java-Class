package guiAssignment;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame {
	Color frameColor = Color.blue;
	Color btnBg = Color.white;
	Color btnFg = Color.black;
	Color panelColor = Color.blue;

	JTextField txtField;

	int buttonPanelCount = 0;

	JButton[] buttons;
	int btnIndex = 0;

	public calculator() {
		setLayout(new BorderLayout());
		buttons = new JButton[20];

		JPanel Panel = new JPanel();
		add(Panel, BorderLayout.CENTER);
		Panel.setBackground(panelColor);

		txtField = new JTextField(20);
		txtField.setBackground(Color.white);
		txtField.setForeground(Color.black);
		txtField.setCaretColor(Color.black);

		Panel.add(txtField);

		String[] firstRow = { "(", ")", "C", "CE" };
		JPanel firstRow1 = createThenAddButtons(firstRow);

		String[] secondRow = { "7", "8", "9", "÷" };
		JPanel secondRow1 = createThenAddButtons(secondRow);

		String[] thirdRow = { "4", "5", "6", "×" };
		JPanel thirdRow1 = createThenAddButtons(thirdRow);

		String[] fourthRow = { "1", "2", "3", "-" };
		JPanel fouthRow1 = createThenAddButtons(fourthRow);

		String[] fifthRow = { "0", ".", "=", "+" };
		JPanel fifthRow1 = createThenAddButtons(fifthRow);

		JPanel centerpanel = new JPanel();
		add(centerpanel, BorderLayout.SOUTH);
		centerpanel.setLayout(new GridLayout(buttonPanelCount, 1));

		centerpanel.add(firstRow1);
		centerpanel.add(secondRow1);
		centerpanel.add(thirdRow1);
		centerpanel.add(fouthRow1);
		centerpanel.add(fifthRow1);
		
		// FRAME PROPERTIES
		setTitle("Keyboard");
		setVisible(true);
		getContentPane().setBackground(frameColor);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
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

	private JPanel createThenAddButtons(String[] button) {
		JPanel panel = new JPanel();
		buttonPanelCount++;
		panel.setBackground(panelColor);

		for (String key : button) {
			JButton btn = createButton(key);
//			btn.addActionListener(this);
			panel.add(btn);

			buttons[btnIndex] = btn;
			btnIndex++;
		}

		return panel;
	}

	public static void main(String[] args) {
		new calculator();
	}
}
