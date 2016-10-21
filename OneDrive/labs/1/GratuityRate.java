/* file: GratuityRate.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 1 Question 2.5
 * due date: 09/07/2016
 * version: 1.3
 *
 * This file contains the declaration of GratuityRate abrastract data 
 * type.
 */

import java.util.Scanner;
/**
 * GratuityRate
 * 
 * This class implements an equation to calculate the gratuity
 * rate and then displays the output.
 */
public class GratuityRate {
  public static void main(String[] args){
    /* Initializes the subtotal, gratuity and total values as doubles, 
     *  allowing you the enter the input as a decimal
     */
    double subtotal;
    double gratuity;
    double total;
   
    // Creates a Scanner
    Scanner input = new Scanner(System.in);
    
    // Receives the amount for the subtotal
    System.out.println("Enter a subtotal: ");
    subtotal = input.nextDouble();
    
    // Receives the amount for the gratuity percentage
    System.out.println("Enter a gratuity rate: ");
    gratuity = input.nextDouble();

    // Calculates the gratuity
    gratuity = (subtotal * gratuity)/100; //changed rate to gratuity
   
    // Calculates the total
    total = subtotal + gratuity;
    
    // Displays the final output of the gratuity + the total
    System.out.println("The gratuity is " + gratuity + " and the total is " + total);
  }
}