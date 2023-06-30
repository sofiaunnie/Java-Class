package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class KeyBoard3 extends JFrame {

	Color frameColor = Color.blue;
	Color btnBg = Color.yellow;
	Color btnFg = Color.black;
	Color panelColor = Color.black;

	int KeyboardPanelCount = 0;

	String[] countries = {"Algeria","Afghanistan","Australia","Madagascar","South Korea", "London", "Canada", "America","Argentina",
            "France","England", "Brazil", "Italy", "Mauritaus", "Malaysia", "Isreal" , "France", "Iran", "Porteguese",
            "Turkey", "Isreal", "Uganda"};

	public KeyBoard3() {

		setLayout(new BorderLayout());

//		North Panel

		JPanel northpanel = new JPanel();
		northpanel.setBackground(frameColor);
		northpanel.setLayout( new GridLayout(1,3));
		
		JLabel label1 = new JLabel ("Random Country: ");
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setForeground(Color.white);
		label1.setFont(new Font("Ink Free", Font.BOLD, 30));
		
		JLabel label2 =  new JLabel ("dashed label ");
		label2.setForeground(Color.white);
		label2.setFont(new Font("Ink Free", Font.BOLD, 30));
		
		JButton generate = createButton("Generate");
		northpanel.add(generate);

		northpanel.add(label1);
		northpanel.add(label2);
		generate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Random rd = new Random();
				int num = rd.nextInt(0,countries.length);
				String country = countries[num];
				country = country.toUpperCase();
				
				int len = country.length();
				String dashes = "" , wrong = "";
				for (int j = 0; j < len; j++) {
					dashes += "-";
			}
				label1.setText(country);
				label2.setText(dashes);
			
			}});
		
		add(northpanel, BorderLayout.NORTH);
		
//		South Panel


//		JPanel firstRow = new JPanel();
//		firstRow.setBackground(panelColor);
//		add(firstRow, BorderLayout.SOUTH);
//		
//		JButton btnQ = createButton("Q");
//		firstRow.add(btnQ);
//		
//		JButton btnW = createButton("W");
//		firstRow.add(btnW);
//		
//		JButton btnE = createButton("E");
//		firstRow.add(btnE);

//		FIRST ROW LETTERS
		String[] firstRowLetters = { "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P" };
		JPanel firstRow = createThenAddButtons(firstRowLetters);
		add(firstRow, BorderLayout.SOUTH);

//		SECOND ROW LETTERS
		String[] secondRowLetters = { "A", "S", "D", "F", "G", "H", "J", "K", "L" };
		JPanel secondRow = createThenAddButtons(secondRowLetters);
		add(secondRow, BorderLayout.SOUTH);

//		THIRD ROW LETTERS
		String[] thirdRowLetters = { "Z", "X", "C", "V", "B", "N", "M" };
		JPanel thirdRow = createThenAddButtons(thirdRowLetters);
		add(thirdRow, BorderLayout.SOUTH);

		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);

		panel.add(firstRow);
		panel.add(secondRow);
		panel.add(thirdRow);
		panel.setLayout(new GridLayout(KeyboardPanelCount, 1));

//		FRAME PROPERTIES
		setTitle("Keyboard");
		setVisible(true);
		setSize(500, 500);
		getContentPane().setBackground(frameColor);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}


//	private JLabel createLabel (String name) {
//		JLabel label = new JLabel();
//		label.setHorizontalAlignment(JLabel.CENTER);
//		label.setForeground(Color.white);
//		label.setFont(new Font("Ink Free", Font.BOLD, 30));
//	}

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
		KeyboardPanelCount++;
		panel.setBackground(panelColor);

		for (String key : letters) {
			JButton btn = createButton(key);
			panel.add(btn);
		}
		return panel;
	}

	public static void main(String[] args) {
		new KeyBoard3();
	}
	

	}
	

