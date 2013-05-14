public class DicTest {
  public static void main(String[] args) {
  	Dice singleDice = new Dice();
  	Dice x3Dice = new TrippleDice();
  	System.out.println("Single roll output: " + singleDice.RollDice());
  	System.out.println("Single roll output: " + singleDice.RollDice());
  	System.out.println("Single roll output: " + singleDice.RollDice());
  	System.out.println("Single roll output: " + singleDice.RollDice());
  	System.out.println("Single roll output: " + singleDice.RollDice());
  	System.out.println("Single roll output: " + singleDice.RollDice());
  	System.out.println("Single roll output: " + singleDice.RollDice());
  	System.out.println("Single roll output: " + singleDice.RollDice());
  	System.out.println("Single roll output: " + singleDice.RollDice());
  	System.out.println("Single roll output: " + singleDice.RollDice());
  	singleDice.RollHistory();
  	
  	System.out.println("TrippleDice roll output: " + x3Dice.RollDice());
  	System.out.println("TrippleDice roll output: " + x3Dice.RollDice());
  	System.out.println("TrippleDice roll output: " + x3Dice.RollDice());
  	System.out.println("singleDice rollcount: " + singleDice.RollCountMsg());
  	System.out.println("x3Dice rollcount: " + x3Dice.RollCountMsg());
  }
}
