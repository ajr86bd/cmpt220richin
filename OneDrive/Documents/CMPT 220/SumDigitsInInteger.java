 /* file: SumDigitsInInteger.java
  * author: Alexander Richin
  * course: CMPT 220
  * assignment: Lab 1 Question 2.6
  * due date: 09/07/2016
  * version: 1.3
  *
  * This file contains the declaration of SumDigitsInInteger abrastract data 
  * type.
  */

import java.util.Scanner;

/**
 * SumDigitsInInteger
 * 
 * This class implements an equation to calculate the sum of
 * three seperate integers and display the results. 
 */

public class SumDigitsInInteger {
  public static void main(String[] args) {

    int number;
    int lastDigit;
    int remainingNumber;
    int secondLastDigit;
    int thirdLastDigit;
    int sum;
    // Create a scanner
    Scanner input = new Scanner(System.in);
    
    // Receive the integer
    System.out.println("Enter an integer between 0 and 1000");
    number = input.nextInt();
  
    // Find the last digit
    lastDigit = number % 10;
   
    // Find the remaining number
    remainingNumber = number / 10;
   
    // Find the second to last digit
    secondLastDigit = remainingNumber % 10;

    remainingNumber /=10;

    // Find the third to last digit if there is one
    thirdLastDigit = remainingNumber % 10;
    
    // Calcluates the sum of all three digits found
    sum = lastDigit + secondLastDigit + thirdLastDigit;
    
    // Displays the results
    System.out.println("The sum of the digit is " + sum);
  }
}