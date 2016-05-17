package cards;
public class CoolButterfly extends Butterfly {


  public CoolButterfly() {
    super(4, 1, "Cool Butterfly");
    super.setManaCost(0, 2);
    super.setManaCost(1, 0);
    super.setManaCost(2, 0);
    super.setManaCost(3, 0);
    super.setManaCost(4, 0);
    super.setManaCost(5, 3);
    super.setImage("images/coolButterfly.jpg");
  }

    public CoolButterfly(int power, int toughness, int[] manaCost) {
      super(power, toughness, "Cool Butterfly");
      super.setManaCost(manaCost);
      super.setImage("images/coolButterfly.jpg");
    }



}