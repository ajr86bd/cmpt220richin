/* file: GenerateVehiclePlateNum.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 2 Question 4.25
 * due date: 09/14/2016
 * version: 1.3
 *
 * This file contains the declaration of GenerateVehiclePlateNum abrastract data 
 * type.
 */
/**
 * GenerateVehiclePlateNum
 * 
 * This class implements an equation to calculate a random
 * vehicle plate number. 
 */

public class GenerateVehiclePlateNum {
  public static void main(String[] args) {
	// Creates variable type for letters
    char letter1;
    char letter2;
    char letter3;
    // Creates integer type for randomly generated numbers
    int rand1 = 65 + (int)(Math.random() * 26);
    int rand2 = 65 + (int)(Math.random() * 26);
    int rand3 = 65 + (int)(Math.random() * 26);
    // Random letters
    letter1 = (char)rand1;
    letter2 = (char)rand2;
    letter3 = (char)rand3;
    // Calculating random numbers
    int num1 = 0 + (int)(Math.random() * 10);
    int num2 = 0 + (int)(Math.random() * 10);
    int num3 = 0 + (int)(Math.random() * 10);
    int num4 = 0 + (int)(Math.random() * 10);
    // Prompts user with output
    System.out.println(letter1 + " " + letter2 + " " + letter3 + " " + num1 
    		+ " " + num2 + " " + num3 + " " + num4);
  }
}
