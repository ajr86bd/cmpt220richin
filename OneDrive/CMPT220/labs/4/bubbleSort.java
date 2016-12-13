/* file: bubbleSort.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 4 Question 7.18
 * due date: 09/28/2016
 * version: 1.3
 *
 * This file contains the declaration of bubbleSort that
 * orders a list of integers from least to greatest using
 * loops.
 */
import java.util.Scanner;
public class bubbleSort {
  public static void main(String[] args) {
	// Creates Scanner object
    Scanner input = new Scanner(System.in);
    
    // Creates an array of double values
	double[] nums = new double[10];
		 
	// Prompts user for input
	System.out.print("Enter ten numbers:");
	
	// Checks the numbers order
	for (int k=0; k<nums.length; k++) {
	  nums[k] = input.nextDouble();
	}
	bubbleSortMethod(nums);
	
	// Displays output
	System.out.println("The array after sorting it is:");
	// Checks number order
	for (int j=0; j<nums.length; j++) {
	  // Displays output
	  System.out.println(nums[j]);
	}	   
  }
  public static void bubbleSortMethod(double[] list) {
    int num = list.length - 1;
    
	while (num != 0) {
	  int j;
	  for ( j=0; j<num; j++) {
	    if (list[j] > list[j + 1]) {
		  double temp = list[j];
		    list[j] = list[j + 1];
		    list[j + 1] = temp;
		}    
      }
	  num=j-1;
	}
  }
}
