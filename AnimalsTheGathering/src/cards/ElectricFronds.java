package cards;
public class ElectricFronds extends Seaweed {


  public ElectricFronds() {
    super(2, 2, "Electric Fronds");
    super.setManaCost(0, 0);
    super.setManaCost(1, 0);
    super.setManaCost(2, 0);
    super.setManaCost(3, 1);
    super.setManaCost(4, 0);
    super.setManaCost(5, 2);
    super.setImage("images/eletricFronds.jpg");
  }

    public ElectricFronds(int power, int toughness, int[] manaCost) {
      super(power, toughness, "Electric Fronds");
      super.setManaCost(manaCost);
      super.setImage("images/electricFronds.jpg");
    }



}