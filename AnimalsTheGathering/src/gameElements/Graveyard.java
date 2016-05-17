package gameElements;
import cards.*;
import java.util.ArrayList;

public class Graveyard {
	
	private ArrayList<Card> graveyard = new ArrayList<Card>();
	private Player player;
	private Deck deck;
	private Hand hand;
	private int[] rectanglePositionInfo = new int[4];
	
	public Graveyard(Deck deck, Player player) {
		
		this.player = player;
		this.deck = deck;
	}
	
	
	  public void setRectanglePositionInfo(int x, int y, int width, int height) {
		  this.rectanglePositionInfo[0] = x;
		  this.rectanglePositionInfo[1] = y;
		  this.rectanglePositionInfo[2] = width;
		  this.rectanglePositionInfo[3] = height;
	  }
	  
	  public int[] getRectanglePositionInfo() {
		  return this.rectanglePositionInfo;
	  }
	
	
	public ArrayList<Card> getGraveyard() {
		return this.graveyard;
	}
	
	public void setGraveyard(ArrayList<Card> cards) {
		this.graveyard = cards;
	}
	
	public Hand getHand() {
		return this.hand;
	}
	
	public void setHand(Hand hand) {
		this.hand = hand;
	}
	
	public Player getPlayer() {
		return this.player;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public int getSize() {
		return this.getGraveyard().size();
	}
	
	public void emptyGraveyard() {
		this.graveyard.clear();
	}

	public void addCardToGraveyard(Card card) {
		this.graveyard.add(card);	
	}
	
	public void removeCardFromGraveYard(Card card) {
		this.graveyard.remove(card);
	}
	
	
	
 public void toTextString() { // works
	    System.out.println("\nThere are " + this.getSize() + " cards in your graveyard.");
	    System.out.print("Here are the cards in your deck: \n");
	    for (Card card : this.getGraveyard() ) {
	        System.out.printf("\t%s", card.getName() );
	        System.out.println();
	    }
	  }
			  
	
	
	
	
	
	
	
	
	
	
}
