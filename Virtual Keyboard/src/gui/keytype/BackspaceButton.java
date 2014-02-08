package gui.keytype;
/**
 * @author Patrick Stein
 */
import gui.vistor.KeyboardVistor;

public class BackspaceButton extends KeyboardButton{


	/**
	 * Constructor for a JButton that will delete a single character from the JTextArea on each mouse click
	 */
	public BackspaceButton() {
		super("Backspace");
		// TODO Auto-generated constructor stub
	}
	/**
	 * Accept method for the KeyboardVistor. This will allow for dynamic actions to occur based on the class of the button.
	 */
	@Override
	public void accept(KeyboardVistor v) {
		// TODO Auto-generated method stub
		v.visit(this);
		
	}

}
