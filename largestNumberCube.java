/* file: largestNumberCube.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 1 Question 2.1
 * due date: 09/22/2016
 * version: 1.3
 *
 * This file contains an equation to compute the
 * largest number thats cube is less than 12,000.
 * It uses a while loop to check what the integer is.
 */


public class largestNumberCube {
  public static void main(String[] args) {
    int n = 0;
    // Checks if number cubed is less than 12,000
    while ((n * n * n) < 12000) {
      // If so, add 1 to the number
      n++;	   
    }
    int largestNumber = n - 1;
    // Displays output
    System.out.println(largestNumber); 
  }
}