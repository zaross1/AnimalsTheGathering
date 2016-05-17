package cards;
public class ButterflyDebris extends Butterfly {


  public ButterflyDebris() {
    super(3, 1, "Butterfly Debris");
    super.setManaCost(0, 1);
    super.setManaCost(1, 0);
    super.setManaCost(2, 0);
    super.setManaCost(3, 0);
    super.setManaCost(4, 2);
    super.setManaCost(5, 1);
    super.setImage("images/butterflyDebris.jpg");
  }

    public ButterflyDebris(int power, int toughness, int[] manaCost) {
      super(power, toughness, "Butterfly Debris");
      super.setManaCost(manaCost);
      super.setImage("images/butterflyDebris.jpg");
    }



}