package cards;
public class BlueRose extends Flower {


  public BlueRose() {
    super(2, 1, "Blue Rose");
    super.setManaCost(0, 1);
    super.setManaCost(1, 0);
    super.setManaCost(2, 0);
    super.setManaCost(3, 2);
    super.setManaCost(4, 0);
    super.setManaCost(5, 1);
    super.setImage("images/blueRose.jpg");
  }

    public BlueRose(int power, int toughness, int[] manaCost) {
      super(power, toughness, "Blue Rose");
      super.setManaCost(manaCost);
      super.setImage("images/blueRose.jpg");
    }



}