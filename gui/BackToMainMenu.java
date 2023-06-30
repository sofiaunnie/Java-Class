package gui;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class BackToMainMenu extends WindowAdapter {

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("window Closed");
		new MainMenu();
		
	}

	
}
