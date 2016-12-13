/* file: partitionList.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 5 Question 7.32
 * due date: 10/06/2016
 * version: 1.3
 *
 * This file contains the declaration of partitionList which
 * partitions a list using a pivot variable. This is one of
 * the many ways to sort a list of integers.
 */
import java.util.Scanner;
public class partitionList {
  public static void main(String[] args) {
	// Creates Scanner object
    Scanner input = new Scanner(System.in);
    // Prompts the user to enter a list of integers
	System.out.println("Please enter the list of integers:");
	// Receives user input of list
	int[] list = new int[input.nextInt()];
	// Checks list
	for (int x=0; x<list.length; x++) {
	  list[x] = input.nextInt();
	}
	// Display results of list
	partition(list);
	System.out.println("After the partition, the list is: ");
	for (int y=0; y<list.length; y++) {
	  System.out.print(list[y] + " ");
	}
  }
  public static int partition(int[] list) {
	int partitionLocation=0;
	int partition=list[0];
	int num=list.length-1;
	   
	while(partitionLocation < num) {
	  if(partition>list[partitionLocation+1]) {
	    // Switch partition with next integer of the list
	    list[partitionLocation]=list[partitionLocation+1];
	    list[partitionLocation+1]=partition;
	    partitionLocation++;
	   } 
	   else {
	     // Relocate the integer to end of list
	     int temp=list[num];
	       list[num]=list[partitionLocation+1];
	       list[partitionLocation+1]=temp;
	       num--;
      }
	}
	return partitionLocation;
  }
}
