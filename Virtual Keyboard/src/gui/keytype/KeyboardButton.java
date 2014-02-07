package gui.keytype;
/**
 * @author Patrick Stein
 */
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JButton;

import gui.mouse.MouseMotionDemo;
import gui.vistor.KeyboardVistor;

public abstract class KeyboardButton extends JButton{
	/**
	 * TODO: Change this serial UID
	 */
	private static final long serialVersionUID = 1L;

	public KeyboardButton(String buttonName) {
		// TODO Auto-generated constructor stub
		super(buttonName);
		this.addMouseMotionListener(new MouseMotionDemo());
	}

	public abstract void accept(KeyboardVistor v);

}
