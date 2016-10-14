/* file: smallestNumber.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 3 Question 5.12
 * due date: 09/22/2016
 * version: 1.3
 *
 * This file contains a while loop that finds the smallest
 * number thats square is less than 12,000.
 */


public class smallestNumber {
  public static void main(String[] args) {
   
	int n = 0;
	// Checks if the number's square is less than 12000
    while (n * n < 12000) {
      n++;
    }
    // Displays the output
    System.out.println("The smallest integer thats square is > 12,000 is: " + n);
  }
}
