package gui.keytype;
/**
 * @author Patrick Stein
 */
public class KeyboardButtonFactory implements ButtonFactory{

	@Override
	public KeyboardButton build(String buttonName) {
		// TODO Auto-generated method stub
		if(buttonName.equals("Space")){
			return new SpaceButton(buttonName);
		}else if(buttonName.equals("Backspace")){
			return new BackspaceButton(buttonName);
		}else{
			return new CharacterButton(buttonName);
		}
	}

}
