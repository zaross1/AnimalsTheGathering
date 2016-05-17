package cards;

public class Wolf extends Mammal {

      public Wolf(int power, int toughness, String name) {
        super();
        super.setPower(power);
        super.setToughness(toughness);
        super.setName(name);
        super.addType("Wolf");
        super.setCurrentPower(super.getPower());
        super.setCurrentToughness(super.getToughness());
      }



}