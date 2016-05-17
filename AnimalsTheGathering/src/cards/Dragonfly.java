package cards;

public class Dragonfly extends Insect {

      public Dragonfly(int power, int toughness, String name) {
        super();
        super.setPower(power);
        super.setToughness(toughness);
        super.setName(name);
        super.addType("Dragonfly");
        super.setCurrentPower(super.getPower());
        super.setCurrentToughness(super.getToughness());
      }

}