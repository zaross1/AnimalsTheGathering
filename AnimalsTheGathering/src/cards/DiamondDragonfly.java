package cards;
public class DiamondDragonfly extends Dragonfly {


  public DiamondDragonfly() {
    super(1, 2, "Diamond Dragonfly");
    super.setManaCost(0, 0);
    super.setManaCost(1, 0);
    super.setManaCost(2, 2);
    super.setManaCost(3, 0);
    super.setManaCost(4, 0);
    super.setManaCost(5, 0);
    super.setImage("images/diamondDragonfly.jpg");
  }

    public DiamondDragonfly(int power, int toughness, int[] manaCost) {
      super(power, toughness, "Diamond Dragonfly");
      super.setManaCost(manaCost);
      super.setImage("images/diamondDragonfly.jpg");
    }



}