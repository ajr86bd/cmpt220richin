/* file: futureTuition.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 3 Question 5.7
 * due date: 09/22/2016
 * version: 1.3
 *
 * This file contains a loop that computes tuition. 
 * It calculates the interest gradually increased
 * each year, then sums up the total of all 4 years.
 */

public class futureTuition {
  public static void main(String[] args) {
    int tuitionPerYear = 10000;
    int totalTuition = 0;
    
    // Iterates through number of years + consecutively increasing by 5%
    for (int numberOfYears = 1; numberOfYears <= 14; numberOfYears++) {
	  tuitionPerYear += tuitionPerYear * .05;
	    // Checks if number of years is 10
	    if (numberOfYears == 10) {
	      // Displays the output
		  System.out.println("The tuition in 10 years totals to: $" 
	                         + tuitionPerYear);
		  }
	      // Checks if number of years is greater than 10
		  if (numberOfYears > 10) {
		    totalTuition = totalTuition + tuitionPerYear;
		  }
    }  
    // Displays the output
    System.out.println("The total cost of 4 years after 10 "
    		           + "years is $" + totalTuition);
  }
}