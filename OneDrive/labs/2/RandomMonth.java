/* file: RandomMonth.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 2 Question 23.4
 * due date: 09/14/2016
 * version: 1.3
 *
 * This file contains the declaration of RandomMonth abstract data 
 * type.
 */

import java.util.Random;
/**
 * RandomMonth
 * 
 * This class implements an equation to calculate a random
 * month of the year. 
 */

public class RandomMonth {
  public static void main(String[] args) {
  	
    // Creates an array of each month of the year to be selected at random
	String[] months = {"January", "February", "March", "April", "May", 
				       "June", "July", "August", "September", "October", 
				       "November", "December"};

      // Randomly picks a month
	  Random rand = new Random();

	  // Creates an integer variable that is assigned to the random month
	  int index = rand.nextInt ((12 - 1) + 1);

	  //Prompts the user giving what the random month is
	  System.out.print(months [index]);
				
  }
}
