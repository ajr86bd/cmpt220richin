/* file: largestElement.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 5 Question 8.13
 * due date: 10/06/2016
 * version: 1.3
 *
 * This file contains the declaration of largestElement to 
 * locate the largest element of a two-dimensional array. 
 */
import java.util.Scanner;
public class Problem8_13v2 {
  public static void main(String[] args) {
	// Creates Scanner object
    Scanner input = new Scanner(System.in);
    // Prompts user to enter number or rows + columns
    System.out.println( "Enter the number of rows and columns of the array:" );
    // Receives user input
	int x = input.nextInt();
	int y = input.nextInt();
	int[] integerVal;
	// Prompts user to enter the array
	System.out.println( "Enter the array:" );
	double[][] num = new double[x][y];
	  for (int i = 0; i < x; i++) {
	    for (int i2 = 0; i2 < y; i2++) {
		  num[i][i2] = input.nextDouble();
		}
      }
	  // Displays output
	  integerVal = locateLargest(num);
	  System.out.println( "The location of the largest element is at (" 
	    + integerVal[0] + ", " + integerVal[1] + ")" );
  }
  public static int[] locateLargest(double[][] h) {
    double doubleMaximum = 0;
	int[] integer = new int[2];
	  for (int i=0; i<h.length; i++) {
	    for (int i2=0; i2<h[i].length; i2++) {
		  if (h[i][i2]>doubleMaximum) {
		    doubleMaximum = h[i][i2];
		    integer[0]=i;
		    integer[1]=i2;
		  }
		}
	  }
	  return integer;
  }
}
