/* file: ASCIICodeProblem.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 2 Question 4.8
 * due date: 09/14/2016
 * version: 1.3
 *
 * This file contains the declaration of ASCIICodeProblem  
 * to convert integers to characters of the ASCII table.
 */

import java.util.Scanner;

/**
 * ASCIICodeProblem
 * 
 * This class implements a way to calculate the
 * corresponding ASCII code of an integer. 
 */

public class ASCIICodeProblem {
  public static void main(String[] args) {
    // Creates scanner
	Scanner input = new Scanner(System.in);
	// Prompts user for an integer
    System.out.println("Integer between 0 and 127:");
    // Receives input 
    int num = input.nextInt();
    // Conversion of integer and characters
    char letter = (char)num;
    // Prompts user with output
    System.out.println(letter);
  }
}