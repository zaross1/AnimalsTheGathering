package cards;
public class DimWittedForestRabbit extends Rabbit {


  public DimWittedForestRabbit() {
    super(0, 3, "Dim-witted Forest Rabbit");
    super.setManaCost(0, 1);
    super.setManaCost(1, 0);
    super.setManaCost(2, 0);
    super.setManaCost(3, 0);
    super.setManaCost(4, 0);
    super.setManaCost(5, 2);
  }

    public DimWittedForestRabbit(int power, int toughness, int[] manaCost) {
      super(power, toughness, "Dim-witted Forest Rabbit");
      super.setManaCost(manaCost);
    }



}
