/* file: Location.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 6 Question 9.13
 * due date: 10/19/2016
 * version: 1.8.0_101
 *
 * This file contains the declaration of Location abstract data 
 * type.
 */

public class Location {
	// Initializes variables
  public static int row, col;
  public static double maxValue;
  // Method for location
  public Location (int row, int col) {
    this.row = row;
    this.col = col;
    this.maxValue= 0;
  }
  // Locates largest element
  public static Location locateLargest (double[][] a, int r, int c) {
    Location maxVal= new Location(0,0);
    for (int i=0; i<r; i++) {
      for (int j=0; j<c; j++) {
        if (a[i][j]>maxValue){
          maxValue=a[i][j];
          row=i;
          col=j;
        }
      }
    }
    // Returns the largest element
    return maxVal;
  } 
}
