package cards;

public class Cheetah extends Mammal {

      public Cheetah(int power, int toughness, String name) {
        super();
        super.setPower(power);
        super.setToughness(toughness);
        super.setName(name);
        super.addType("Cheetah");
        super.setHasSummoningSickness(false);
        super.setCurrentPower(super.getPower());
        super.setCurrentToughness(super.getToughness());
      }

}