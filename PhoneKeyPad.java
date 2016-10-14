/* file: PhoneKeyPad.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 2 Question 4.15
 * due date: 09/14/2016
 * version: 1.3
 *
 * This file contains the declaration of PhoneKeyPad abstract data 
 * type.
 */
import java.util.Scanner;
/**
 * PhonKeyPad
 * 
 * This class implements an equation to calculate the corresponding
 * number of a letter on a phone key pad. 
 */

public class PhoneKeyPad {
  public static void main(String[] args) {
	// Creates scanner
    Scanner input = new Scanner(System.in);
    
    boolean ok = false;
    String str="";
   
    while(ok==false){
    // Prompts user to enter a letter
    System.out.println("Type a letter:");
    str = input.next().toUpperCase();
    
    // Creates an array of letters
    String letters[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", 
    		            "J", "K", "L", "M", "N", "O",  "P", "Q", "R", 
    		            "S", "T", "U", "V", "W", "X", "Y", "Z"};
   // Checks through the array
    for (int i = 0; i < 26; i++) {
    	if (str.equals(letters[i]))
    		ok = true;
    }
    // Checks if input is valid
    if (ok == false)
      // Prompts user to enter something valid
      System.out.println("Please input something valid");
    
	}
    // Checks the input to calculate the corresponding number
    if (str.equals("A") || str.equals("B") || str.equals("C"))
      System.out.println("the corresponding number is 2");
    if (str.equals("D") || str.equals("E") || str.equals("F"))
      System.out.println("the corresponding number is 3");
    if (str.equals("G") || str.equals("H") || str.equals("I"))
      System.out.println("the corresponding number is 4");
    if (str.equals("J") || str.equals("K") || str.equals("L"))
      System.out.println("the corresponding number is 5");
    if (str.equals("M") || str.equals("N") || str.equals("O"))
      System.out.println("the corresponding number is 6");
    if (str.equals("P") || str.equals("Q") || str.equals("R") || str.equals("S"))
      System.out.println("the corresponding number is 7");
    if (str.equals("V") || str.equals("T") || str.equals("U"))
      System.out.println("the corresponding number is 8");
    if (str.equals("Y") || str.equals("W") || str.equals("X") || str.equals("Z"))
      System.out.println("the corresponding number is 9");
  }
}
