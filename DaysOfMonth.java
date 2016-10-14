/* file: DaysOfMonth.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 2 Question 3.11
 * due date: 09/14/2016
 * version: 1.3
 *
 * This program deals with mathematical equations, arrays
 *  and switch statements used to determine what the 
 *  number of days are in a particular month and year.
 */

import java.util.Scanner;
/**
 * DaysOfMonth
 * 
 * This class implements an equation to calculate the number of
 * days of a month in what year. 
 */

public class DaysOfMonth {
  public static void main(String[] args) {
    // Creates scanner
	Scanner input = new Scanner(System.in);	
	
	// Prompts user for the month
	System.out.print("Enter a month of the year (2 for February) here:");
	// Receives user input for month
	int monthOfYear = input.nextInt();
	
	// Prompts user for the year
	System.out.println("Enter a year for the month (2012) here:");
	// Receives user input for year
	int year = input.nextInt();
	
	/* Initializes the day of the month variable
	 * and assigns the value to 31 for months
	 * that have 31 days in total
	 */
	int daysOfMonth = 31;
	// Creates string for months
	String stringOfMonth;
	
	// Checks if the input provided is a leap year or not
	switch (monthOfYear) {
	  case 2:
        if ((year % 4 == 0 && year % 100 != 0) 
    	     || (year % 400 == 0)) {
		  daysOfMonth = 29; break;
	}
      // If not then assigns value of days to 28
      daysOfMonth = 28; break;
	  // Months of the year that have 30 days
	  case 4: daysOfMonth = 30;
	  case 6: daysOfMonth = 30;
	  case 9: daysOfMonth = 30;
	  case 11: daysOfMonth = 30; 
	}
	// Assigns the name of month to it's integer value
	switch (monthOfYear) {
	  case 1: stringOfMonth = "January"; break;
	  case 2: stringOfMonth = "February"; break;
	  case 3: stringOfMonth = "March"; break;
	  case 4: stringOfMonth = "April"; break;
	  case 5: stringOfMonth = "May"; break;
	  case 6: stringOfMonth = "June"; break;
	  case 7: stringOfMonth = "July"; break;
	  case 8: stringOfMonth = "August"; break;
	  case 9: stringOfMonth = "September"; break;
	  case 10: stringOfMonth = "October"; break;
	  case 11: stringOfMonth = "November"; break;
	  case 12: stringOfMonth = "December"; break;
	  // If the input received from the user is something other than 1-12
	  default: stringOfMonth = "This is not a month of the year";
	    daysOfMonth = 0; break;
    }
	// Prompts user with calculated number of days in month for that year
	System.out.println(stringOfMonth + " " + year + " had " 
	                   + daysOfMonth + " daysOfMonth");
  }
}