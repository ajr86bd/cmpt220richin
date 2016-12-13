/* file: palindromeReversal.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 3 Question 6.3
 * due date: 09/22/2016
 * version: 1.3
 *
 * This file contains an equation to compute if
 * a numbers reversal equals the same. If the numbers
 * equal, then the program computes that the number is
 * a palindrome.
 */

import java.util.Scanner;
public class Problem6_3 {
  public static void main(String[] args){
    // Creates Scanner Object
    Scanner input = new Scanner(System.in);
	// Prompts user for input
	System.out.print("Enter a number:");
	int integer = input.nextInt();
	// Checks if number is palindrome  
    if (isPalindrome(integer)) {
      System.out.println("The number: " + integer + " is a palindrome");
        }
    else {
      System.out.println("The number: " + integer + " is not a palindrome");
    }      
  }
  public static boolean isPalindrome(int number) {
    int palindrome = number; 
    int reverseNum = 0;
    // Checks number
    while (palindrome != 0) {
      int remainder = palindrome % 10;
        reverseNum = reverseNum * 10 + remainder;
        palindrome = palindrome / 10;
    }
    if (number == reverseNum) {
      return true;
    }
      return false;
  }
}
