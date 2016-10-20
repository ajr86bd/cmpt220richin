/* file: testRectangle.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 6 Question 9.1
 * due date: 10/19/2016
 * version: 1.8.0_101
 *
 * This file contains the declaration of testRectangle abstract data 
 * type.
 */

// Run from this file
public class testRectangle {
  public static void main(String[] args) {
    // Sets width and height of both rectangles
    Rectangle rect1=new Rectangle(4, 40);
    Rectangle rect2=new Rectangle(3.5, 35.9);
    // Displays output of width, height, area, perimeter of both rectangles
    System.out.println( rect1.width + " " + rect1.height + " " 
      + rect1.getArea() + " " + rect1.getPerimeter());
    System.out.println( rect2.width + " " + rect2.height + " " 
      + rect2.getArea() + " " + rect2.getPerimeter());
  }
}
