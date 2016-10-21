/* file: Grade.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 1 Question 2.1
 * due date: 09/07/2016
 * version: 1.3
 *
 * This file contains the declaration of Grade abstract data 
 * type.
 */
import java.util.Scanner;
/**
 * Grade
 * 
 * This class implements an equation to calculate the Final Grade
 * of a student in the CMPT 220f16 class. 
 */

public class Grade {
  public static void main(String[] args) {
  // Creates Scanner
  Scanner input = new Scanner(System.in);
  // Initializes the 5 different grade values that can also be converted using decimals
  double midtermGrade;
  double finalTestGrade;
  double projectGrade;
  double homeworkLabGrade;
  // Creates variable to hold the final grade value
  double finalGrade;
  
  
 
    // Receives input on midterm grade
    System.out.println("Please enter a Midterm grade: ");
    midtermGrade = input.nextDouble();
    
    // Receives input on final grade
    System.out.println("Please enter a Final grade: ");
    finalTestGrade = input.nextDouble();
    
    // Receives input on project grade
    System.out.println("Please enter a project grade: ");
    projectGrade = input.nextDouble();
    
    // Receive input on homeworks & labs grade
    System.out.println("Please enter a homework and labs grade: ");
    homeworkLabGrade = input.nextDouble();
    
    // Doubles the weight of the homework and labs grade because it's worth 40%
    homeworkLabGrade = homeworkLabGrade * 2;
    
    // Computes the average of the 4 grades into a final grade variable
    finalGrade = ((midtermGrade + finalTestGrade + projectGrade + homeworkLabGrade) / 5);
    
    // Gives output of what final grade percentage you have received
    System.out.println("This is your overall grade: " + finalGrade + "%");
  }
}
