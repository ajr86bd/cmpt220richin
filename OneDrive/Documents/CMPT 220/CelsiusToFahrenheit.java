 /* file: CelsiusToFahrenit.java
  * author: Alexander Richin
  * course: CMPT 220
  * assignment: Lab 1 Question 2.1
  * due date: 09/07/2016
  * version: 1.3
  *
  * This file contains the declaration of CelsiusToFahrenheit abrastract data 
  * type.
  */

import java.util.Scanner;

/**
 * CelsiusToFahrenheit
 * 
 * This class implements an equation to calculate the conversion of
 * celsisus to fahrenheit. 
 */

public class CelsiusToFahrenheit {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    
    // Receives the degree in Celsius
    System.out.print("Enter a degree in Celsius: ");
   
    // Allows you to type in a decimal for Celsius
    double celsius = input.nextDouble();
    
    // Allows you to convert into a decimal for Fahrenheit
    double fahrenheit = (celsius * (9.0 / 5) + 32) ;

    // Displays the results of the conversion of Celsius to Fahrenheit
    System.out.println("Celsius " + celsius + " is " + fahrenheit + " in Fahrenheit");
  }
}