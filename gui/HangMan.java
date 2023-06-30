package gui;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HangMan extends JFrame implements ActionListener{

	Color frameColor = Color.blue;
	Color btnBg = Color.yellow;
	Color btnFg = Color.black;
	Color panelColor = Color.black;
	Color labelFg = Color.white;

	int keyBoardPanelCount = 0;
	String country, dashes;

	JTextField txtField;
	JLabel label1, label2;
	JButton generate, exit;
	
	JButton [] buttons;
	int btnIndex = 0;
	int wrongAttempts = 0;

	String[] countries = { "Algeria","Afghanistan","Australia","Madagascar","South Korea", "London", "Canada", "America","Argentina",
            "France","England", "Brazil", "Italy", "Mauritaus", "Malaysia", "Isreal" , "France", "Iran", "Porteguese",
            "Turkey", "Isreal", "Uganda","Mauritania", "Nigeria", "Dubai", "India", "Turkey",  "Russia",
			"Portugal", "Argentina" };

	public HangMan() {

		buttons = new JButton[28];
		setLayout(new BorderLayout());

		// North panel

		JPanel northPanel = new JPanel();
		northPanel.setBackground(frameColor);
		northPanel.setLayout(new GridLayout(1, 4));

		label1 = createLabel("Random Country:");
		label2 = createLabel("dashed label");

		generate = createButton("Generate");
		generate.addActionListener(this);

		exit = createButton("exit");
		exit.addActionListener(this);

		JPanel centerPanel = new JPanel();
		add(centerPanel, BorderLayout.CENTER);
		centerPanel.setBackground(panelColor);

		txtField = new JTextField(20);
		txtField.setBackground(Color.black);
		txtField.setForeground(Color.white);
		txtField.setCaretColor(Color.green);

//		centerPanel.add(txtField);
		txtField.setFont(createButton("erdtfgh").getFont());

		add(northPanel, BorderLayout.NORTH);
//		northPanel.add(generate);
//		northPanel.add(label1);
		northPanel.add(label2);
		northPanel.add(exit);

		// South Panel

		// FIRST ROW LETTERS
		String[] firstRowLetters = { "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "<<" };
		JPanel firstRow = createThenAddButtons(firstRowLetters);
//		add(firstRow, BorderLayout.SOUTH);

		// SECOND ROW LETTERS
		String[] secondRowLetters = { "A", "S", "D", "F", "G", "H", "J", "K", "L", "CX" };
		JPanel secondRow = createThenAddButtons(secondRowLetters);
//		add(secondRow, BorderLayout.SOUTH);

		// SECOND ROW LETTERS
		String[] thirdRowLetters = { "Z", "X", "C", "V", "B", "N", "M" };
		JPanel thirdRow = createThenAddButtons(thirdRowLetters);

		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(keyBoardPanelCount, 1));

		panel.add(firstRow);
		panel.add(secondRow);
		panel.add(thirdRow);

		// on-load methods
		loadText();

		// FRAME PROPERTIES
		addWindowListener(new BackToMainMenu());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Keyboard");
		setVisible(true);
		getContentPane().setBackground(frameColor);
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

	private JPanel createThenAddButtons(String[] letters) {
		JPanel panel = new JPanel();
		keyBoardPanelCount++;
		panel.setBackground(panelColor);

		for (String key : letters) {
			JButton btn = createButton(key);
			btn.addActionListener(this);
			panel.add(btn);
			
			buttons[btnIndex] = btn;
			btnIndex++;
		}

		return panel;
	}

	private JLabel createLabel(String txt) {

		JLabel label = new JLabel(txt);
		label.setForeground(labelFg);
		label.setFont(new Font("Ink Free", Font.BOLD, 30));
		label.setHorizontalAlignment(JLabel.CENTER);

		return label;
	}

	public static void main(String[] args) {
		new HangMan();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == exit) {
			int option = JOptionPane.showConfirmDialog(null, "Sure to exit?");
			if (option == JOptionPane.YES_OPTION) {
//				System.exit(0);
				dispose();
			}
		} else if (e.getSource() == generate) {
			loadText();
		} else {
			String letter = e.getActionCommand();
			String oldText = txtField.getText();

			if (letter.equals("CX"))
				txtField.setText("");
			else if (letter.equals("<<")) {
				txtField.setText(oldText.length() > 0 ? oldText.substring(0, oldText.length() - 1) : "");
//				if (oldText.length() > 0)
//					txtField.setText(oldText.substring(0, oldText.length() - 1));
			} else {
				JButton button = (JButton) e.getSource();
				button.setEnabled(false);

				if (country.contains(letter)) {
					button.setBackground(Color.blue);
					String dashes = label2.getText();
					String replaceDashes = "";
					for (int i = 0; i < country.length(); i++) {
						if (country.charAt(i) == letter.charAt(0))
							replaceDashes += letter;
						else 
							replaceDashes += dashes.charAt(i);
						label2.setText(replaceDashes);
					}

					if (country.equals(replaceDashes)) {
						JOptionPane.showMessageDialog(null, "Level completed");
						loadText();
					}
					txtField.setText(oldText + e.getActionCommand());
				} else {
					wrongAttempts++;
					button.setBackground(Color.red);
					if (wrongAttempts > 5) {
						JOptionPane.showMessageDialog(null, 
								"Game over\nGuess is: " + country);
						loadText();
					}
				}
			}
		}
	}

	private void loadText() {
		wrongAttempts = 0;
		Random rd = new Random();
		int rdIndex = rd.nextInt(countries.length);
		country = countries[rdIndex].toUpperCase();

		label1.setText(country);
		String dashes = "";
		for (int i = 0; i < country.length(); i++)
			dashes += "-";
		label2.setText(dashes);
		
		for (JButton b : buttons) {
			b.setBackground(btnBg);
			b.setForeground(btnFg);
			b.setEnabled(true);
		}
		txtField.setText("");
		
	}

}

