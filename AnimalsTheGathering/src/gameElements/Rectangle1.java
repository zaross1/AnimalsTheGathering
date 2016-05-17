package gameElements;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.event.MouseInputListener;

public class Rectangle1 extends Rectangle implements MouseListener, MouseInputListener {
		
	
	public Rectangle1(int x, int y, int width, int height) {
		super( x,  y,  width,  height);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		/*
		Object source = e.getSource();
		
		if (source instanceof Rectangle1) {
			System.out.print(source);
		}
		
		*/
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
