package cards;
public class BlueInfinity extends Flower {


  public BlueInfinity() {
    super(1, 4, "Blue Infinity");
    super.setManaCost(0, 1);
    super.setManaCost(1, 0);
    super.setManaCost(2, 0);
    super.setManaCost(3, 1);
    super.setManaCost(4, 0);
    super.setManaCost(5, 1);
    super.setImage("images/blueInfinity.jpg");
  }

    public BlueInfinity(int power, int toughness, int[] manaCost) {
      super(power, toughness, "Blue Infinity");
      super.setManaCost(manaCost);
      super.setImage("images/blueInfinity.jpg");
    }



}