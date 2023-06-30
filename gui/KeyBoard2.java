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

public class KeyBoard2 extends JFrame implements ActionListener {

	Color frameColor = Color.blue;
	Color btnBg = Color.yellow;
	Color btnFg = Color.black;
	Color panelColor = Color.black;
	Color labelFg = Color.white;

	int keyBoardPanelCount = 0;

	JTextField txtField;
	JLabel label1, label2;
	JButton generate, exit;

	String[] countries = { "Mauritania", "Nigeria", "Malaysia", "Dubai", "India", "Turkey", "Afghanistan", "Russia",
			"Israel", "Iran", "Brazil", "France", "England", "Portugal", "Argentina" };
	
	String country, dashes;

	public KeyBoard2() {

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

		centerPanel.add(txtField);
		txtField.setFont(createButton("erdtfgh").getFont());

		add(northPanel, BorderLayout.NORTH);
		northPanel.add(generate);
		northPanel.add(label1);
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

		// FRAME PROPERTIES
		setTitle("Keyboard");
		setVisible(true);
		setSize(500, 500);
		getContentPane().setBackground(frameColor);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

	}

	private void loadText() {
		Random rd = new Random();
		int num = rd.nextInt(0, countries.length);
		String country = countries[num];
		country = country.toUpperCase();

		int len = country.length();
		String dashes = "", wrong = "";
		for (int j = 0; j < len; j++) {
			dashes += "-";
		}
		label1.setText(country);
		label2.setText(dashes);
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
		new KeyBoard2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

//		if (e.getActionCommand().equals("Generate"))
		if (e.getSource() == generate)
			loadText();
		else if (e.getSource() == exit) {
			int option = JOptionPane.showConfirmDialog(null, "Sure to Exit? ", "Exit Page",
					JOptionPane.YES_NO_CANCEL_OPTION);

			if (option == JOptionPane.YES_OPTION)
				System.exit(0);
//			JOptionPane.showMessageDialog(null, option);
		} else {
			if (e.getActionCommand().equals("CX"))
				txtField.setText("");
			else if (e.getActionCommand().equals("<<")) {
				
				if (txtField.getText().length() > 0) {
					//Method 1
//				StringBuilder build = new StringBuilder(txtField.getText());
//				build.deleteCharAt(txtField.getText().length()-1);
//				System.out.println("New text:" + build);
//				txtField.setText(build.toString());

					// Method 2
//					String OldText = txtField.getText();
//					String NewText = OldText.substring(0, OldText.length() - 1);
//					txtField.setText(NewText);
					
					//Method3
					String oldText = txtField.getText();
					txtField.setText(
							oldText.length() != 0 
							? oldText.substring(0, oldText.length() - 1) : "");
				}
			} else { 
				JButton btn = (JButton)e.getSource();
			   String letter = btn.getText();
			   btn.setEnabled(false);
			   if(country.contains(letter)) {
				   String replaceDashes  = "";
				   String dashes =label2.getText();
					for (int a =0; a <dashes.length(); a++) {
						if (letter.charAt(0) == country.charAt(a)) {
							replaceDashes += letter;
						}else {
							replaceDashes += dashes.charAt(a);
						}
					}
				   btn.setBackground(Color.orange);
				   label2.setText(replaceDashes);
			   }else {
				   btn.setBackground(Color.red);
			   }
			txtField.setText(txtField.getText() + letter);
			}
				
//				txtField.setText(txtField.getText() + e.getActionCommand());
		}
	}
}
