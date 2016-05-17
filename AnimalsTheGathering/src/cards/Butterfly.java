package cards;

public class Butterfly extends Insect {

      public Butterfly(int power, int toughness, String name) {
        super();
        super.setPower(power);
        super.setToughness(toughness);
        super.setName(name);
        super.addType("Butterfly");
        super.setCurrentPower(super.getPower());
        super.setCurrentToughness(super.getToughness());
      }

}