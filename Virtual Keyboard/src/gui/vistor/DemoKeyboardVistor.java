package gui.vistor;
/**
 * @author Patrick Stein
 */
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import gui.keytype.BackspaceButton;
import gui.keytype.CharacterButton;
import gui.keytype.ShiftButton;
import gui.keytype.SpaceButton;

public class DemoKeyboardVistor implements KeyboardVistor{
	
	private KeyboardTextArea outputArea;
	private boolean capsLockOn;
	private int numShift;

	public DemoKeyboardVistor(KeyboardTextArea newOutputArea) {
		// TODO Auto-generated constructor stub
		outputArea = newOutputArea;
		this.capsLockOn = false;
		this.numShift = 0;
	}

	@Override
	public void visit(CharacterButton b) {
		// TODO Auto-generated method stub
		//Put the text in the text box
		this.outputArea.addCharacter(b.getClientProperty("key").toString());
	}

	@Override
	public void visit(BackspaceButton b) {
		// TODO Move function body into a 
		this.outputArea.backspace();
	}

	@Override
	public void visit(SpaceButton b) {
		// TODO Auto-generated method stub
		this.outputArea.addCharacter(" ");
		
	}
	
	@Override
	public void visit(ShiftButton b) {
		// TODO Auto-generated method stub
		this.outputArea.updateCapsLock();
	}
	
}
