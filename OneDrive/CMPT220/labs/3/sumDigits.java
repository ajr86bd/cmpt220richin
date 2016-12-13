/* file: sumDigits.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 3 Question 6.2
 * due date: 09/22/2016
 * version: 1.3
 *
 * This file contains the declaration of sumDigitsInt to compute 
 * the sum of digits. It uses and equation to calculate the sum.
 */
import java.util.Scanner;
public class sumDigits {
  public static void main(String[] args) {
	// Creates scanner object
    Scanner input = new Scanner(System.in);
    // Prompts user to enter an integer
    System.out.print("Enter an integer:");
    // Receives input
    long number = input.nextLong();
	// Displays output
	System.out.println("The sum is " + sumDigits(number));
  }
  public static int sumDigits(long number) {
    int intSum = 0;
	do { 
	  intSum += number % 10;
	} 
	// Checks the number
	while ((number = number / 10) != 0);
	    return intSum;
  }
}
