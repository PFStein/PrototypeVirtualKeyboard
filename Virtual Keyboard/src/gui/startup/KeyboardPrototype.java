package gui.startup;
/**
 * @author Patrick Stein
 */


import gui.keytype.ButtonFactory;
import gui.keytype.KeyboardButton;
import gui.keytype.KeyboardButtonFactory;
import gui.mouse.MouseMotionDemo;
import gui.vistor.KeyboardTextArea;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class KeyboardPrototype extends JFrame {
	
	private JFrame frame = new JFrame("Demo keyboard");
    //Grid layout changes the space between buttons
    private JPanel parent = new JPanel(new GridLayout(0, 1));
    //Text area
    private KeyboardTextArea textArea;
    //Buttons
    private KeyboardButton[][] buttons;
    //Panels
    private JPanel keyboardPanels[];
    
    private final ButtonFactory keyFactory = new KeyboardButtonFactory();

    private static final String[][] key = { 
    	   {"Backspace","Space","Shift"},
    	   {"Q", "W", "E", "R", "T", "Y", "U", "I", "O","P"},
    	   {"A","S","D","F","G","H","J","K","L"},
    	   {"Z","X","C","V","B","N","M"}
    	   };
    
    
    public KeyboardPrototype(){
    	
    	//constants must be changed
    	super("Demo keyboard");
    	initComponents();
    	
    }
    
    private void initComponents() {
    	
    	//frame.addMouseMotionListener(new MouseMotionDemo());
    	this.keyboardPanels = new JPanel[key.length];
    	//add a text area
    	this.textArea = new KeyboardTextArea();
    	parent.add(textArea);
    	//Create all of the virtual keyboard buttons
    	createAllButtons();  
    	//Create mouse listener
    	initMouseListener();
    	//Wrap up
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(parent);
        pack();
        setVisible(true);    	
    	
    }
    
    private void initMouseListener(){
    	MouseMotionDemo m = new MouseMotionDemo();
    	parent.addMouseMotionListener(m);
    	
    }
    
    private void createAllButtons() {
    	for(int row = 0; row < key.length; row++){
    		//constants must be changed
    		buttons = new KeyboardButton[20][20];
    		this.keyboardPanels[row] = new JPanel();
    		for(int column = 0; column < key[row].length; column++){
    			createNewButton(row,column);    			
    		}
    		parent.add(this.keyboardPanels[row]);
    	}
    }
    
    private void createNewButton(int row, int column){
    	
    	//create new button
		buttons[row][column] = this.keyFactory.build(key[row][column]);
        
		//add button properties
        buttons[row][column].putClientProperty("column", column);
        buttons[row][column].putClientProperty("row", row);
        buttons[row][column].putClientProperty("key", key[row][column]);
        
        //Give a new listener
        buttons[row][column].addActionListener(new KeyboardButtonActionListener(this.textArea));
        
        //add to the panel
        this.keyboardPanels[row].add(buttons[row][column]);
    	
    }
    
    
}
