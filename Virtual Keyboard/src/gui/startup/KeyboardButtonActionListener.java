package gui.startup;
/**
 * @author Patrick Stein
 */
import gui.keytype.KeyboardButton;
import gui.vistor.DemoKeyboardVistor;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class KeyboardButtonActionListener implements ActionListener {
	
	private JTextArea outputArea;
	private DemoKeyboardVistor keyVistor;
	
	public KeyboardButtonActionListener(JTextArea newOutputArea){
		outputArea = newOutputArea;
		keyVistor = new DemoKeyboardVistor(outputArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Get the button
		KeyboardButton btn = (KeyboardButton) e.getSource();
		Rectangle r = btn.getBounds();
		System.out.println(r);
		//Determine the appropriate action through the vistor
		btn.accept(keyVistor);
	}
}
