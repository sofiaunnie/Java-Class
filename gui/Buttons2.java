package gui;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons2 extends JFrame {

	Color frameColor = Color.blue, redColor = Color.red;
	Color magentaColor = Color.magenta, yellowColor = Color.yellow;
	Color resetColor = Color.blue, panelColor = Color.black;
	Color btnFg = Color.black;

	int btnCount = 0;
	JButton [] buttons;

	public Buttons2() {

		setLayout(new BorderLayout());
		buttons = new JButton[4];

		// North panel

		JPanel northPanel = new JPanel();
		northPanel.setBackground(panelColor);
		northPanel.setLayout(new GridLayout(btnCount, 1));

		JButton redBtn = createButton("Red", redColor);
		JButton yellowBtn = createButton("Yellow", yellowColor);
		JButton magentaBtn = createButton("Magenta", magentaColor);
		JButton resetBtn = createButton("Reset", resetColor);

//		buttons = { redBtn, yellowBtn, magentaBtn, resetBtn };
		buttons[0] = redBtn;
		buttons[1] = yellowBtn;
		buttons[2] = magentaBtn;
		buttons[3] = resetBtn;

		redBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				applyColor(redColor);
			}
		});

		yellowBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				applyColor(yellowColor);
			}
		});

		magentaBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				applyColor(magentaColor);
			}
		});

		resetBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetBtn.setBackground(resetColor);
				yellowBtn.setBackground(yellowColor);
				redBtn.setBackground(redColor);
				magentaBtn.setBackground(magentaColor);
			}
		});

		add(northPanel, BorderLayout.NORTH);
		northPanel.add(redBtn);
		northPanel.add(yellowBtn);
		northPanel.add(magentaBtn);
		northPanel.add(resetBtn);

		// FRAME PROPERTIES
		setTitle("Keyboard");
		setVisible(true);
		setSize(500, 500);
		getContentPane().setBackground(frameColor);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

	}

	private JButton createButton(String txt, Color color) {

		JButton btn = new JButton(txt);

		btn.setFocusable(false);
		btn.setForeground(btnFg);
		btn.setBackground(color);
		btn.setFont(new Font("Ink Free", Font.BOLD, 30));

		btnCount++;

		return btn;
	}

	public static void main(String[] args) {
		new Buttons2();
	}

	private void applyColor(Color color) {
		for (JButton btn : buttons)
			btn.setBackground(color);
	}

}
