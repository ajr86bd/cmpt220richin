/* file: SortThreeIntegers.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 2 Question 3.8
 * due date: 09/14/2016
 * version: 1.3
 *
 * This file contains the declaration of SortThreeIntegers abrastract data 
 * type.
 */

import java.util.Scanner;
/**
 * SortThreeIntegers
 * 
 * This class implements a method to sort three
 * integers provided by the user's input. 
 */

public class SortThreeIntegers {
  public static void main(String[] args) {
    // Creates Scanner
	Scanner input = new Scanner(System.in);
	// Prompts user for first integer
	System.out.println("What is the first number: ");
	// Receives user input for first integer
	int number1 = input.nextInt();
	// Prompts user for second integer
    System.out.println("what is the second number: ");
    // Receives user input for second integer
	int number2 = input.nextInt();
	// Prompts user for third integer
	System.out.println("What is the third number: ");
	// Receives user input for third integer
	int number3 = input.nextInt();
		  	
	// Creates a temporary integer value to be swapped with	  	
    int temp = 0;
	  // Checks if first number is greater than second number
      if (number1 > number2) {
    	/* If first number > second number:
    	 * assign first number to temporary 
    	 */
	    temp = number1;
	    // Assign number2 to number1
		number1 = number2;
		// Then, assign the new temporary value to number 2
		number2 = temp;
	  }
        // Checks if number 1 > number 3, If so, swap number 1 with number 3      
	    if (number1 > number3) {
	      temp = number1;
		  number1 = number3;
		  number3 = temp;
	    }
		  /* Final check for if number2 is greater than number 3.
		   * If so, swap them.
		   */
		  if (number2 > number3) {
		    temp = number2;
		    number2 = number3;
		    number3 = temp;
		  }
		    // Prompts the user what the sorted three integers are
		    System.out.println(number1 + " " + number2 + " " + number3);
  }
}
