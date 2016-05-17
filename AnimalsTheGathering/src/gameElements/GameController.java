package gameElements;

import javax.swing.JTextArea;

public class GameController {
	
	// game objects
	
	private Player person;
	private Deck personDeck;
	private Hand personHand;
	private Graveyard personGraveyard;
	
	private Player computer;
	private Deck computerDeck;
	private Hand computerHand;
	private Graveyard computerGraveyard;
	
	private int turn;
	private boolean personTurn;
	private boolean[] turnPhases;
	
	
	
	
	
		GameController() {
			this.turn = 1;
			this.turnPhases = new boolean[] {true, false, false, false, false, false};
			this.personTurn = true;
		}
	
	

	public void associatePlayerInfo(Player person, Deck personDeck, Deck computerDeck, Hand personHand, Hand computerHand,
			Graveyard computerGraveyard, Graveyard personGraveyard, Player computer, GameController game1,
			GamePanel mainPanel) {
	// set up player's objects
	this.person = person;
	this.personDeck = personDeck;
	this.personHand = personHand;
	this.personGraveyard = personGraveyard;
	
	person.setOpponent(computer);
	// set up Player's relationships with hand, deck, graveyard
	person.setHand(this.personHand);
	person.setDeck(this.personDeck);
	person.setGraveyard(this.personGraveyard);
	// set up player's Deck relationships with the player, hand, and graveyard
	personDeck.setPlayer(this.person);
	personDeck.setHand(this.personHand);
	personDeck.setGraveyard(this.personGraveyard);
	// set up player's Hand relationships
	personHand.setPlayer(this.person);
	personHand.setDeck(this.personDeck);
	personHand.setGraveyard(this.personGraveyard);
	
	
	
	
	// set up Computer's relationships	
	this.computer = computer;
	this.computerDeck = computerDeck;
	this.computerHand = computerHand;
	this.computerGraveyard = computerGraveyard;
	
	
	// set up Player's relationships with hand, deck, graveyard
		computer.setHand(this.computerHand);
		computer.setDeck(this.computerDeck);
		computer.setGraveyard(this.computerGraveyard);
		// set up player's Deck relationships with the player, hand, and graveyard
		computerDeck.setPlayer(this.computer);
		computerDeck.setHand(this.computerHand);
		computerDeck.setGraveyard(this.computerGraveyard);
		// set up player's Hand relationships
		computerHand.setPlayer(this.computer);
		computerHand.setDeck(this.computerDeck);
		computerHand.setGraveyard(this.computerGraveyard);	
		
		computer.setOpponent(person);
		
	}

	public String getTurnNumber() {
		// TODO Auto-generated method stub
		return Integer.toString(this.turn);
	}

	public String getTurnPhase() {
		String phase = "";
		int index = 0;
		
		for (int x = 0; x < this.getTurnPhases().length; x++) {
		
			if (this.getTurnPhases()[x]) {
				
				index = x;
			}
		}
		
		switch (index) {
		
		case 0:
			phase = "Untap";
		case 1:
			phase = "Upkeep";
		case 2:
			phase = "Draw";
		case 3:
			phase = "Main1";
		case 4:
			phase = "Combat";
		case 5:
			phase = "Main2";
		default:
			phase = "";
		}
		
		return phase;
	}

	public String getWhoseTurn() {
		if (this.getPlayer1Turn()) {
			
			return person.getName();
			
		} else {
			
			return computer.getName();
		}
	}

	public void nextPhase() {
		int index = 0;
		for (int x = 0; x < this.getTurnPhases().length; x++) {
			
			if (getTurnPhases()[x]) {				
				index = x + 1;
				break;
			}
			
		}
		
		for (int x = 0; x < this.getTurnPhases().length; x++) {
		
			this.getTurnPhases()[x] = false;
			
		}
		
		this.getTurnPhases()[index] = true;
		
		
	}

	public boolean[] getTurnPhases() {
		
		return this.turnPhases;
	}

	public static boolean initiateCombat(Player player1, Player player2, JTextArea gameText) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean getPlayer1Turn() {
		// TODO Auto-generated method stub
		return this.personTurn;
	}

	
	
	
	
	
	
	
	
	
	
}