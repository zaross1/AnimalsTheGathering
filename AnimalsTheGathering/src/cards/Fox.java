package cards;

public class Fox extends Mammal {

      public Fox(int power, int toughness, String name) {
        super();
        super.setPower(power);
        super.setToughness(toughness);
        super.setName(name);
        super.addType("Fox");
        super.setCurrentPower(super.getPower());
        super.setCurrentToughness(super.getToughness());
      }



}

