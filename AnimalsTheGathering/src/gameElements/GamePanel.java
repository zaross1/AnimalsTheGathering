package gameElements;


import javax.swing.*;
import javax.swing.event.MouseInputListener;

import com.rits.cloning.Cloner;

import java.awt.*;
import java.awt.event.*;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import cards.*;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.awt.Font;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.border.TitledBorder;
import net.miginfocom.swing.MigLayout;








 class GamePanel extends JPanel implements MouseListener { 
     
	 private Player player1;
	 private Player player2;
	 private static Cloner cloner= new Cloner();
	 private Rectangle2 hand0 = new Rectangle2(90, 170, "hand0");
	 private Rectangle2 hand1 = new Rectangle2(90, 170, "hand1");
	 private Rectangle2 hand2 = new Rectangle2(90, 170, "hand2");
	 private Rectangle2 hand3 = new Rectangle2(90, 170, "hand3");
	 private Rectangle2 hand4 = new Rectangle2(90, 170, "hand4");
	 private Rectangle2 hand5 = new Rectangle2(90, 170, "hand5");
	 private Rectangle2 hand6 = new Rectangle2(90, 170, "hand6");
	 
	 public Rectangle2 getHand0() {
		 return hand0;
	 }
	 public Rectangle2 getHand1() {
		 return hand1;
	 }
	 
	 public Rectangle2 getHand2() {
		 return hand2;
	 }
	 
	 public Rectangle2 getHand3() {
		 return hand3;
	 }
	 
	 public Rectangle2 getHand4() {
		 return hand4;
	 }
	 
	 public Rectangle2 getHand5() {
		 return hand5;
	 }
	 
	 
	 // row 1, player2 cards
	 
	 private Rectangle2 row0col0 = new Rectangle2(90, 120, "row0col0");
	 private Rectangle2 row0col1 = new Rectangle2(90, 120, "row0col1");
	 private Rectangle2 row0col2 = new Rectangle2(90, 120, "row0col2");
	 private Rectangle2 row0col3 = new Rectangle2(90, 120, "row0col3");
	 private Rectangle2 row0col4 = new Rectangle2(90, 120, "row0col4");
	 private Rectangle2 row0col5 = new Rectangle2(90, 120, "row0col5");
	 private Rectangle2 row0col6 = new Rectangle2(90, 120, "row0col6");
	 
	 // row 2, player2 cards
	 
	 private Rectangle2 row1col0 = new Rectangle2(90, 120, "row1col0");
	 private Rectangle2 row1col1 = new Rectangle2(90, 120, "row1col1");
	 private Rectangle2 row1col2 = new Rectangle2(90, 120, "row1col2");
	 private Rectangle2 row1col3 = new Rectangle2(90, 120, "row1col3");
	 private Rectangle2 row1col4 = new Rectangle2(90, 120, "row1col4");
	 private Rectangle2 row1col5 = new Rectangle2(90, 120, "row1col5");
	 private Rectangle2 row1col6 = new Rectangle2(90, 120, "row1col6");
	 
	 // row 3, player1 cards
	 
	 
	 private Rectangle2 row2col0 = new Rectangle2(90, 120, "row2col0");
	 private Rectangle2 row2col1 = new Rectangle2(90, 120, "row2col1");
	 private Rectangle2 row2col2 = new Rectangle2(90, 120, "row2col2");
	 private Rectangle2 row2col3 = new Rectangle2(90, 120, "row2col3");
	 private Rectangle2 row2col4 = new Rectangle2(90, 120, "row2col4");
	 private Rectangle2 row2col5 = new Rectangle2(90, 120, "row2col5");
	 private Rectangle2 row2col6 = new Rectangle2(90, 120, "row2col6");
	 
	 // row 4, player1 cards
	 
	 
	 private Rectangle2 row3col0 = new Rectangle2(90, 120, "row3col0");
	 private Rectangle2 row3col1 = new Rectangle2(90, 120, "row3col1");
	 private Rectangle2 row3col2 = new Rectangle2(90, 120, "row3col2");
	 private Rectangle2 row3col3 = new Rectangle2(90, 120, "row3col3");
	 private Rectangle2 row3col4 = new Rectangle2(90, 120, "row3col4");
	 private Rectangle2 row3col5 = new Rectangle2(90, 120, "row3col5");
	 private Rectangle2 row3col6 = new Rectangle2(90, 120, "row3col6");
	 
	 
	
	 private GameController gameController;
	 private static Font deckFont = new Font("Comic Sans MS", Font.BOLD, 24);
	 private static Font nameFont = new Font("Comic Sans MS", Font.BOLD, 24);
	 private static Font handFont = new Font("Comic Sans MS", Font.PLAIN, 10);
	 private static Font playerStatsFont = new Font("Comic Sans MS", Font.PLAIN, 16);
	 private static Font smallFont = new Font("Comic Sans MS", Font.PLAIN, 9);
	 private static Color darkGreen = Color.green.darker();
	 private ArrayList<Rectangle2> handRectangles = new ArrayList<Rectangle2>();
	 private ArrayList<Rectangle2> player2InPlayRectangles = new ArrayList<Rectangle2>();
	 private ArrayList<Rectangle2> player1InPlayRectangles = new ArrayList<Rectangle2>();
	 
	 // mana image icons
	 ImageIcon forestIcon = new ImageIcon(createImage("images/manaTree.jpg"));
	 ImageIcon plainsIcon = new ImageIcon(createImage("images/manaPlains.jpg")); 
	 ImageIcon swampIcon = new ImageIcon(createImage("images/manaSwamp.jpg")); 
	 ImageIcon islandIcon = new ImageIcon(createImage("images/manaIsland.jpg")); 
	 ImageIcon mountainIcon = new ImageIcon(createImage("images/manaMountain.jpg")); 
	 ImageIcon wastelandIcon = new ImageIcon(createImage("images/manaColorless.jpg")); 
	 // more button icons
	 ImageIcon clearIcon = new ImageIcon(createImage("images/clearIcon.jpg"));
	 ImageIcon nextPhaseIcon = new ImageIcon(createImage("images/nextPhaseIcon.jpg"));
	 ImageIcon playCardIcon = new ImageIcon(createImage("images/playCardIcon.jpg"));
	 ImageIcon drawIcon = new ImageIcon(createImage("images/drawIcon.jpg"));
	 ImageIcon attackIcon = new ImageIcon(createImage("images/attackIcon.jpg"));
	 ImageIcon blockIcon = new ImageIcon(createImage("images/blockIcon.jpg"));
	 
	 private final JButton forestButton = new JButton("", forestIcon);
	        
	 
	 private final JButton plainsButton = new JButton("", plainsIcon);
	 private final JButton mountainButton = new JButton("", mountainIcon);
	 private final JButton islandButton = new JButton("", islandIcon);
	 private final JButton swampButton = new JButton("", swampIcon);
	 private final JButton wastelandButton = new JButton("", wastelandIcon);
	 
	 private final JButton emptyButton = new JButton("", clearIcon);
	 private final JButton nextPhaseButton = new JButton("", nextPhaseIcon);
	 private final JButton drawButton = new JButton("", drawIcon);
	 private final JButton playCardButton = new JButton("", playCardIcon );
	 private final JButton attackButton = new JButton("", attackIcon);
	 private final JButton blockButton = new JButton("", blockIcon);
	 private final JScrollPane scrollPane = new JScrollPane();
	 private final JTextArea gameText = new JTextArea();
	 
	 public static Cloner getCloner() {
		 return cloner;
	 }
	 
	 public static BufferedImage createImage(String img) {
		 
		 	
		 	BufferedImage myImage = null;
		  try {
			  
			myImage = ImageIO.read(new File(img));
			
		  } catch (IOException e) {
			  System.out.println(e.getMessage());
			 
		  }
		  return myImage;
		 
	  }

	public static void drawCards(Player player, Graphics g, int width, int height, boolean hand, ArrayList<Rectangle2> handRectangles, ArrayList<Rectangle2> player1Rectangles, ArrayList<Rectangle2> player2Rectangles) {
		
		ArrayList<Card> cards;
		int widthFactor;
		int heightFactor;
		
		
		
		
		if (!hand) {
			cards = player.getAllNonLandCardsInPlay();
			widthFactor = (int) (width / 13.4  );
			heightFactor = (int)((height / 3.8) / 1.8);
			
			
			
			
		}
		else {
			cards = player.getHand().getHand();
			widthFactor = width / 12;
			heightFactor = (int)(height / 3.8);
			 for (int k = 0; k < handRectangles.size(); k++)   { // resets card status of rectangle to remove outlines and select
				 handRectangles.get(k).setCard(null);
				
			 }
			
		}
		
		try { 
			
			 
			
			 
			
			
				 
				 
			
			for (int x = 0; x < cards.size(); x++) { // begin loop 1
				
					
					
		
					 
		         	 g.setFont(handFont);
		         	
		         	 if (hand)  {
		         		 cards.get(x).setRectanglePositionInfo(handRectangles.get(x));	
		         	 }
		         	 else if (player.getComputer()){
		         		 g.setColor(Color.MAGENTA);
		         		
		         		 cards.get(x).setRectanglePositionInfo(player2Rectangles.get(x));
		         		 cards.get(x).getRectanglePositionInfo().setPlayer(false);
		         		 
		         	 }
		         	 else {
		         		 
		         		 cards.get(x).setRectanglePositionInfo(player1Rectangles.get(x));
		         	 }
					
		         	 	
		           cards.get(x).getRectanglePositionInfo().setCard(cards.get(x)); 
      		       cards.get(x).getRectanglePositionInfo().setColor(Color.BLUE);
      		       cards.get(x).toolTipStatus(); // sets toolTip
      		      
      		       // draws card name
      		       g.drawString(cards.get(x).getName(), ((int)cards.get(x).getRectanglePositionInfo().getX() + (width / 150)), ((int)cards.get(x).getRectanglePositionInfo().getY() + (height / 50)));
		         
      		       
      		        if (cards.get(x).getImage() != null) { // draws card image
            			  
            			  g.drawImage(cards.get(x).getImage(), ((int)cards.get(x).getRectanglePositionInfo().getX() + width / 140), ((int)cards.get(x).getRectanglePositionInfo().getY() + (int)(height / 22) ), null);
            		  }		
      		        
      		      
      	  		   // if card is creature, draw power and toughness
      	  		   
      	  		  if (cards.get(x).getTypes().contains("Creature") ) {
      	  			  
      	  			  g.setFont(smallFont);
      	  			  g.drawString(    (Integer.toString( ((Creature) cards.get(x)).getPower()) + "/" + Integer.toString( ((Creature) cards.get(x)).getToughness()  )    ), ((int)cards.get(x).getRectanglePositionInfo().getX() + widthFactor), ((int)cards.get(x).getRectanglePositionInfo().getY() + heightFactor ));
      	  			  
      	  		  }
      	  		  
      	  		 // if creature is not a land, draw mana cost
      	  		  
      	  		  if (!cards.get(x).getTypes().contains("Land") ) {
      	  			  
      	  			  // draw forest mana cost
      	  			  g.setColor(darkGreen);
      	  			  g.drawString(Integer.toString(cards.get(x).getManaCost()[0]), ((int)cards.get(x).getRectanglePositionInfo().getX() + width / 11), ((int)cards.get(x).getRectanglePositionInfo().getY() + (int)(height / 22) ));
      	  			  g.setColor(Color.RED);
      	  			  g.drawString(Integer.toString(cards.get(x).getManaCost()[1]), ((int)cards.get(x).getRectanglePositionInfo().getX() + width / 11), ((int)cards.get(x).getRectanglePositionInfo().getY() + (int)(height / 15) ));
      	  			  g.setColor(Color.WHITE);
      	  			  g.drawString(Integer.toString(cards.get(x).getManaCost()[2]), ((int)cards.get(x).getRectanglePositionInfo().getX() + width / 11), ((int)cards.get(x).getRectanglePositionInfo().getY() + (int)(height / 11) ));
      	  			  g.setColor(Color.BLUE);
      	  			  g.drawString(Integer.toString(cards.get(x).getManaCost()[3]), ((int)cards.get(x).getRectanglePositionInfo().getX() + width / 11), ((int)cards.get(x).getRectanglePositionInfo().getY() + (int)(height / 9) ));
      	  			  g.setColor(Color.DARK_GRAY);
      	  			  g.drawString(Integer.toString(cards.get(x).getManaCost()[4]), ((int)cards.get(x).getRectanglePositionInfo().getX() + width / 11), ((int)cards.get(x).getRectanglePositionInfo().getY() + (int)(height / 7.5) ));
      	  			  g.setColor(Color.MAGENTA);
      	  			  g.drawString(Integer.toString(cards.get(x).getManaCost()[5]), ((int)cards.get(x).getRectanglePositionInfo().getX() + width / 11), ((int)cards.get(x).getRectanglePositionInfo().getY() + (int)(height / 6.5) ));
      	  			  
      	  			  g.setColor(Color.BLUE);
      	  			  
      	  		  }
      		       
		         	 
					
					
					
			
				
			} // end loop 1
			
		} catch (Exception ex) {
			
		}
		
		
		
		
	
	}
	
	public static void drawPlayerStats(int height, int width, boolean bool, Player player, Graphics g) {
		
		int initialHeight = 0;
		int initialWidth = (width - (int)(.15 * width));
		
		g.setFont(nameFont);
		
		if (!bool) {
			initialHeight = (height - (int)(.97 * height)); 
			g.setColor(Color.MAGENTA);
		} else {
			
			g.setColor(Color.BLUE);
			initialHeight = (height - (int)(.82 * height)); 
		}
		// draw player name
		g.drawString(player.getName(),initialWidth, initialHeight);
		
		
		g.setFont(playerStatsFont);
		// draw health
		g.drawString(("Health: " + player.getHealth() ), (initialWidth - (int)(width * .04) ), (initialHeight + (int)(height * .04) ) );
		// draw cards in hand
		g.drawString(("Cards In Hand: " + player.getHand().getHandSize()), (initialWidth + (int)(width * .05) ), (initialHeight + (int)(height * .04) ) );
		// draw untapped mana label
		g.drawString("Land: ", (initialWidth - (int)(width * .04) ), (initialHeight + (int)(height * .08) ) );
		// draw untapped forest value
		g.setColor(darkGreen);
		g.drawString(Integer.toString(player.getLandsInPlay()[0]), (initialWidth + (int)(width * .03) ), (initialHeight + (int)(height * .08) ) );
		// draw untapped mountains
		g.setColor(Color.RED);
		g.drawString(Integer.toString(player.getLandsInPlay()[1]), (initialWidth + (int)(width * .05) ), (initialHeight + (int)(height * .08) ) );
		// draw untapped plains
		g.setColor(Color.WHITE);
		g.drawString(Integer.toString(player.getLandsInPlay()[2]), (initialWidth + (int)(width * .07) ), (initialHeight + (int)(height * .08) ) );
	    // draw untapped islands
		g.setColor(Color.BLUE);
		g.drawString(Integer.toString(player.getLandsInPlay()[3]), (initialWidth + (int)(width * .09) ), (initialHeight + (int)(height * .08) ) );
		// draw untapped swamps
		g.setColor(Color.DARK_GRAY);
		g.drawString(Integer.toString(player.getLandsInPlay()[4]), (initialWidth + (int)(width * .11) ), (initialHeight + (int)(height * .08) ) );
		// draw untapped colorless
		g.setColor(Color.MAGENTA);
		g.drawString(Integer.toString(player.getLandsInPlay()[5]), (initialWidth + (int)(width * .13  ) ), (initialHeight + (int)(height * .08) ) );
		if (bool) g.setColor(Color.BLUE);
		// draw available mana label
		g.drawString("Mana Pool: ", (initialWidth - (int)(width * .04) ), (initialHeight + (int)(height * .11) ) );
		// draw untapped forest value
		g.setColor(darkGreen);
		g.drawString(Integer.toString(player.getManaPool()[0]), (initialWidth + (int)(width * .03) ), (initialHeight + (int)(height * .11) ) );
		// draw untapped mountains
		g.setColor(Color.RED);
		g.drawString(Integer.toString(player.getManaPool()[1]), (initialWidth + (int)(width * .05) ), (initialHeight + (int)(height * .11) ) );
		// draw untapped plains
		g.setColor(Color.WHITE);
		g.drawString(Integer.toString(player.getManaPool()[2]), (initialWidth + (int)(width * .07) ), (initialHeight + (int)(height * .11) ) );
	    // draw untapped islands
		g.setColor(Color.BLUE);
		g.drawString(Integer.toString(player.getManaPool()[3]), (initialWidth + (int)(width * .09) ), (initialHeight + (int)(height * .11) ) );
		// draw untapped swamps
		g.setColor(Color.DARK_GRAY);
		g.drawString(Integer.toString(player.getManaPool()[4]), (initialWidth + (int)(width * .11) ), (initialHeight + (int)(height * .11) ) );
		// draw untapped colorless
		g.setColor(Color.MAGENTA);
		g.drawString(Integer.toString(player.getManaPool()[5]), (initialWidth + (int)(width * .13) ), (initialHeight + (int)(height * .11) ) );
		
		
		
		
	}
	
	public void addMana(Player player, int land) {
		
		if  (player.getLandsInPlay()[land] > 0) {
			player.getManaPool()[land] += 1;
			player.getLandsInPlay()[land] -= 1;
		}
		repaint();
		
	}
	
	public void clearManaPool(Player player) {
		
		for (int x = 0; x < player.getLandsInPlay().length; x++) {
			
			player.getLandsInPlay()[x] += player.getManaPool()[x];
			player.getManaPool()[x] = 0;
			
		}
		repaint();
			
			
		
		
		
	}
	
	
	public static void drawGameInfo(int height, int width, Player player1, Player player2, Graphics g, GameController controller) {
		
		
			
		 // draw lines separating hand, and game info from in play area
		 g.setColor(Color.CYAN);
	     g.drawLine(0, (height - (int)(height / 3.2)), (width - (int)(.2 * width)), (height - (int)(height / 3.2)) );
		 g.drawLine((width - (int)(.2 * width)), height, (width - (int)(.2 * width)), 0);
		 
		 
		 drawPlayerStats(height, width, false, player2, g);
		 drawPlayerStats(height, width, true, player1, g);
		 
		 
		 g.setColor(Color.CYAN);
		
		 g.drawString( ("Turn " + controller.getTurnNumber() + ": " + controller.getWhoseTurn()), (width - (int)(.19 * width) ), (height - (int)(.63 * height)));
		 g.drawString("Phase: " + controller.getTurnPhase(), (width - (int)(.08 * width) ), (height - (int)(.63 * height)));
		 
		 
	}
	 	   
	
	 
    public GamePanel() {
    	handRectangles.add(hand0);
    	hand0.setInHand(true);
    	hand0.setPlayer1(player1);
    	handRectangles.add(hand1);
    	hand1.setInHand(true);
    	
    	handRectangles.add(hand2);
    	hand2.setInHand(true);
    	
    	handRectangles.add(hand3);
    	hand3.setInHand(true);
    	
    	handRectangles.add(hand4);
    	hand4.setInHand(true);
    	
    	handRectangles.add(hand5);
    	hand5.setInHand(true);
    	
    	handRectangles.add(hand6);
    	hand6.setInHand(true);
    	
    	
    	
    	player2InPlayRectangles.add(row0col0);
    	player2InPlayRectangles.add(row0col1);
    	player2InPlayRectangles.add(row0col2);
    	player2InPlayRectangles.add(row0col3);
    	player2InPlayRectangles.add(row0col4);
    	player2InPlayRectangles.add(row0col5);
    	player2InPlayRectangles.add(row0col6);
    	
    	player2InPlayRectangles.add(row1col0);
    	player2InPlayRectangles.add(row1col1);
    	player2InPlayRectangles.add(row1col2);
    	player2InPlayRectangles.add(row1col3);
    	player2InPlayRectangles.add(row1col4);
    	player2InPlayRectangles.add(row1col5);
    	player2InPlayRectangles.add(row1col6);
    	
    	player1InPlayRectangles.add(row2col0);
    	player1InPlayRectangles.add(row2col1);
    	player1InPlayRectangles.add(row2col2);
    	player1InPlayRectangles.add(row2col3);
    	player1InPlayRectangles.add(row2col4);
    	player1InPlayRectangles.add(row2col5);
    	player1InPlayRectangles.add(row2col6);
    	
    	player1InPlayRectangles.add(row3col0);
    	player1InPlayRectangles.add(row3col1);
    	player1InPlayRectangles.add(row3col2);
    	player1InPlayRectangles.add(row3col3);
    	player1InPlayRectangles.add(row3col4);
    	player1InPlayRectangles.add(row3col5);
    	player1InPlayRectangles.add(row3col6);
    	
    	
    	addMouseListener(this); // adds mouseListener to main GamePanel
    	setLayout(new MigLayout("", "[40px:n:40px,shrink 0,fill][150px:n:150px,shrink 0,fill][150px:n:150px,shrink 0,fill][150px:n:150px,shrink 0,fill][150px:n:150px,shrink 0,fill][150px:n:150px,shrink 0,fill][150px:n:150px,shrink 0,fill][150px:n:150px,shrink 0,fill][180px:n:180px,grow]", "[120px:n:120px,shrink 0,fill][120px:n:120px,shrink 0,fill][120px:n:120px,shrink 0,fill][120px:n:120px,shrink 0,fill][30px:n:20px,shrink 0,fill][200px:n:200px,grow,shrink 0,fill]"));
    	// adds forest mana button, with constraints, and mouse click handler
    	forestButton.setToolTipText("add forest to mana pool.");
    	forestButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			
    			addMana(player1, 0);
    			
    		}
    	});
    	
    	add(forestButton, "pos 87.5% 30%,cell 0 0,wmax 20px,hmax 20px,aligny bottom");
    	mountainButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			addMana(player1, 1);
    		}
    	});
    	mountainButton.setToolTipText("add mountain to mana pool.");
    	add(mountainButton, "pos 89.5% 30%,cell 0 0,wmax 20px,hmax 20px,aligny bottom");
    	plainsButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			addMana(player1, 2);
    		}
    	});
    	plainsButton.setToolTipText("add plains to mana pool.");
    	add(plainsButton, "pos 91.5% 30%,cell 0 0,wmax 20px,hmax 20px,aligny bottom");
    	islandButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			addMana(player1, 3);
    		}
    	});
    	islandButton.setToolTipText("add island to mana pool.");
    	add(islandButton, "pos 93.5% 30%,cell 0 0,wmax 20px,hmax 20px,aligny bottom");
    	swampButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			addMana(player1, 4);
    		}
    	});
    	swampButton.setToolTipText("add swamp to mana pool.");
    	add(swampButton, "pos 95.5% 30%,cell 0 0,wmax 20px,hmax 20px,aligny bottom");
    	wastelandButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			addMana(player1, 5);
    		}
    	});
    	wastelandButton.setToolTipText("add wasteland to mana pool.");
    	add(wastelandButton, "pos 97.5% 30%,cell 0 0,wmax 20px,hmax 20px,aligny bottom");
    	emptyButton.setToolTipText("clear mana pool.");
    	emptyButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			clearManaPool(player1);
    		}
    	});
    	
    	add(emptyButton, "pos 83.5% 30%,cell 0 0,wmax 50px,hmax 25px,aligny bottom");
    	
    	nextPhaseButton.setToolTipText("Move to the next phase of your turn");
    	add(nextPhaseButton, "pos 81% 40%,cell 0 0,wmax 70px,hmax 45px,aligny bottom");
    	
    	nextPhaseButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			GameTest.getGameController().nextPhase();
    			repaint();
    			
    		}
    	});
    	drawButton.setToolTipText("during your draw phase, you may draw one card from your deck.");
    	add(drawButton, "pos 92% 40%,cell 0 0,wmax 70px,hmax 45px,aligny bottom");
    	drawButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			
    			if (GameTest.getGameController().getTurnPhases()[2] && !player1.getHasDrawn()) { // begin if A
    				gameText.append(player1.getName() + " draws " + player1.getDeck().getCards().get(0).getName() + ".\n");
    			    player1.drawTopCardMyDeck();
    			    player1.toggleHasDrawn();
    			    repaint();
    			}
    		} // end if A
    	});
    	attackButton.setToolTipText("Select attackers and hit this button to attack.");
    	add(attackButton, "pos 81% 48%,cell 0 0,wmax 70px,hmax 45px,aligny bottom");
    	attackButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			if (GameTest.getGameController().getTurnPhase() == "Combat") {
    				
    			if ( GameController.initiateCombat(player1, player2, gameText) ) {
    				
    		           repaint();
    		           GameTest.getGameController().nextPhase();
    	        }
    			
    	    }
    	}
    		
    	});
    	blockButton.setToolTipText("select blockers and hit this button to proceed.");
    	add(blockButton, "pos 86.5% 48%,cell 0 0,wmax 70px,hmax 45px,aligny bottom");
    	blockButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			
    			
    	    }
    		
    	});
    	
    	
    	
    	
    	
    	
    	
    	playCardButton.setToolTipText("<html>select card(s), hit this button to put them into play.</html>");
    	add(playCardButton, "pos 86.5% 40%,cell 0 0,wmax 70px,hmax 45px,aligny bottom");
    	playCardButton.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			
    			
    			
    			int[] tempManaCost = {0, 0, 0, 0, 0, 0};
    			boolean manaFlag = false; 
    			
    			
    			for (int z = 0; z < player1.getHand().getHand().size(); z++) { // begin for loop A
    				
    				
    				
    				if (GameTest.getGameController().getPlayer1Turn()) { // if A
    					
    					if (player1.getHand().getCardAt(z).getIsClicked()) { // isclicked if
    						
    						for (int x = 0; x < 6; x++) {
    							
    							tempManaCost[x] += player1.getHand().getCardAt(z).getManaCost()[x];
    							if (tempManaCost[x] > player1.getManaPool()[x]) manaFlag = true; 
    						}	
    						if (!manaFlag) {
    							gameText.append(player1.getName() + " plays " + player1.getHand().getHand().get(z).getName() + ".\n");
    							player1.getHand().playCard(player1.getHand().getHand().get(z));
    							repaint();
    							
    						}
    							
    						
    					
    						
    						
    					} // end isClicked if
    					 
    					
    				} // end forloop A
    				
    				// GameController.turnIsClickedOff(player1.getHand().getHand());
					// GameController.turnIsClickedOff(player1.getAllNonLandCardsInPlay());
    	          
    			}
    				
    		}	
    	});
    	
    	add(hand0, "cell 1 5");
    	add(hand1, "cell 2 5");
    	add(hand2, "cell 3 5");
    	add(hand3, "cell 4 5");
    	add(hand4, "cell 5 5");
    	add(hand5, "cell 6 5");
    	add(hand6, "cell 7 5");
    	
    	add(row0col0, "cell 1 0");
    	add(row0col1, "cell 2 0");
    	add(row0col2, "cell 3 0");
    	add(row0col3, "cell 4 0");
    	add(row0col4, "cell 5 0");
    	add(row0col5, "cell 6 0");
    	add(row0col6, "cell 7 0");
    	
    	add(row1col0, "cell 1 1");
    	add(row1col1, "cell 2 1");
    	add(row1col2, "cell 3 1");
    	add(row1col3, "cell 4 1");
    	add(row1col4, "cell 5 1");
    	add(row1col5, "cell 6 1");
    	add(row1col6, "cell 7 1");
    	
    	add(row2col0, "cell 1 2");
    	add(row2col1, "cell 2 2");
    	add(row2col2, "cell 3 2");
    	add(row2col3, "cell 4 2");
    	add(row2col4, "cell 5 2");
    	add(row2col5, "cell 6 2");
    	add(row2col6, "cell 7 2");
    	
    	add(row3col0, "cell 1 3");
    	add(row3col1, "cell 2 3");
    	add(row3col2, "cell 3 3");
    	add(row3col3, "cell 4 3");
    	add(row3col4, "cell 5 3");
    	add(row3col5, "cell 6 3");
    	add(row3col6, "cell 7 3");
    	scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    	scrollPane.setBackground(Color.BLACK);
    	scrollPane.setAutoscrolls(true);
    	scrollPane.setToolTipText("Game Info");
    	
    	add(scrollPane, ",cell 8 4 1 2 ,gapleft 30, gapafter 30, wmin 18%,hmin 30%, grow");
    	gameText.setLineWrap(true);
    	gameText.setAutoscrolls(false);
    	gameText.setWrapStyleWord(true);
    	gameText.setAlignmentY(Component.TOP_ALIGNMENT);
    	gameText.setAlignmentX(Component.LEFT_ALIGNMENT);
    	gameText.setDisabledTextColor(Color.BLUE);
    	gameText.setSelectionColor(Color.YELLOW);
    	gameText.setSelectedTextColor(Color.YELLOW);
    	gameText.setBackground(Color.BLACK);
    	gameText.setForeground(Color.YELLOW);
    	gameText.setFont(playerStatsFont);
    	
    	
    	scrollPane.setViewportView(gameText);
    	
    	
    	
    	
    	
    	
    }
    
    
    public void mouseClicked(MouseEvent e) {
    	
    	

  
     }

     public void mousePressed(MouseEvent e) {
     }

     public void mouseReleased(MouseEvent e) {
     }

     public void mouseEntered(MouseEvent e) {
    	 
   
     }

     public void mouseExited(MouseEvent e) {
    	 
     }
  
    
    
    
    public Font getHandFont() {
    	return this.handFont;
    }
     
    
    public Font getDeckFont() {
    	return this.deckFont;
    	
    }
    
 
   
    public void setPlayer1(Player player1) {
    	this.player1 = player1;
    }
    
    public void setPlayer2(Player player2) {
    	this.player2 = player2;
    }
    
    public void setGameController(GameController gameController) {
    	this.gameController = gameController;
    }
    
    
    
    
   

    public void paintComponent(Graphics g) { // declare a method to paint that takes a Graphics object supplied by awt.Graphics.

        super.paintComponent(g);
        int width = getWidth(); // width of panel
        int height = getHeight(); // height of panel
    	//public void drawGameInfo(Player player1, Player player2, Graphics g, GameController controller) {
        drawGameInfo(height, width, player1, player2, g, GameTest.getGameController());
        g.setColor(Color.BLUE);
        drawCards(player1, g, width, height, true, handRectangles, player2InPlayRectangles, player1InPlayRectangles);
        drawCards(player1, g, width, height, false, handRectangles, player1InPlayRectangles, player2InPlayRectangles);
        drawCards(player2, g, width, height, false, handRectangles, player1InPlayRectangles, player2InPlayRectangles);
        
       
    }
 }
  		   	 
  		   	 
  		   	 
 
 
 
 