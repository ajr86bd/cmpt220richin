/* file: LotteryGame.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 2 Question 3.15
 * due date: 09/14/2016
 * version: 1.3
 *
 * This file contains the declaration of LotteryGame abrastract data 
 * type.
 */
import java.util.Scanner;
/**
 * LotteryGame
 * 
 * This class implements an equation to generate a lottery
 * and give the user rewards, or not, based off of their input. 
 */

public class LotteryGame {
  public static void main(String[] args) {
    // Creates the scanner
	Scanner input = new Scanner(System.in);
	
	// Generates the lottery numbers for the program
	int lotteryNumbers = (int)(Math.random() * 1000);
	  
	// Prompts the user to enter a guess of the lottery numbers
	System.out.print("Enter your lottery pick (three digits): ");
	int guessNumbers = input.nextInt();
	 
	// Gets all the digits from lottery
	int lotteryNumber1 = (lotteryNumbers / 100);
	int lotteryNumber2 = ((lotteryNumbers % 100) / 10);
	int lotteryNumber3 = (lotteryNumbers % 10);

	System.out.println("The lottery number is: " + lotteryNumber1
	  + lotteryNumber2 + lotteryNumber3);
	 
    // Get all of the digits from the guess
	int guessNumber1 = (guessNumbers / 100);
	int guessNumber2 = ((guessNumbers % 100) / 10);
	int guessNumber3 = (guessNumbers % 10);
	 
	// Checks the guess to see if its right / semi-right / wrong
	if (guessNumbers == lotteryNumbers)
	System.out.println("Exact match: you win $10,000.");
    
    // All three match but in different orders
	else if ((guessNumber1 == lotteryNumber2 && guessNumber2 == lotteryNumber1 
		&& guessNumber3 == lotteryNumber3)
	  || (guessNumber1 == lotteryNumber2
	    && guessNumber1 == lotteryNumber3 && guessNumber3 == lotteryNumber1)
	  || (guessNumber1 == lotteryNumber3
	    && guessNumber2 == lotteryNumber1 && guessNumber3 == lotteryNumber2)
	  || (guessNumber1 == lotteryNumber3
	    && guessNumber2 == lotteryNumber2 && guessNumber3 == lotteryNumber1)
	  || (guessNumber1 == lotteryNumber1
	    && guessNumber2 == lotteryNumber3 && guessNumber3 == lotteryNumber2))
	  System.out.println("Match all digits: you win $3,000.");
	 
	 // Checks if one of the numbers is correct
	 else if (guessNumber1 == lotteryNumber1 || guessNumber1 == lotteryNumber2
	   || guessNumber1 == lotteryNumber3 || guessNumber2 == lotteryNumber1
	   || guessNumber2 == lotteryNumber2 || guessNumber2 == lotteryNumber3
	   || guessNumber3 == lotteryNumber1 || guessNumber3 == lotteryNumber2
	   || guessNumber3 == lotteryNumber3)
	  System.out.println("Match one digit: you win $1,000.");
	  
	  // No numbers from guess matched
	  else
	    System.out.println("Sorry, no match.");
  }
}
