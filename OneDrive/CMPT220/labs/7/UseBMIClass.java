/* file: UseBMIClass.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 7 Programming Exercise 10.2
 * due date: 10/27/2016
 * version: 1.8.0_101
 *
 * This file contains the declaration of UseBMIClass which
 * uses the BMI class to display the results of the 
 * individuals BMI.
 */

public class UseBMIClass {
  public static void main(String[] args) {
    // person #1 data
    BMI bmi1 = new BMI("Alex Richin", 20, 180, 6, 1);
    // Displays output
    System.out.println(bmi1.getName() + "'s BMI is " 
      + bmi1.getBMI() + " " + bmi1.getStatus());
    // person #2 data
    BMI bmi2 = new BMI("Jose", 21, 195, 6, 2);
    // Displays output
    System.out.println("The BMI for " + bmi2.getName() + " is "
      + bmi2.getBMI() + " " + bmi2.getStatus());
  }
}  