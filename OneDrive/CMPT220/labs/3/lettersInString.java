/* file: lettersInString.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 4 Question 6.20
 * due date: 09/28/2016
 * version: 1.3
 *
 * This file contains the declaration of PhoneKeyPad abstract data 
 * type.
 */

import java.util.Scanner;
public class lettersInString {
  public static void main(String[] args) {
	// Creates scanner object
    Scanner input = new Scanner(System.in);
    // Prompts user to enter a string
	System.out.print("Please Enter a string: ");
	// Receives input from user
	String stringInput = input.nextLine();
	// Displays output
	System.out.println("The number of letters is " + letters(stringInput));
  }
  public static int letters(String stringInput) {
    // Iterates through characters in the string
	int count = 0;
	for (int stringLength = 0; stringLength < stringInput.length(); stringLength++) {
	  if (let (stringInput.charAt(stringLength))) {
	    count++;
	  }
	}
	return count;
  }
  public static boolean let(char characters) {
    return ((characters <= 'z' && characters >= 'a') 
    		 || (characters <= 'Z' && characters >= 'A'));
  }	
}
