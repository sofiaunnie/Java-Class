package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;


public class newKeyBoard extends JFrame implements ActionListener {
	
	static Color frameColor = Color.blue;
	static Color btnBg = Color.black;
	static Color btnFg = Color.yellow;
	static Color panelColor = Color.black;
	
	String[] countries = {"FRANCE", "ISRAEL","ALGERIA","MADAGASCAR","TOGO","LIBYA","NIGERIA","CANADA",
			"UGANDA","AMERICA","POLAND"};
	
	JLabel label1 = new JLabel("Random Country: ");
	JTextField textf = new JTextField(45);
	
	String country, dashes;
	
	JLabel label2 = new JLabel("Dashed Label: ");
	
	
	private JButton createButton(String txt) {
		JButton btn = new JButton(txt);
		btn.setFocusable(false);
		btn.setBackground(btnBg);
		btn.setForeground(btnFg);
		btn.addActionListener(this);
		btn.setFont(new Font("Ink Free",Font.BOLD, 30));
		return btn;
	}
	
   private JPanel createAddButtons(String [] letters) {
	   JPanel panel = new JPanel();
	   panel.setBackground(panelColor);
	   
	   for(String letter : letters) {
		   JButton btn = createButton(letter);
		   panel.add(btn);
	   }
	   return panel;
   }
   
   JButton generate, exit;
   
	private void loadText() {
		Random rd = new Random();
		int num = rd.nextInt(0, countries.length);
		country = countries[num];
		country = country.toUpperCase();
		
		int len = country.length();
		String dashes = "", wrong = "";
		for(int j = 0; j < len; j++) {
			dashes += "-";
		}
		
		label1.setText(country);
		label2.setText(dashes);
	}
	
   public void actionPerformed(ActionEvent e) {
	   if(e.getSource() == generate)
		   loadText();
	   else if(e.getSource() == exit) {
		   int option = JOptionPane.showConfirmDialog(null,"Sure to Exit ?", "Exit Page",
				   JOptionPane.YES_NO_CANCEL_OPTION
				   );
		   if(option == JOptionPane.YES_OPTION)
			   System.exit(0);
	   }
	   else if(e.getActionCommand() == "CL" ) {
		   
		   textf.setText(null);
	   }
      else if(e.getActionCommand() == "<<" ) {
		   
    	  String getText = textf.getText();
//    	  try {
//    		  int num = getText.length() - 1;
//        	  String newText = getText.substring(0, num);
//
//    		   textf.setText(newText);
//			
//		} catch (StringIndexOutOfBoundsException e2) {
//			JOptionPane.showInternalMessageDialog(null, "No text on the TextField");
//		}
    	  
    	if(textf.getText().length() > 0) { 
      	  String newText = getText.substring(0, getText.length() - 1);

  		   textf.setText(newText);
    	}
    
		    
	   }
	   else {
		   JButton btn = (JButton)e.getSource();
		   String letter = btn.getText();
		   btn.setEnabled(false);;
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
		   textf.setText(textf.getText() + letter);
	   }
	   
   }

	public newKeyBoard() {
		
		String [] firstRowLetters = {"Q","W","E","R","T","Y","U","I","O","P","<<"};
		setLayout(new BorderLayout());

		 JPanel firstRow = createAddButtons(firstRowLetters);
//		add(firstRow, BorderLayout.SOUTH);
		
		String [] SecondRowLetters = {"A","S","D","F","G","H","J","K","L"};
		JPanel secondRow = createAddButtons(SecondRowLetters);
//		add(firstRow, BorderLayout.SOUTH);
		
		String [] ThirdRowLetters = {"Z","X","C","V"," ","B","N","M","CL"};
		JPanel thirdRow = createAddButtons(ThirdRowLetters);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(3,1));
		
		panel.add(firstRow);
		panel.add(secondRow);
		panel.add(thirdRow);
		
		//Load Default Country
		loadText();
		
		
		JPanel panel2 = new JPanel();
		add(panel2, BorderLayout.NORTH);
		panel2.setBackground(frameColor);
		panel2.setLayout(new GridLayout(1,4));
		
		 generate = createButton("Generate: ");
		 exit = createButton("Exit");

		
		
		label1.setForeground(Color.black);
		label1.setFont(new Font("Ink Free", Font.BOLD, 20));
		
		label2.setForeground(Color.black);
		label2.setFont(new Font("Ink Free", Font.BOLD, 20));
		label2.setHorizontalAlignment(JLabel.CENTER);
	
		panel2.add(generate);
		panel2.add(label1);
		panel2.add(label2);
		panel2.add(exit);
		
		
		JPanel panel3 = new JPanel();
		add(panel3, BorderLayout.CENTER);
		panel3.setBackground(frameColor);
		
		textf.setVisible(true);
		textf.setForeground(Color.black);
		panel3.add(textf);
		
		setTitle("Keyboard");
		setVisible(true);
		getContentPane().setBackground(frameColor);
		pack();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new newKeyBoard();
	}
}
