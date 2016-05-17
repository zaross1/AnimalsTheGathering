package cards;

public class Seaweed extends Plant {

      public Seaweed(int power, int toughness, String name) {
        super();
        super.setPower(power);
        super.setToughness(toughness);
        super.setName(name);
        super.addType("Seaweed");
        super.setCurrentPower(super.getPower());
        super.setCurrentToughness(super.getToughness());
      }



}

