/* file: mergeList.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 5 Question 7.31
 * due date: 10/06/2016
 * version: 1.3
 *
 * This file contains the declaration of mergeList which
 * implements a way to sort two separate lists in order.
 * This method includes for loops, if statements, and 
 * else if statements to sort through the arrays.
 */
import java.util.Scanner;
public class mergeList {
  public static void main(String[] args) {
	// Creates Scanner object
    Scanner input = new Scanner(System.in);
    // Prompts user to enter the first list
	System.out.print("Enter the first list: ");
	
	// Receives input into an array
	int[] list1 = new int[input.nextInt()];
	
	// Checks the array
	for (int y=0; y<list1.length; y++) {
      list1[y] = input.nextInt();
	}
	// Prompts the user to enter the second list
	System.out.print("Enter the second list: ");
	// Receives input
	int[] list2 = new int[input.nextInt()];
	
	// Checks second list
	for (int x=0; x<list2.length;x++) {
	  list2[x] = input.nextInt();
	}
	// Creates third list, from merging both lists
	int[] list3 = merge (list1, list2); 
	// Displays output of finalized list
	System.out.println("The merged list is: ");
	  // Checks third list
	  for (int n=0; n<list3.length; n++) {
	    System.out.println(list3[n] + " ");
	  }
  }
  public static int[] merge(int[] list1, int[] list2) {
    int[] list3 = new int[list2.length + list1.length];
	  int t=0; 
	  int h=0;
	  for (int n=0; n<list3.length; n++) {
	    if (list1[t] > list2[h] && h < list2.length) {
		  list3[n]=list2[h];
		  h++;
		} 
	    else if (t<list1.length) {
		  list3[n]=list1[t];
	      t++;
		}
	  }
	  return list3;	 
  }
}
