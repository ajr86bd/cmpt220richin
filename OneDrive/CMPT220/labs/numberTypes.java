/* file: numberTypes.java 
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 3 Exercise 5.1
 * due date: 09/22/2016
 * version: 1.3
 *
 * This file contains the declaration of numberTypes abstract data 
 * type. It shows the user what numbers are negative and what are
 * positive. It then calculates the average of all the numbers 
 * as well as the total.
 */
import java.util.Scanner;

public class numberTypes {
  public static void main(String[] args){
	// Creates scanner Object
    Scanner input = new Scanner(System.in);
    // Prompts user for integers
    System.out.println("Enter an integer, the input ends if it is 0:");
    
    int negativeNumbers = 0;
    int positiveNumbers = 0;
    double total = 0;
    int i = 0;
    // Checks if the integer(s) is 0 or not
    while ((i = input.nextInt()) != 0) {
    total = total + i;
     // Checks if it is greater than zero
     if (i>0) {
      positiveNumbers++;
     // Checks if it is less than zero
     } else if (i<0) {
      negativeNumbers++;
      }
    }
    // If it equals zero, it shows output
    if (positiveNumbers+negativeNumbers==0) {
      System.out.println("No numbers are entered except 0");
    }
    // Output
    System.out.println("The amount of positive numbers is " + positiveNumbers);
    System.out.println("The amount of negative numbers is " + negativeNumbers);
    System.out.println("The total of all the numbers is " + total);
    System.out.println("The average of all the numbers is " + (total / (positiveNumbers + negativeNumbers)));
  }
}