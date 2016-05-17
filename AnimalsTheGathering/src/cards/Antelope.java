package cards;

public class Antelope extends Mammal {

      public Antelope(int power, int toughness, String name) {
        super();
        super.setPower(power);
        super.setToughness(toughness);
        super.setName(name);
        super.addType("Antelope");
        super.setCurrentPower(super.getPower());
        super.setCurrentToughness(super.getToughness());
      }



}

