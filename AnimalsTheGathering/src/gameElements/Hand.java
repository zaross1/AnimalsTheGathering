package gameElements;

import java.util.ArrayList;

import cards.Card;

public class Hand {

	private Player player;
	private Deck deck;
	private Graveyard graveyard;

	public Hand(Player player, Deck deck) {
		// TODO Auto-generated constructor stub
	}

	public void addCardToHand(Card drawTopCard) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Card> getHand() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getHandSize() {
		// TODO Auto-generated method stub
		return null;
	}

	public Card getCardAt(int z) {
		// TODO Auto-generated method stub
		return null;
	}

	public void playCard(Card card) {
		// TODO Auto-generated method stub
		
	}

	public void setPlayer(Player person) {
		this.player = person;
		
	}

	public void setDeck(Deck personDeck) {
		
		this.deck= personDeck;
		
	}

	public void setGraveyard(Graveyard personGraveyard) {
		this.graveyard = personGraveyard;
		
	}

	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}