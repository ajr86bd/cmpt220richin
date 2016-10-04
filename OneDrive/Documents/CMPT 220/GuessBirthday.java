/* file: GuessBirthday.java
  * author: Alexander Richin
  * course: CMPT 220
  * assignment: Lab 1 Problem 2: Programming
  * due date: 09/07/2016
  * version: 1.3
  *
  * This file contains the declaration of GuessBirthday abrastract data 
  * type.
  */

import java.util.Scanner;

/**
 * GuessBirthday
 * 
 * This class implements a set of questions
 * to help guess the users birthday.
 */

public class GuessBirthday {
  public static void main(String[] args) {

  	// First string to guess the birthdate of the input given
	String set1 = 
      " 1  3  5  7\n" +
	  " 9 11 13 15\n" +
      "17 19 21 23\n" +
	  "25 27 29 31";
	
	// Second string to guess the birthdate of the input given
	String set2 = 
      " 2  3  6  7\n" +
	  "10 11 14 15\n" +
	  "18 19 22 23\n" +
	  "26 27 30 31";
	
	// Third string to guess the birthdate of the input given
	String set3 = 
	  " 4  5  6  7\n" +
	  "12 13 14 15\n" +
	  "20 21 21 23\n" +
	  "28 29 30 31";
	
	//Fourth string to guess the birthdate of the input given
	String set4 = 
      " 8  9 10 11\n" +
	  "12 13 14 15\n" +
      "24 25 26 27\n" +
	  "28 29 30 31";
	
	// Fifth string to guess the birthdate of the input given
	String set5 = 
      "16 17 18 19\n" +
	  "20 21 22 23\n" +
      "24 25 26 27\n" +
	  "28 29 30 31";
	
	// Initializes the variable day to start at 0
	int day = 0;
	
	// Creates a scanner
	Scanner input = new Scanner(System.in);
	
	// Asks is user's birthday is in the first set
	System.out.print("Is your birthday in Set1?\n");
	System.out.print(set1);
	
	// Receives input for users answer
	System.out.print("\nEnter N for No and Y for Yes:");
	String answer = input.next();
    
    // Computes if the answer is yes 
	if (answer.equals("Y"))
	  day += 1;
	
	// Asks user if birthday is in the second set
	System.out.print("\nIs your birthday in Set2?\n");
	System.out.print(set2);

	// Receives input on user's answer
	System.out.print("\nEnter N for No and Y for Yes:");
	answer = input.next();
	
	// Computes if user's answer is yes or no
	if (answer.equals("Y"))
	  day += 2;
	
	// Asks user if birthday is in set 3
	System.out.print("\nIs your birthday in Set3?\n");
	System.out.print(set3);

	// Receives users input for if date is in set 3
	System.out.print("\nEnter N for No and Y for Yes:");
	answer = input.next();
	
	// Computes if user's answer is yes or no 
	if (answer.equals("Y"))
	  day += 4;
	
	// Asks user if birthday is in the fourth set
	System.out.print("\nIs your birthday in Set4?\n");
	System.out.print(set4);

	// Receives user's input for fourth set
	System.out.print("\nEnter N for No and Y for Yes:");
	answer = input.next();
	
	// Computes if the answer is yes or no
	if (answer.equals("Y"))
	  day += 8;
	
	// Asks user if birthday is in the fifth set
	System.out.print("\nIs your birthday in Set5?\n");
	System.out.print(set5);

	// Receives user's input if yes or no
	System.out.print("\nEnter N for No and Y for Yes:");
	answer = input.next();
	
	// Computes user's input as a yes or no
	if (answer.equals("Y"))
	  day += 16;
    
    // Displays output for user's birthday           
	System.out.println("\nYour birthday is " + day + "!");
  }
}
