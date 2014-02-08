package gui.startup;
/**
 * @author Patrick Stein
 */
import gui.keytype.KeyboardButton;
import gui.vistor.DemoKeyboardVistor;
import gui.vistor.KeyboardTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class KeyboardButtonActionListener implements ActionListener {
	
	private DemoKeyboardVistor keyVistor;
	
	public KeyboardButtonActionListener(KeyboardTextArea newOutputArea){
		
		keyVistor = new DemoKeyboardVistor(newOutputArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Get the button
		KeyboardButton btn = (KeyboardButton) e.getSource();
		//Determine the appropriate action through the vistor
		btn.accept(keyVistor);
	}
}
