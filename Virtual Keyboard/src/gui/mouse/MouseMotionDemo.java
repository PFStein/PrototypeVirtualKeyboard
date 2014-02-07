package gui.mouse;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MouseMotionDemo extends JPanel implements MouseMotionListener{

	private LinkedList<Point> swipePoints = new LinkedList<Point>();

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
		Point p = new Point(e.getX(),e.getY());
		swipePoints.add(p);
		System.out.println(p);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
