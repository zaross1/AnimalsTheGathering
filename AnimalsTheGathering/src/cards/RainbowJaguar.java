package cards;


public class RainbowJaguar extends Jaguar {


  public RainbowJaguar() {
    super(4, 2, "Rainbow Jaguar");
    super.setManaCost(0, 1);
    super.setManaCost(1, 0);
    super.setManaCost(2, 1);
    super.setManaCost(3, 0);
    super.setManaCost(4, 0);
    super.setManaCost(5, 3);
    super.setImage("images/rainbowJaguar.jpg");  
  }

  public RainbowJaguar(int power, int toughness, int[] manaCost) {
      super(power, toughness, "Rainbow Jaguar");
      super.setManaCost(manaCost);
      super.setImage("images/rainbowJaguar.jpg"); 
    }



}

