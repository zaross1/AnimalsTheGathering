package cards;
public class FrightenedForestRabbit extends Rabbit {


  public FrightenedForestRabbit() {
    super(3, 1, "Frightened Forest Rabbit");
    super.setManaCost(0, 2);
    super.setManaCost(1, 0);
    super.setManaCost(2, 0);
    super.setManaCost(3, 0);
    super.setManaCost(4, 0);
    super.setManaCost(5, 1);
  }

    public FrightenedForestRabbit(int power, int toughness, int[] manaCost) {
      super(power, toughness, "Frightened Forest Rabbit");
      super.setManaCost(manaCost);
    }



}
