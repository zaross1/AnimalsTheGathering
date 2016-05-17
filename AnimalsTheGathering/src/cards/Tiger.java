package cards;

public class Tiger extends Mammal {

      public Tiger(int power, int toughness, String name) {
        super();
        super.setPower(power);
        super.setToughness(toughness);
        super.setName(name);
        super.addType("Tiger");
        super.setCurrentPower(super.getPower());
        super.setCurrentToughness(super.getToughness());
      }



}