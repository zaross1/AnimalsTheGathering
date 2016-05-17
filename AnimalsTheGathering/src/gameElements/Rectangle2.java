package gameElements;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

import cards.Card;

public class Rectangle2 extends JComponent implements MouseListener {
			private Player player1 = null;
			private int x;
			private int y;
			private boolean inHand = false; // used to keep track of whether this rectangle is in the hand section
			private Card myCard = null;
			private Color fontColor = Color.BLACK;
			private String location;
			private boolean select = false;
			private boolean player = true; // tracks whether rectangle is for player or computer
			
	public Rectangle2(int width, int height, String location) {
		this.setPreferredSize(new Dimension(width, height));
		this.x = width;
		this.y = height;
		this.location = location;
		addMouseListener(this); 
		
	}
	
	public boolean getInHand() {
		return this.inHand;
	}
	
	public void setInHand(boolean bool) {
		inHand = bool;
	}
	

	public boolean getSelect() {
		return this.select;
	}
	
	
	
	public boolean getPlayer() {
		return this.player;
	}
	
	public void setPlayer(Boolean bool) {
		this.player = bool;
	}
	
	
	public void setColor(Color myColor) {
		this.fontColor = myColor;
	}
	
	public void setCard(Card card) {
		this.myCard = card;
	}
	
	public Card getCard() {
		return this.myCard;
	}
	
	public void removeCard() {
		this.myCard = null;
	}
	
	  @Override
	    protected void paintComponent(Graphics g) {
	        g.setColor(fontColor);
	       
	        Graphics2D g2d = (Graphics2D) g;
	        int x = 0;
	        int y = 0;
	        int width = this.getWidth() - 1;
	        int height = this.getHeight() - 1;
	        
	        if (this.getPlayer()) {
	        	
	        	if (this.getSelect() ) g.setColor(Color.RED);
		        else if (myCard != null) {
		        	g.setColor(Color.BLUE);
		        	
		        }
		        else g.setColor(Color.BLACK); 
	        	
	        } else {
	        	
	        	
		        if (myCard != null) {
		        	g.setColor(Color.MAGENTA);
		        	
		        }
		        
		        else g.setColor(Color.BLACK); 
	        }
	        
	        g2d.draw(new Rectangle(x, y, (width - 10), (height - 4))    );
	        
	     
	        
	    }

	@Override
	public void mouseClicked(MouseEvent e) {
		
		if (this.myCard != null) {
			if (this.select) this.select = false;
			else this.select = true;
		
		if (this.getPlayer()  && this.myCard != null)  {
			// if (getInHand() ) {
				 
			//	 GameController.turnIsClickedOff(player1.getHand().getHand());
			   //	 GameController.turnIsSelectedOff(player1.getHand().getHand());
			// }
			myCard.toggleIsClicked();
			
			
			
			
			
		}
		
		
		
		this.repaint();
		}
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


	public void setSelect(boolean b) {
		this.select = b;
		
	}	
	
	public void setPlayer1(Player player) {
		this.player1 = player;
	}
	
	public Player getPlayer1() {
		return this.player1;
	}
	
	
	
	
	
	}


	
	
	

