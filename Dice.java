/** *  */
/** * @author dhuynh * */
/*--------------- Parent Class Dic ---------------*/
public class Dice {
  private int numberofrolls = 0;
  private int numberofdices = 1;
  private int []array = new int[10];
  public void setDiceCount(int n) { /*--------------- Set number of dices ---------------*/
  	numberofdices = n;
  }

  public Dice() { /*--------------- Dice Constructor    ---------------*/
  	numberofrolls = 0;
  	numberofdices = 1;
  }

  public int RollDice() /*--------------- Roll Dice(s) and increment RollCounts    ---------------*/{
  	int rndno;
  	rndno = (1 + (int) (Math.random() * 6)) * numberofdices;
  	array[numberofrolls] = rndno;
  	numberofrolls++;
  	return rndno;
  	
  }

  public void RollHistory() {
  	int i;
  	System.out.println("The last 10 rolls are:");
  	for (i = 0; i < 10; i++)
  	{
  		System.out.println(array[i]);
  	}
  }

  public int RollCount() {
  	return numberofrolls;
  }

  public String RollCountMsg() {
  	return "Dices rolled thus far: " + numberofrolls;
  }
}
