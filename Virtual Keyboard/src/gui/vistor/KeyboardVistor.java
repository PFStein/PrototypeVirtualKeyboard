package gui.vistor;
/**
 * @author Patrick Stein
 */
import gui.keytype.BackspaceButton;
import gui.keytype.CharacterButton;
import gui.keytype.SpaceButton;

public interface KeyboardVistor {
	
	public void visit(CharacterButton b);
	
	public void visit(BackspaceButton b);

	public void visit(SpaceButton b);

}
