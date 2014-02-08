package gui.keytype;
/**
 * @author Patrick Stein
 */
public class KeyboardButtonFactory implements ButtonFactory{


	/**
	 * @param buttonName This string can correspond to the spacebar, the backspace key, and any character key on the keyboard.
	 *  Builds an appropriate JButton based on the string input.
	 */
	@Override
	public KeyboardButton build(String buttonName) {
		// TODO Auto-generated method stub
		if(buttonName.equals("Space")){
			return new SpaceButton();
		}else if(buttonName.equals("Backspace")){
			return new BackspaceButton();
		}else if(buttonName.equals("Shift")){
			return new ShiftButton();
		}else{
			return new CharacterButton(buttonName);
		}
	}

}
