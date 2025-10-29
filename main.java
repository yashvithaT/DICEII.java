import java.util.Random;
import java.util.Scanner;
public class Main
  {
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("Type '/me' to roll the dice...");
    String input = sc.nextLine();
    if (input.equals("/me")) {
      //player rolls twice
      int pRoll = rand.nextInt(6) + 1 + rand.nextInt(6) + 1; 
      System.out.println("You rolled: " + pRoll);
      //comp rolls twice
      int compRoll = rand.nextInt(6) + 1 + rand.nextInt(6) + 1; 
      System.out.println("The computer rolled: " + compRoll);
      if (pRoll > compRoll) {
        System.out.println("You win!"); } 
      else if (pRoll < compuRoll) {
        System.out.println("The computer wins!");
      } else {
        System.out.println("It's a tie!");
      }
    } else {
      System.out.println("You didn't type '/me'. Try again.");
        }
    sc.close();
  }
}
