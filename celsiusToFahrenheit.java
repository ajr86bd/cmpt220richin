/* file: celsiusToFahrenheit.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 4 Question 6.8
 * due date: 09/28/2016
 * version: 1.3
 *
 * This file contains a table of degrees in both
 * Celsius and Fahrenheit. Equations are used to 
 * calculate each value.
 */
public class celsiusToFahrenheit {
  public static void main(String[] args) {
	// Displays output
    System.out.format("    Celsius  Fahrenheit |   Fahrenheit   Celsius");
	
    for (double cel=40.0, far=120; cel>30.0; cel-=1, far-=10) {
	  double[] myList = new double[100];
	  // Displays output
	  System.out.format("%10.1f %10.1f   | %10.1f %10.1f \n", 
			      	    cel, Cel2Far(cel), far, Far2Cel(far));
	}
  }
  // Calculates celsius
  public static double Cel2Far(double cel) {
    return (9.0)/5.0 * (cel +32.0);
  }
  // Calculates fahrenheit
  public static double Far2Cel(double far) {
    return (5.0/9.0) * (far - 32.0);
  }
}