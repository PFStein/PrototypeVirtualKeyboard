package gui.keytype;
/**
 * @author Patrick Stein
 */


import javax.swing.JButton;

import gui.mouse.MouseMotionDemo;
import gui.vistor.KeyboardVistor;

public abstract class KeyboardButton extends JButton{

	public KeyboardButton(String buttonName) {
		// TODO Auto-generated constructor stub
		super(buttonName);
		this.addMouseMotionListener(new MouseMotionDemo());
	}

	public abstract void accept(KeyboardVistor v);

}
