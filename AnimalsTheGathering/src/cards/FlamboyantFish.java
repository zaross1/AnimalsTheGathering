package cards;
public class FlamboyantFish extends Fish {


  public FlamboyantFish() {
    super(0, 3, "Flamboyant Fish");
    super.setManaCost(0, 1);
    super.setManaCost(1, 0);
    super.setManaCost(2, 0);
    super.setManaCost(3, 0);
    super.setManaCost(4, 0);
    super.setManaCost(5, 2);
  }

    public FlamboyantFish(int power, int toughness, int[] manaCost) {
      super(power, toughness, "Flamboyant Fish");
      super.setManaCost(manaCost);
  }



}
