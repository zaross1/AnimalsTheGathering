package cards;

public class Snake extends Reptile {

      public Snake (int power, int toughness, String name) {
        super();
        super.setPower(power);
        super.setToughness(toughness);
        super.setName(name);
        super.addType("Snake");
        super.setCurrentPower(super.getPower());
        super.setCurrentToughness(super.getToughness());
      }



}

