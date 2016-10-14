/* file: letterGrade.java 
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 2 Grade 2
 * due date: 09/14/2016
 * version: 1.3
 *
 * This file contains the declaration of computeChange abstract data 
 * type. It shows the user's overall grade.
 */
import java.util.Scanner;
/**
 * letterGrade
 * 
 * This class implements equations to calculate the conversion of
 * percentages into letter grades. 
 */
public class letterGrade {
  public static void main(String[] args) {
	// Creates scanner object
    Scanner input = new Scanner(System.in);
    // Prompts user to enter grades
    System.out.print("Please enter the following as a percentage: \n " + 
        "midterm exam, final exam, projects, homeworks and Labs: ");
    double midtermExam = input.nextDouble();
    double finalExam = input.nextDouble();
    double projects = input.nextDouble();
    double homeworkLabs = input.nextDouble();
    // Calculates the final grade
    double finalGrade = (midtermExam *.2) + (finalExam *.2) + 
      (projects *.2) + (homeworkLabs *.4);
    
    if (finalGrade <= 100 && finalGrade >=95.00) {
      System.out.println("Your final grade is an A");
    } else if (finalGrade <= 94.99 && finalGrade >= 90.00) {
        System.out.println("Your final grade is an A-");
    } else if (finalGrade <= 89.99 && finalGrade >= 87.00) {
        System.out.println("Your final grade is an B+");
    } else if (finalGrade <= 86.99 && finalGrade >= 83.00) {
        System.out.println("Your final grade is an B");
    } else if (finalGrade <= 82.99 && finalGrade >= 80.00) {
        System.out.println("Your final grade is an B-");
    } else if (finalGrade <= 79.99 && finalGrade >= 77.77) {
        System.out.println("Your final grade is an C+");
    } else if (finalGrade <= 66.99 && finalGrade >= 73.00) {
        System.out.println("Your final grade is an C");
    } else if (finalGrade <= 72.99 && finalGrade >= 70.00) {
        System.out.println("Your final grade is an C-");
    } else if (finalGrade <= 69.99 && finalGrade >= 65.00) {
        System.out.println("Your final grade is an D+");
    } else if (finalGrade <= 64.99 && finalGrade >= 63.00) {
        System.out.println("Your final grade is an D");
    } else if (finalGrade <= 62.99 && finalGrade >= 60.00) {
        System.out.println("Your final grade is an D-");
    } else if (finalGrade <= 59.99) {
       System.out.println("Your final grade is an F");
    }
  }
}
