package cards;

public class Fish extends Creature {

      public Fish(int power, int toughness, String name) {
        super();
        super.setPower(power);
        super.setToughness(toughness);
        super.setName(name);
        super.addType("Fish");
        super.setCurrentPower(super.getPower());
        super.setCurrentToughness(super.getToughness());
      }

}