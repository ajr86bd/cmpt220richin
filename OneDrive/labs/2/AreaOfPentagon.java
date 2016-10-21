/* file: AreaOfPentagon.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 2 Question 4.1
 * due date: 09/14/2016
 * version: 1.3
 *
 *AreaOfPentagon
 * This file contains an equation for calculating an area 
 * of a particular shape type.
 */

import java.util.Scanner;
public class AreaOfPentagon {
  public static void main(String[] args) {
	// Creates scanner
    Scanner input = new Scanner(System.in);
    // Prompts user for input on length of side
    System.out.println("What is r?");
	// r is length from center of pentagon
    double r = input.nextDouble();
    // s is the length of a side
	double s = 2 * r * Math.sin(Math.PI / 5);
	// Calculates area
	double area = (5 * s * s) /( 4 * Math.tan(Math.PI / 5));
	// Prompts the user with area
	System.out.format("%.2f", area);
  }
}