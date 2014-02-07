package gui.vistor;
/**
 * @author Patrick Stein
 */
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import gui.keytype.BackspaceButton;
import gui.keytype.CharacterButton;
import gui.keytype.SpaceButton;

public class DemoKeyboardVistor implements KeyboardVistor{
	
	private JTextArea outputArea;

	public DemoKeyboardVistor(JTextArea newOutputArea) {
		// TODO Auto-generated constructor stub
		outputArea = newOutputArea;
	}

	@Override
	public void visit(CharacterButton b) {
		// TODO Auto-generated method stub
		//Put the text in the text box
		outputArea.append(b.getClientProperty("key").toString().toLowerCase());
	}

	@Override
	public void visit(BackspaceButton b) {
		// TODO Auto-generated method stub
		Document doc = outputArea.getDocument();
		int docLength = doc.getLength();
		try {
			//only do this if the document has something in it
			if(docLength >= 1){
				doc.remove(doc.getLength() - 1, 1);
			}
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			// Should only happen if 
			e.printStackTrace();
		}
	}

	@Override
	public void visit(SpaceButton b) {
		// TODO Auto-generated method stub
		outputArea.append(" ");
		
	}

}
