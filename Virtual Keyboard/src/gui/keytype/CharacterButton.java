package gui.keytype;
/**
 * @author Patrick Stein
 */
import gui.vistor.KeyboardVistor;

public class CharacterButton extends KeyboardButton{

	public CharacterButton(String buttonName) {
		// TODO Auto-generated constructor stub
		super(buttonName);
	}

	@Override
	public void accept(KeyboardVistor v) {
		// TODO Auto-generated method stub
		v.visit(this);		
	}


}
