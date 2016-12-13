/* file: smallestElement.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 4 Question 7.9
 * due date: 09/28/2016
 * version: 1.3
 *
 * This file contains the declaration of smallestElement
 * that implements a method to find the smallest element
 * in an array of double values. 
 * 
 */

import java.util.Scanner;

public class smallestElement {
  public static void main(String[] args) {
	// Creates Scanner object
    Scanner input = new Scanner(System.in);
	// Prompts user for input
    System.out.print("Enter ten numbers:");
    
    // Creates an array to hold values
    double[] numbers = new double[10];
	
    // Checks the array	 
    for (int i = 0; i < numbers.length; i++) {
	  numbers[i] = input.nextDouble();
	}
    // Displays output
    System.out.println("The smallest element in the array is: " 
      + minimum(numbers));
  }
  public static double minimum(double[] array) {
    double smallest = array[0];
	
    // Checks for minimum value
    for (int j = 1; j < array.length; j++) {
	  if (smallest > array[j]) {
	    smallest = array[j];
	  }
	}
    // Returns the minimum value
	return smallest;
  }
}
