/* file: AreaOfPolygon.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 2 Question 4.5
 * due date: 09/14/2016
 * version: 1.3
 *
 * This file contains the declaration of AreaOfPentagon abrastract data 
 * type.
 */
import java.util.Scanner;
/**
 * CelsiusToFahrenheit
 * 
 * This class implements an equation to calculate the area of
 * a polygon. 
 */

public class AreaOfPolygon {
  public static void main(String[] args) {
    // Creates scanner
	Scanner input = new Scanner(System.in);
	// Prompt user for number of sides
	System.out.println("What is the number of sides?");
	int sides = input.nextInt();
	// Prompt user for length of sides
	System.out.println("What is the length of the sides?");
	double s = input.nextDouble();
	// Calculates area of polygon
	double area = (sides * s * s) / (4 * Math.tan(Math.PI / sides));
	// Prompts user with answer
	System.out.print(area);
  }
}