package gui.keytype;
/**
 * @author Patrick Stein
 */
import gui.vistor.KeyboardVistor;

public class SpaceButton extends KeyboardButton{

	public SpaceButton(String buttonName) {
		super(buttonName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(KeyboardVistor v) {
		// TODO Auto-generated method stub
		v.visit(this);
		
	}

}
