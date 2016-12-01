package lab8;
/* file: RemoveDuplicate.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 8 Question 11.13
 * due date: 11/03/2016
 * version: 1.0.8_111
 *
 * This file contains the declaration of RemoveDuplicate abstract data 
 * type.
 */
import java.util.Scanner;
import java.util.ArrayList;
/**
 * RemoveDuplicate
 * 
 * This class implements an equation to remove the duplicate
 * of a list of numbers and then prints the new list without
 * the duplicate number inputed. 
 */
public class RemoveDuplicate {
  public static void main(String[] args) {
    // Creatse Scanner Object
    Scanner input = new Scanner(System.in);
    
    ArrayList<Integer> ints = new ArrayList<>();   
    
    //Prompts user to input ten numbers
    System.out.println("Please input 10 integers seperated by spaces: ");
    
    // Iterates through array of numbers
    for (int i=0; i<10; i++) {
      ints.add(input.nextInt());
    }
    // Iterates through array to remove duplicates
    for (int i=0; i<ints.size(); i++) {
      for (int j=i+1; j< ints.size(); j++){
        if (ints.get(i)==ints.get(j))
          ints.remove(j);
      }
    }
    // Displays output of new list of numbers
    System.out.print("The distinct integers are ");
    
    for (int i = 0; i < ints.size(); i++) {
    System.out.print(ints.get(i) + " ");
    }
  }
}
