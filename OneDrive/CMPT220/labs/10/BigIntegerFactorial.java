/* file: BigIntegerFactorial.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 10 Question 18.01
 * due date: 11/17/2016
 * version: 1.0.8_111
 *
 * This file contains the declaration of BigIntegerFactorial abrastract data 
 * type.
 * This class implements a method to find the factorial of a large number.
 * The method is implemented using recursion. The basis of the program is
 * to ask the user to input a number and the show the factorial of that
 * number.
 */

import java.math.*;
import java.util.Scanner;

public class BigIntegerFactorial {
  public static void main(String[] args) {
    // Creates a Scanner object
    Scanner input = new Scanner(System.in);
    // Prompts user to input a number
    System.out.println("  Please type in any number here: ");
    // Receives input into variable
    String integer = input.next();

    // Displays output of factorial
    System.out.println("  Number Factorial = " 
        + integerFactorial(new BigInteger(integer)));
  }

  public static BigInteger integerFactorial(BigInteger integer) {
    if (integer.equals(BigInteger.ZERO)) 
      return BigInteger.ONE;
    else 
      return integer.multiply(integerFactorial(integer.subtract(BigInteger.ONE)));
  }
}
