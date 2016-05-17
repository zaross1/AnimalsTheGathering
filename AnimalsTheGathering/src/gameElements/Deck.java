package gameElements;


import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import cards.*;
import java.util.Collections;

public class Deck {

  private ArrayList<Card> cards;
  private int numberCards;
  private Player player;
  private Hand hand;
  private Graveyard graveyard;
  private int[] rectanglePositionInfo = new int[4];

  public Deck(ArrayList<Card> cardsInDeck) { // works
    this.cards = cardsInDeck;
    this.numberCards = cardsInDeck.size();
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
  
 
  
  public Graveyard getGraveyard() {
	  return this.graveyard;
  }
  
  public void setGraveyard(Graveyard graveyard) {
	  this.graveyard = graveyard;
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
  
  public void setPlayer(Player p) {
	  this.player = p;
  }
  

  public int getNumberCards() { // works
    return this.numberCards;
  }
  
  public ArrayList<Card> getCards() { // works
	  return this.cards;
  }

  public void addDeckCard(Card card) { // works
    this.cards.add(card);
  }

  public void removeDeckCard(Card card) { // works
    this.cards.remove(card);
  }

  public void shuffleDeck() { // works
    Collections.shuffle(getCards());;
  }

 

  public Card drawTopCard() { // works
    Card topCard = cards.get(0);
    this.removeDeckCard(cards.get(0));
    return topCard;
  }

  public void putCardOnDeck(Card card) { // works
	  this.getCards().add(0, card);
  }
  
  public void putCardUnderDeck(Card card) { // works
	  this.getCards().add(card);
  }


  public Card revealTopCard() {  // works
    return this.cards.get(0);
  }

  public Card selectRandomCard() { // works
    SecureRandom numGenerator = new SecureRandom();
    int randomValue = numGenerator.nextInt(this.getNumberCards());
    return this.cards.get(randomValue);
  }
  
  
  

  public void toTextString() { // works
    System.out.println("\nThere are " + this.getNumberCards() + " cards in your deck.");
    System.out.print("Here are the cards in your deck: \n");
    for (Card card : this.cards) {
        System.out.printf("\t%s", card.getName() );
        System.out.println();
    }
  }
  
 







}
