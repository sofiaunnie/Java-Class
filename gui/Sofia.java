package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Sofia extends JFrame implements ActionListener, KeyListener {
	
	JTextField txt;
	JComboBox <String> comboBox;
	JList<String> list;
	JRadioButton male, female;
	JPanel panel1;
	JCheckBox sql, py, android;
	
	public void keyTyped(KeyEvent e) {
//		System.out.println(e.getKeyChar() + "key typed");
//		System.out.println("Key T Char: " + e.getKeyChar());
//		System.out.println("Key T Coder: " + e.getKeyCode());
	
	}
	
	public void keyReleased(KeyEvent e) {
//		System.out.println(e.getKeyChar() + "key released");
	}
	
	public void keyPressed(KeyEvent e) {
//		System.out.println("Key P Char: " + e.getKeyChar());
//		System.out.println("Key P Code: " + e.getKeyCode());
		System.out.println(e.getKeyChar() + "key pressed");
		
		try {
		int num = Integer.valueOf(String.valueOf(e.getKeyChar()));
			System.out.println(num);
		} catch (NumberFormatException nf) {
			JOptionPane.showMessageDialog(null, "Stop There!!!");
			txt.setText(" ");
			}
		}
	
	private JButton createButton(String text) {
		JButton btn = new JButton(text);
		btn.setFont(new Font("Ink Free", Font.ITALIC, 25));
		btn.setBackground(Color.black);
		btn.setForeground(Color.yellow);
		return btn;
	}
	
	private JTextField createTextField(int i) {
	    txt = new JTextField(i);
		txt.setFont(new Font("Ink Free", Font.ITALIC, 25));
		txt.setBackground(Color.black);
		txt.setForeground(Color.yellow);
		txt.setCaretColor(Color.green);
		return txt;
		
	}
	
	private JLabel createLabel(String text) {
		JLabel label = new JLabel(text);
		label.setForeground(Color.green);
		
		return label;
	}

	Sofia() {
		
//		Using Null Layout
//		When using null layout you configure it your self. e.g 
		
//		JPanel panel = new JPanel();
//		panel.setBackground(Color.BLUE);
		
//		panel.setLayout(null);
//		
//		JButton btn1 = createButton("Click");
//		btn1.setBounds(20, 30, 100, 25);
//		panel.add(btn1);
//		
//		JButton btn2 = createButton("Click");
//		btn2.setBounds(125, 30, 100, 25);
//		panel.add(btn2);
//		
//		add(panel);
		

		JTabbedPane pane = new JTabbedPane ();
		add(pane);
		
//		add(new JPanel().add(createButton("Label 1 in pane 1")));
		
		panel1 = new JPanel();
		
		sql = new JCheckBox();
		sql.setText("S-Q-L");
		panel1.add(sql);
		
		py = new JCheckBox("Python");
		panel1.add(py);
		
		android = new JCheckBox("Android",  true);
		panel1.add(android);
		
		list = new JList<String>(); 
		String people [] = {
				"David", "Tobi", "Sofiat", "Mickey"
					};
		
		list.setListData(people);
		panel1.add(list);
		
		comboBox = new JComboBox <String>(people);
		panel1.add(comboBox);
		
		JTextField txt = createTextField(20);
		panel1.add(txt);
		txt.addKeyListener(this);
		
	
		JButton label1 = createButton("Label 1 in pane 1");
		panel1.add(label1);

		txt.addFocusListener(new FocusListener() {
			public void focusGained (FocusEvent e) {
				label1.setText("Focus Gained");
			}
			public void focusLost (FocusEvent e) {
				label1.setText("Focus Lost");
			}
		});
		
		JTextField txt2 = new JTextField(5);
		panel1.add(txt2);
		
 		JPanel panel2 = new JPanel();
		JButton label2 = createButton("Label 2 in pane 2");
		panel2.add(label2);
		
		pane.add(panel1,"First Panel");
		pane.add(panel2,"Second Panel");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu source = new JMenu("Source");

		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(source);

		JMenuItem _new = new JMenuItem("New");
		JMenuItem open = new JMenuItem("Open File");
		JMenu recent = new JMenu("Recent Files...");

		file.add(_new);
		file.add(open);
		file.add(recent);

		JMenuItem recent1 = new JMenuItem("Recent 1");
		JMenuItem recent2 = new JMenuItem("Recent 2");
		JMenuItem recent3 = new JMenuItem("Recent 3");

		recent.add(recent1);
		recent.add(recent2);
		recent.add(recent3);
		
		male = new JRadioButton("MALE");
		male.addActionListener(this);
		male.setSelected(true);
		
		female = new JRadioButton("FEMALE");
		female.addActionListener(this);
		female.setSelected(true);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(male);
		bg.add(female);

		panel1.add(male);
		panel1.add(female);
		
		JButton submit = createButton("Submit");
		panel1.add(submit);
		
//		Frame Properties
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Main Menu");
		pack();
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		new Sofia();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	JLabel label1 = createLabel("Combo" + comboBox.getItemAt(comboBox.getSelectedIndex()));	
	JLabel label2 = createLabel("List" + list.getSelectedValue());
	JLabel label3 = createLabel("Numbers" + txt.getText());
	
	JLabel label4, label5;
	
	String courseName = "Courses";
	label4 = createLabel(courseName);
	
	if (sql.isSelected()) {
		courseName += sql.getText();
		label4.setText(courseName);
	}
	if (py.isSelected()) {
		courseName += py.getText();
		label4.setText(courseName);
	}
	if (android.isSelected()) {
		courseName += android.getText();
		label4.setText(courseName);
	}
	panel1.add(label4);
	
	if (male.isSelected()) {
		label5 = createLabel("Gender : Male");
		panel1.add(label5);
	} else if (female.isSelected()) {
		label5 = createLabel("Gender : Female");
		panel1.add(label5);
	} else {
		label5 = createLabel("Gender : Unknown");
		panel1.add(label1);
		panel1.add(label2);
		panel1.add(label3);
		
	}
	
	
		
	
	}
}
