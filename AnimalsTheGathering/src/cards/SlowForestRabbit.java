package cards;
public class SlowForestRabbit extends Rabbit {


  public SlowForestRabbit() {
    super(1, 2, "Slow Forest Rabbit");
    super.setManaCost(0, 1);
    super.setManaCost(1, 0);
    super.setManaCost(2, 0);
    super.setManaCost(3, 0);
    super.setManaCost(4, 0);
    super.setManaCost(5, 1);
  }

    public SlowForestRabbit(int power, int toughness, int[] manaCost) {
      super(power, toughness, "Slow Forest Rabbit");
      super.setManaCost(manaCost);
      
    }



}
