package gameElements;

import cards.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import cards.*;


import java.io.*;
import javax.imageio.ImageIO;




public class GameTest {
	
	private static GameController controller = null; 
    
	public static GameController getGameController() {
		return controller;
	}
	
	public static void setGameController(GameController myController) {
		controller = myController;
	}

	public static void main(String[] args) {
		
		
		
		// establishes card collection and adds cards to it
		ArrayList<Card> collection = new ArrayList<Card>(); // jason 
		ArrayList<Card> collection1 = new ArrayList<Card>(); // computer
		ArrayList<Card> collection2 = new ArrayList<Card>(); // jason hand
		RainbowJaguar rainbowJaguar = new RainbowJaguar();
		collection2.add(rainbowJaguar);
		
		
		
		RainbowJaguar rainbowJaguar3 = new RainbowJaguar();
		collection2.add(rainbowJaguar3);
		RainbowJaguar rainbowJaguar4 = new RainbowJaguar();
		collection2.add(rainbowJaguar4);
		RainbowJaguar rainbowJaguar5 = new RainbowJaguar();
		collection2.add(rainbowJaguar5);
		RainbowJaguar rainbowJaguar6 = new RainbowJaguar();
		collection2.add(rainbowJaguar6);
		RainbowJaguar rainbowJaguar7 = new RainbowJaguar();
		collection2.add(rainbowJaguar7);
		RainbowJaguar rainbowJaguar8 = new RainbowJaguar();
		collection2.add(rainbowJaguar8);
		
		
		BlueRose blueRose = new BlueRose();
		collection.add(blueRose);
		ElectricFronds electricFronds = new ElectricFronds();
		collection.add(electricFronds);
		DiamondDragonfly diamondDragonfly = new DiamondDragonfly();
		collection.add(diamondDragonfly);
		CoolButterfly coolButterfly = new CoolButterfly();
		collection.add(coolButterfly);
		AquarianTiger aquarianTiger = new AquarianTiger();
		collection.add(aquarianTiger);
		ButterflyDebris butterflyDebris = new ButterflyDebris();
		collection.add(butterflyDebris);
		BlueInfinity blueInfinity = new BlueInfinity();
		collection.add(blueInfinity);
		
		BlueRose blueRose1 = new BlueRose();
		collection.add(blueRose1);
		ElectricFronds electricFronds1 = new ElectricFronds();
		collection.add(electricFronds1);
		DiamondDragonfly diamondDragonfly1 = new DiamondDragonfly();
		collection.add(diamondDragonfly1);
		CoolButterfly coolButterfly1 = new CoolButterfly();
		collection.add(coolButterfly1);
		AquarianTiger aquarianTiger1 = new AquarianTiger();
		collection.add(aquarianTiger1);
		ButterflyDebris butterflyDebris1 = new ButterflyDebris();
		collection.add(butterflyDebris1);
		BlueInfinity blueInfinity1 = new BlueInfinity();
		collection.add(blueInfinity1);
		
		ElectricFronds electricFronds2 = new ElectricFronds();
		collection.add(electricFronds2);
		
		ElectricFronds electricFronds3 = new ElectricFronds();
		collection1.add(electricFronds3);
		
		ElectricFronds electricFronds4 = new ElectricFronds();
		collection1.add(electricFronds4);
		
		ElectricFronds electricFronds5 = new ElectricFronds();
		collection1.add(electricFronds5);
		
		ElectricFronds electricFronds6 = new ElectricFronds();
		collection1.add(electricFronds6);
		
		ElectricFronds electricFronds7 = new ElectricFronds();
		collection1.add(electricFronds7);
	
		ElectricFronds electricFronds8 = new ElectricFronds();
		collection1.add(electricFronds8);
		
		ElectricFronds electricFronds9 = new ElectricFronds();
		collection1.add(electricFronds9);
		
		ElectricFronds electricFronds10 = new ElectricFronds();
		collection1.add(electricFronds10);
		
		ElectricFronds electricFronds11 = new ElectricFronds();
		collection1.add(electricFronds11);
		
		ElectricFronds electricFronds12 = new ElectricFronds();
		collection1.add(electricFronds12);
		
		ElectricFronds electricFronds13 = new ElectricFronds();
		collection1.add(electricFronds13);
		
		
		
		// establishes player one deck and hand, and graveyard
		Player jason = new Player("Jason");	
		Deck myDeck = new Deck(collection);
		Hand myHand = new Hand(jason, myDeck);
		Graveyard myGraveyard = new Graveyard(myDeck, jason);
		GameController game1 = new GameController();
		setGameController(game1);
		
		myHand.addCardToHand(electricFronds13);
		myHand.addCardToHand(electricFronds12);
		myHand.addCardToHand(aquarianTiger1);
		myHand.addCardToHand(diamondDragonfly);
	
		
		
		// establishes player two deck and hand graveyard
		
		Player computer = new Player("Computer");
		Deck computerDeck = new Deck(collection1);
		Hand computerHand = new Hand(computer, computerDeck);
		Graveyard computerGraveyard = new Graveyard(computerDeck, computer);
		
		
		// main game panel and drawn handler set up
		JFrame mainFrame = new JFrame();
		GamePanel mainPanel = new GamePanel();


		// establishes relationships between player, graveyard, hand, deck, controller, main game panel
		game1.associatePlayerInfo(jason, myDeck, computerDeck, myHand, computerHand, computerGraveyard, myGraveyard, computer, game1, mainPanel);
		mainPanel.setPlayer1(jason);
		mainPanel.setGameController(game1);
		mainFrame.add(mainPanel);
		mainFrame.setSize(1450, 800);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel.setBackground(Color.BLACK);
		
	}
}

		