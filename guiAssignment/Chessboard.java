package guiAssignment;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Chessboard extends JFrame {
	
	Chessboard() {
		
		setLayout(new GridLayout(8, 8));
		
		for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JPanel panel = new JPanel();
                if ((i + j) % 2 == 0) {
                    panel.setBackground(Color.WHITE);
                } else {
                    panel.setBackground(Color.BLACK);
                }
                add(panel);
            }
        }
		
//		FRAME PROPERTIES
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Chessboard GUI");
		pack();
		setLocationRelativeTo(null);
	   
		
	}

	    public static void main(String[] args) {
	      new Chessboard();
	    }

}

