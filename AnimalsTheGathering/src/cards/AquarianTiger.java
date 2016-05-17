package cards;
public class AquarianTiger extends Tiger {


  public AquarianTiger() {
    super(4, 3, "Aquarian Tiger");
    super.setManaCost(0, 1);
    super.setManaCost(1, 1);
    super.setManaCost(2, 0);
    super.setManaCost(3, 0);
    super.setManaCost(4, 0);
    super.setManaCost(5, 2);
    super.setImage("images/aquarianTiger.jpg");
  }

    public AquarianTiger(int power, int toughness, int[] manaCost) {
      super(power, toughness, "Aquarian Tiger");
      super.setManaCost(manaCost);
      super.setImage("images/aquarianTiger.jpg");
    }



}