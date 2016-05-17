package gameElements;

import cards.*;

import java.awt.Color;
import java.util.ArrayList;

public class Player {
	private String name;
	private int health = 20;
	private ArrayList<ArrayList<Card>> cardCollection = new ArrayList<ArrayList<Card>>();
	private ArrayList<Deck> deckCollection = new ArrayList<Deck>();
	private int currentHealth;
	private int[] manaPool = new int[6];
	private int[] maxMana = new int[6]; 
	private Deck deck;
	private Hand hand;
	private boolean attackedOnce = false;
	private ArrayList<Card> allCardsInPlay = new ArrayList<Card>();
	private ArrayList<Card> allNonLandCardsInPlay = new ArrayList<Card>();
	private int[] landsInPlay = new int[6]; 
	public int[] availableLandsInPlay = new int[6];
	private ArrayList<Card> enchantmentsInPlay = new ArrayList<Card>();
	private ArrayList<Card> creaturesInPlay = new ArrayList<Card>();
	private Graveyard graveyard;
	private Player opponent;
	private Color cardColor;
	private boolean computer = false;
	private boolean hasDrawn = false;
	
	public void toggleHasDrawn() {
		if (hasDrawn) hasDrawn = false;
		else hasDrawn = true;
	}
	
	public void toggleAttackedOnce() {
		if (attackedOnce) attackedOnce = false;
		else attackedOnce = true;
	}
	
	public void setAttackedOnce(boolean bool) {
		this.attackedOnce = bool;
	}
	
	public boolean getAttackedOnce() {
		return this.attackedOnce;
	}
	
	
	public boolean getHasDrawn() {
		return this.hasDrawn;
	}
	
	public void incrementHealth(int increment) {
		this.health += increment;
	}
	
	public void decrementHealth(int decrement) {
		this.health -= decrement;
	}
	
	public void setManaArray(int[] array, int one, int two, int three, int four, int five, int six) {
		
		array[0] = one;
		array[1] = two;
		array[2] = three;
		array[3] = four;
		array[4] = five;
		array[5] = six;
		
		
	}
	
	public int getHealth() {
		return this.health;
	}
	
	
	public boolean getComputer() {
		return this.computer;
	}
	
	public void CastCard(Card card) {
		for (int x = 0; x < 6; x++) {
			
			
			
		}
	}
	
	public void setComputer(boolean bool) {
		this.computer = bool;
	}
	
	public Player(String name) {
		this.health = 20;
		this.currentHealth = 20;
		this.name = name;
		this.availableLandsInPlay[0] = 2;
		this.availableLandsInPlay[1] = 5;
		this.availableLandsInPlay[2] = 3;
		this.availableLandsInPlay[3] = 4;
		this.availableLandsInPlay[4] = 6;
		this.availableLandsInPlay[5] = 7;
		
		this.landsInPlay[0] = 6;
		this.landsInPlay[1] = 6;
		this.landsInPlay[2] = 6;
		this.landsInPlay[3] = 6;
		this.landsInPlay[4] = 6;
		this.landsInPlay[5] = 6;
		
		this.manaPool[0] = 0;
		this.manaPool[1] = 0;
		this.manaPool[2] = 0;
		this.manaPool[3] = 0;
		this.manaPool[4] = 0;
		this.manaPool[5] = 0;
	}
	
	public void setCardColor(Color color) {
		this.cardColor = color;
	}
	
	public Color getCardColor() {
		return this.cardColor;
	}
	
	
	
	public Player(String name, int currentHealth) {
		this.currentHealth = currentHealth;		
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Card> getAllNonLandCardsInPlay() {
		return this.allNonLandCardsInPlay;
	}
	
	public int[] getAvailableLandsInPlay() {
		return this.availableLandsInPlay;
	}
	
	
	public ArrayList<Card> getAllCardsInPlay() {
		return this.allCardsInPlay;
	}
	
	public int[] getLandsInPlay() {
		return this.landsInPlay;
	}
	
	public ArrayList<Card> getEnchantmentsInPlay() {
		return this.enchantmentsInPlay;
	}
	
	public ArrayList<Card> getCreaturesInPlay() {
		return creaturesInPlay;
	}
	
	
	public int getCurrentHealth() {
		return this.currentHealth;
	}
	
	public void setCurrentHealth(int health) {
		this.currentHealth = health;
	}
	
	public int[] getManaPool() {
		return this.manaPool;
    }
	
	public Deck getDeck() {
		return this.deck;
	}
	
	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	
	public Hand getHand() {
		return this.hand;
	}
	
	public void setHand(Hand hand) {
		this.hand = hand;
	}
	
	public Graveyard getGraveyard() {
		return this.graveyard;
	}
	
	public void setGraveyard(Graveyard graveyard) {
		this.graveyard = graveyard;
	}
	
	
	public Player getOpponent() {
		return this.opponent;
	}
	
	public void setOpponent(Player opponent) {
		this.opponent = opponent;
	}
	
	// methods that call other methods in the deck to do their work;
	
	public void drawTopCardMyDeck() {
		this.hand.addCardToHand(this.deck.drawTopCard());
	}
	
	
	
	
	
	
	
	
	
	
}