package gui.startup;
/**
 * @author Patrick Stein
 */


import java.awt.EventQueue;

public class KeyboardDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                KeyboardPrototype gui = new KeyboardPrototype();
            }
        });

	}

}
