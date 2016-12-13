/* file: Rectangle.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 6 Question 9.1
 * due date: 10/19/2016
 * version: 1.8.0_101
 *
 * This file contains the declaration of Rectangle abstract data 
 * type.
 */
public class Rectangle {
  // Initializes width and height
  double width=1;
  double height=1;
  // Public method for rectangle
  public Rectangle() {
    this.width=1;
    this.height=1;
  }
  public Rectangle(double width, double height) {
	 this.width=width;
	 this.height=height;
  }
  public double getArea() {
    return width*height;
  }
  public double getPerimeter() {
    return 2*width + 2*height;
  }
}
