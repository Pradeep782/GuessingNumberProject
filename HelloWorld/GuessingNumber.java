package mypack;
// imported the packages for generating random number and for taking the user input
import java.util.Random;
import java.util.Scanner;

// created a class named Game with the variables and as well as the getters and setters.
class Game{
	  public int number;
	  public int inputNumber;
	  public int noOfGuesses = 0;
	  
	  public int getNoOfGuesses() {
		  return noOfGuesses;
	  }
	  public void setNoOfGuesses(int noOfGuesses) {
		  this.noOfGuesses = noOfGuesses;
	  }
	// invoking the constructor of game class will generate the random number.
	Game(){
		Random rand = new Random();
		this.number = rand.nextInt(100);
	}
	
	// method that takes user input 
	void takeUserInput() {
		System.out.println("Guess any number till 100");
		Scanner sc = new Scanner(System.in);
		inputNumber = sc.nextInt();  
		System.out.println(" ");

	}
	// method that checks whether guessed number matches with the random number or not.
	boolean isCorrectNumber() {
		noOfGuesses++;
		if(inputNumber == number) {
			System.out.format("Yes you have guessed the exact number, it was %d\n You guessed it in %d attempts", number, noOfGuesses);
			return true;
		}else if(inputNumber < number) {
			System.out.println("Number entered is too less");
		}else if(inputNumber > number) {
			System.out.println("Number entered is too high");
		}
		return false;
	}
}
public class GuessingNumber {

	public static void main(String[] args) {
		  
		// invoking the game constructor to generate the random number.
          Game g = new Game();
        // assigning boolean value with the default value false.
          boolean b = false;
        
        // while b is not true executing the while loop.
          while(!b) {
        	  g.takeUserInput();
        	  b = g.isCorrectNumber();
          }
          
          
	}

}
