/* file: SquareNumbers.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 7 Question 10.17
 * due date: 10/27/2016
 * version: 1.8.0_101
 *
 * This file contains a method to calculate the
 * first ten square numbers greater than the longest
 * maximum value. It does so in an efficient way as well.
 */
import java.math.BigDecimal;

public class SquareNumbers {
  public static void main(String[] args) {
    BigDecimal longMaxVal = new BigDecimal (Long.MAX_VALUE);
    long start = (long) Math.sqrt(Long.MAX_VALUE);
    BigDecimal i = new BigDecimal(start);
    int count = 0;
    
    // Checks that the count is less than 10
    while (count < 10) {
      BigDecimal squared = i.multiply(i);
      if (squared.compareTo (longMaxVal) > 0) {
        count++;
        System.out.println(count+": " + i + " squared = " + squared);
      }
      i = i.add(BigDecimal.ONE);
    }
  }
}