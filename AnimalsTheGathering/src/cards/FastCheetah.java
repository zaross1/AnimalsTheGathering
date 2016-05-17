package cards;

public class FastCheetah extends Cheetah {

  public FastCheetah() {
    super(5, 2, "Fast Cheetah");
    super.setManaCost(0, 2);
    super.setManaCost(1, 0);
    super.setManaCost(2, 0);
    super.setManaCost(3, 0);
    super.setManaCost(4, 0);
    super.setManaCost(5, 2);
    super.setHasSummoningSickness(false);
  }

    public FastCheetah(int power, int toughness, int[] manaCost) {
      super(power, toughness, "Fast Cheetah");
      super.setManaCost(manaCost);
    }
    
    public void firstStrike() {
    	System.out.print("first strike");
    }
    
    

}

