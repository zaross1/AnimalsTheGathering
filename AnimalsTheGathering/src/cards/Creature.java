
package cards;
import java.util.ArrayList;
import gameElements.Player;



public class Creature extends Card {
  private int toughness;
  private int power;
  private int currentPower;
  private int currentToughness;

  private boolean hasSummoningSickness = true;

  public Creature() {
    super();
    super.addType("Creature");
  }
  

  public Creature(int toughness, int power) {
    this.toughness = toughness;
    this.power = power;
    this.currentPower = this.power;
    this.currentToughness = this.toughness;
  }

  public int getPower() {

    return this.power;
   
  }


  public boolean getHasSummoningSickness() {
    return this.hasSummoningSickness;
  }
  
  public void setHasSummoningSickness(boolean status) {
	  this.hasSummoningSickness = status;
  }

  public int getToughness() {
	
    return this.toughness;
   
  }

  public int getCurrentToughness() {
 
    return this.currentToughness;
    
  }

  public int getCurrentPower() {
	print("gets current power");  
    return this.currentPower;
    
  }

  public void setCurrentToughness(int toughness) {
	  this.currentToughness = toughness;
  }
  
  public void setCurrentPower(int power) {
	  this.currentPower = power;
  }
  

  public void setPower(int power) {
    this.power = power;

  }

  public void setToughness(int toughness) {
    this.toughness = toughness;

  }

  public void attack(Player player) {
    print("attack single player");
  }

  public void doAttackDamage(Card creature) {
    print("doAttackDmg to single creature");
  }

  public void doAttackDamage(Player player) {
    print("doAttackDmg to single player");
  }

  public void attack(ArrayList<Creature> creatures) {
    print("attack more than one creature method");
  }

  public void attack(Card creature) {
    print("attack single creature method");
  }


  public void block(Card creature) {
    print("block single creature method");
  }

  public void print(String string) {
    System.out.println(string);
  }
  @Override
  public String toTextString() {
	  
	  	String myText = "";
	  	myText = "<html>";
	    myText += "Card Name: " + this.getName();
	    myText += "<br>";
	    myText += "Types: ";
	    
	    for (int x = 0; x < this.getTypes().size(); x++) {
	        myText += (super.getTypes().get(x) + " ");
	    }
	    myText += "<br>";
	    myText += ("<br>Power: " + this.getPower() );
	    myText += ("<br>Toughness: " + this.getToughness());
	    myText += "<br>";
	    int[] manaCost = super.getManaCost();
	    if (manaCost[0] > 0)
	    	myText += ("<br>Forests: " + manaCost[0]);
	    if (manaCost[1] > 0)
	    	myText += ("<br>Mountains: " + manaCost[1]);
	    if (manaCost[2] > 0)
	    	myText += ("<br>Plains: " + manaCost[2]);
	    if (manaCost[3] > 0)
	    	myText += ("<br>Islands: " + manaCost[3]);
	    if (manaCost[4] > 0)
	    	myText += ("\nSwamps: " + manaCost[4]);
	    if (manaCost[5] > 0)
	    	myText += ("<br>Colorless: " + manaCost[5]); 
	    myText += "</html>";
	    return myText;
	    
	  }





}
