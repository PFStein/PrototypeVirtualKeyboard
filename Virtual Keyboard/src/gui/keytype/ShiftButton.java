package gui.keytype;

import gui.vistor.KeyboardVistor;

/**
 * @author Patrick Stein
 */

public class ShiftButton extends KeyboardButton{


	public ShiftButton() {
		// TODO Auto-generated constructor stub
		super("Shift");
	}

	@Override
	public void accept(KeyboardVistor v) {
		// TODO Auto-generated method stub
		v.visit(this);
		
	}

}
