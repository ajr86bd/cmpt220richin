/* file: Location2.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 6 Question 9.13
 * due date: 10/19/2016
 * version: 1.8.0_101
 *
 * This file contains the declaration of Location2 abstract data 
 * type.
 */

// Run from this file
import java.util.Scanner;

public class Location2 {
public static void main(String[] args) {
  // Creates a scanner object
  Scanner input = new Scanner(System.in);
  // Prompts user to input length of rows + columns
  System.out.println("Please input row and column length");
  // Receives input from user
  int row=input.nextInt();
  int col=input.nextInt();
  // Prompts user to input numbers in the array
  System.out.println("Please input array values");
  // Creates a double array
  double nums[][] = new double[row][col];
  // Iterates through number of rows + columns to find largest number
  for (int i=0; i<row; i++) {
    for (int j=0; j<col; j++){
      nums[i][j] = input.nextDouble();
    }
  }
  Location maxVal=new Location(0,0);
  maxVal=maxVal.locateLargest(nums, row, col);
  // Displays output of largest element location
  System.out.println("The location of the largest element is " + maxVal.maxValue + " at "
    + maxVal.row +", " + maxVal.col);
  }
}