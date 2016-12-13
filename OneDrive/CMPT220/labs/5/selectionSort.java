/* file: selectionSort.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 5 Question 7.20
 * due date: 10/06/2016
 * version: 1.3
 *
 * This file contains the declaration of selectionSort that
 * orders a list of integers from least to greatest using
 * loops and the selection sort method.
 */
import java.util.Scanner;

public class selectionSort {
  public static void main(String[] args) {
	// Create Scanner object
    Scanner input = new Scanner(System.in);
	
    int[] integers = new int[10];
	
    // Prompt user to enter input (10 numbers)
	System.out.print("Please type in 10 numbers separated by spaces:");
	
	//Checks through numbers 
	for (int index=0; index<integers.length; index++) {
	  integers[index] = input.nextInt();
	}
	// Displays output of sorted numbers
	System.out.print("Sorted list of integers:");
	 
	selectionSortMethod(integers);
	for (int C=0; C<integers.length; C++) {
	  System.out.print(integers[C] + " ");
	}
  }
  public static void selectionSortMethod(int[] set) {
    for (int A=set.length-1; A>0; A--) {
	  int maximum = set[A];
	  int maximumIn = A;
	  for (int B = 0; B<A; B++) {
	    if (maximum<set[B]) {
	      maximum = set[B];
	      maximumIn = B;
	    }
	  }
	  // Swap variables if it is required to do so
	  if (maximumIn != A) {
	    set[A] = maximum;
	    set[maximumIn] = set[A];
	  }
    }
  }
}
