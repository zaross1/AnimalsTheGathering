package cards;
public class Aslan extends Lion {


  public Aslan() {
    super(4, 6, "Aslan");
    super.setManaCost(0, 1);
    super.setManaCost(1, 0);
    super.setManaCost(2, 2);
    super.setManaCost(3, 0);
    super.setManaCost(4, 0);
    super.setManaCost(5, 2);
    super.setImage("images/aslan.jpg");
  }

    public Aslan(int power, int toughness, int[] manaCost) {
      super(power, toughness, "Asland");
      super.setManaCost(manaCost);
      super.setImage("images/aslan.jpg");
    }



}