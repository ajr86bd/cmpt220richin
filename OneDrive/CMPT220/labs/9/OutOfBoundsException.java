/* file: OutOfBoundsException.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 9 Question 12.3
 * due date: 11/10/2016
 * version: 1.8.0_111
 *
 * This file contains the declaration of OutOfBoundsException abstract data 
 * type. This method returns an element based on user input or that the 
 * input is out of bounds of the array.
 */

import java.util.Scanner;

public class OutOfBoundsException {
  public static void main(String[] args) {
  	// Creates Scanner object
    Scanner input = new Scanner(System.in);
    // Prompts user for input
    System.out.println("Enter a number 0-99");
    // Stores input in a variable
    int number = input.nextInt();

    // Creates an array of elements to be chosen at random
    int[] random = new int[100];

    // Fills array
    for (int i=0; i<100; i++) {
      random[i]=(int)(Math.random() * 200); 
    }

    // Checks if number is out of bounds or not
    if (number < 0 || number >= 100) 
      System.out.println("Out of Bounds");
    else 
      System.out.println(random[number]);
  }
}
