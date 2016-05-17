package cards;



public class Jaguar extends Mammal {

      public Jaguar(int power, int toughness, String name) {
        super();
        super.setPower(power);
        super.setToughness(toughness);
        super.setName(name);
        super.addType("Jaguar");
        super.setCurrentPower(super.getPower());
        super.setCurrentToughness(super.getToughness());
      }

}