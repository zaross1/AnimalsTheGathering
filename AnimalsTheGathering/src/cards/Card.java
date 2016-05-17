package cards;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import gameElements.Rectangle1;
import gameElements.Rectangle2;



public class Card implements Serializable {
  private String dummy;
  private String name;
  private ArrayList<String> types = new ArrayList<String>();
  private int[] manaCost = new int[6];  // [forest, mountain, plains, island, swamp, colorless]
  private BufferedImage img = null; 

  
  
  // flags for various game states
  
  private boolean isInDeck = false;
  private boolean isInHand = false;
  private boolean isInPlay = false;
  private boolean isTapped = false;
  private boolean isClicked = false;
  
  public boolean getIsClicked() {
	  return this.isClicked;
  }
  
  public void setIsClicked(boolean bool) {
	  this.isClicked = bool;
  }
  
  public void toggleIsClicked() {
	  if (this.isClicked) this.isClicked = false;
	  else this.isClicked = true;
  }
  
  // drawing info
  
  public Rectangle2 rectanglePositionInfo = null;

  public Card() {
  }
  
 

  public Card(String name) {
    this.name = name;

  }
  
 
  
  public void setImage(String img) {
	  
	  try {
		  
		BufferedImage myImage = ImageIO.read(new File(img));
		this.img = myImage;
	  } catch (IOException e) {
		  System.out.println(e.getMessage());
	  }
	  
	  
  }
  
  public void toolTipStatus() {
	  try {
		  this.getRectanglePositionInfo();
		  this.getRectanglePositionInfo().setToolTipText(toTextString());
	  } catch (Exception e) {
		  
	  }
  }
  
  public BufferedImage getImage() {
	  return  this.img;
  }
  
  public void setRectanglePositionInfo(Rectangle2 rect) {
	 
	  this.rectanglePositionInfo = rect;
	  
  }
  
  public Rectangle2 getRectanglePositionInfo() {
	  return this.rectanglePositionInfo;
  }
  
  public void removeRectanglePositionInfo() {
	  this.rectanglePositionInfo = null;
  }
  
  

  public String getName() {
   
    return this.name;
  }
  
  public void setName(String name) {
	  this.name = name;
  }

  public ArrayList<String> getTypes() {
    return this.types;
  }

  public int[] getManaCost() {
 
    return this.manaCost;
  }

  public void setManaCost(int landPosition, int cost) {
    this.manaCost[landPosition] = cost;
  }



  public boolean getIsInDeck() {
   
    return this.isInDeck;

  }

  public boolean getIsInHand() {
   
    return this.isInHand;

  }

  public boolean getIsInPlay() {
   
    return this.isInPlay;

  }
  
 

  public boolean getIsTapped() {
   
    return this.isTapped;

  }

  public void setManaCost(int[] newManaCost) {
  
    this.manaCost = newManaCost;
  }

  public void setIsInDeck(boolean status) {
   
    this.isInDeck = status;

  }

  public void setIsInHand(boolean status) {
   
    this.isInHand = status;

  }

  public void setIsInPlay(boolean status) {
   
    this.isInPlay = status;

  }

  public void setIsTapped(boolean status) {
    
    this.isTapped = status;

  }


  public boolean isType(String type) {
    boolean status = false;
    for (int x = 0; x < this.types.size(); x++) {
      if (types.get(x) == type  ) status = true;
    }
    return status;

  }

  public void addType(String type) {
    this.types.add(type);
   
  }

  public void removeType(String type) {
    this.types.remove(type);

  }

  public String toTextString() {
	  return "";
  }


  public void print(String string) {
    System.out.println(string);
  }

}
