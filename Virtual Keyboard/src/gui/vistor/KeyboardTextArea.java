package gui.vistor;

import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class KeyboardTextArea extends JTextArea{
	private CapsLockState state = CapsLockState.OFF;
	private int capsCount = 0;
	
	public void backspace(){
		Document doc = this.getDocument();
		int docLength = doc.getLength();
		try {
			//only do this if the document has something in it
			if(docLength >= 1){
				doc.remove(doc.getLength() - 1, 1);
			}
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void addCharacter(String c){
		// TODO Validate params
		String text = null;
		
		if(state == CapsLockState.OFF){
			text = c.toLowerCase();
		}else if(state == CapsLockState.SHIFT){
			text = c.toUpperCase();
			state = CapsLockState.OFF;
		}else if(state == CapsLockState.ON){
			text = c.toUpperCase();
		}
		this.append(text);
		
	}
	public void updateCapsLock(){
		if(state == CapsLockState.OFF){
			state = CapsLockState.SHIFT;
		}else if(state == CapsLockState.SHIFT){
			state = CapsLockState.ON;
		}else if(state == CapsLockState.ON){
			state = CapsLockState.OFF;
		}
		
	}

}
