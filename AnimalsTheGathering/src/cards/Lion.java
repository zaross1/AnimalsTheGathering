package cards;

public class Lion extends Mammal {

      public Lion(int power, int toughness, String name) {
        super();
        super.setPower(power);
        super.setToughness(toughness);
        super.setName(name);
        super.addType("Lion");
        super.setCurrentPower(super.getPower());
        super.setCurrentToughness(super.getToughness());
      }



}