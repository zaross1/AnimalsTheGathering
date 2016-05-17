package cards;



public class SlowCheetah extends Cheetah {

  public SlowCheetah() {
    super(3, 2, "Slow Cheetah");
    super.setManaCost(0, 1);
    super.setManaCost(1, 0);
    super.setManaCost(2, 0);
    super.setManaCost(3, 0);
    super.setManaCost(4, 0);
    super.setManaCost(5, 3);
    super.setHasSummoningSickness(false);
  }

    public SlowCheetah(int power, int toughness, int[] manaCost) {
      super(power, toughness, "Slow Cheetah");
      super.setManaCost(manaCost);
    }
    
    public void firstStrike() {
    	System.out.print("first strike");
    }
    
    

}
