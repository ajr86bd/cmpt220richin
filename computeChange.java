/* file: computeChange.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 2 Question 4.26
 * due date: 09/14/2016
 * version: 1.3
 *
 * This file contains the declaration of computeChange abstract data 
 * type. It shows the exact total of change from the user input in
 * dollars, quarters, dimes, nickels, and pennies, using equations to 
 * determine the total of each.
 */
import java.util.Scanner;
/**
 * computeChange
 * 
 * This class implements equations to calculate the conversion of
 * a number to how much change there is exactly. 
 */

public class computeChange{
  public static void main(String[] args){
    // Creates scanner
	Scanner input = new Scanner(System.in);
	 
	// Prompt user for total which will be received by the code 
	System.out.print("Enter an total in double, for example 11.56: ");
	String total = input.next();
	
	// Creates remaining change variable to calculate what change is left over
	int remainingChange = Integer.parseInt(total.substring(total.indexOf('.') + 1));
	// Creates the integer value dollars
	int dollars = Integer.parseInt(total.substring(0,total.indexOf('.')));
	 
	// Interprets the total total of quarters remaining
	int quarters = remainingChange / 25;
	    remainingChange = remainingChange % 25;
	 
	// Finds the total total of dimes that are remaining 
	int dimes = remainingChange / 10;
	    remainingChange = remainingChange % 10;
	 
	// Finds nickels
	int nickels = remainingChange / 5;
	    remainingChange = remainingChange % 5;
	 
	// Finds pennies from what remains
	int pennies = remainingChange;
	 
	// Prints to the screen the finalized output
	System.out.println("Your total " + total + " consists of"); 
	System.out.println("    " + dollars + " dollars");
	System.out.println("    " + quarters + " quarters ");
	System.out.println("    " + dimes + " dimes"); 
	System.out.println("    " + nickels + " nickels");
	System.out.print(  "    " + pennies + " pennies");  
  }
}
