package cards;

public class Turtle extends Reptile {

      public Turtle(int power, int toughness, String name) {
        super();
        super.setPower(power);
        super.setToughness(toughness);
        super.setName(name);
        super.addType("Turtle");
        super.setCurrentPower(super.getPower());
        super.setCurrentToughness(super.getToughness());
      }



}

