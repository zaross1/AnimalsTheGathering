package cards;
public class AngryForestRabbit extends Rabbit {


      public AngryForestRabbit() {
        super(4, 1, "Angry Forest Rabbit");
        super.setManaCost(0, 2);
        super.setManaCost(1, 0);
        super.setManaCost(2, 0);
        super.setManaCost(3, 0);
        super.setManaCost(4, 0);
        super.setManaCost(5, 2);
      }


      public AngryForestRabbit(int power, int toughness, int[] manaCost) {
        super(power, toughness, "Angry Forest Rabbit");
        super.setManaCost(manaCost);
      }

}
