/* file: DaysOfMonth.java
 * author: Alexander Richin
 * course: CMPT 220 - Rivas
 * assignment: Lab 10 Question 3.11
 * due date: 11/17/2016
 * version: 1.0.8_111
 *
 * This file contains the declaration of the BigIntFactorial 
 * abstract data type.
 */
import java.math.*;
import java.util.Scanner;
/**
 * BigIntFactorial
 * 
 * This class implements an equation to calculate the factorial
 * of a number given by the user. 
 */
public class BigIntFactorial {
  public static void main(String[] args) {
    // Create a Scanner Object
    Scanner input = new Scanner(System.in);
    // Prompts user to enter a number
    System.out.print("Enter an integer: ");
    int n = input.nextInt();
    BigInteger b= new BigInteger(n+"");
    // Displays the factorial of the given number
    System.out.println("Factorial of " + n + " is " 
        + factorial(b));
  }
  public static BigInteger factorial(BigInteger n) {
    if (n.equals(BigInteger.ZERO)) 
      return BigInteger.ONE; 
    else
      return n.multiply(factorial(n.subtract(BigInteger.ONE)));
  }
}