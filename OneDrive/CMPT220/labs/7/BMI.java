/* file: BMI.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 7 Programming Exercise 10.2
 * due date: 10/27/2016
 * version: 1.8.0_101
 *
 * This file contains the declaration of BMI which
 * contains an equation to determine a person's Body Mass Index.
 * It takes the person's name, age, weight, and height in feet
 * and inches. Then, determines what the BMI is. 
 */

public class BMI { 
    private String name;
    private int age;
    private double weight;  // in pounds
    private double height; // in inches
    public final double KILOGRAMS_PER_POUND = 0.45359237;
    public final double METERS_PER_INCH = 0.0254;

    public BMI(String name, int age, double weight, double feet, double inches) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = 12 * feet + inches;
    }
 
    public BMI(String name, int age, double weight, double height) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = height;
    }
 
    public BMI(String name, double weight, double height) {
      this(name, 20, weight, height);
    }
    
    public double getBMI() {
      double bmi = weight * KILOGRAMS_PER_POUND /
        ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
      return Math.round(bmi * 100) / 100.0;
    }
    
    // Determines the persons BMI 
    public String getStatus() {
      double bmi = getBMI();
        if (bmi < 18.5)
          return "which is Underweight.";
        else if (bmi < 25)
          return "which is Normal.";
        else if (bmi < 30)
          return "which is Overweight.";
        else 
          return "which is Obese.";
    }
    
    public String getName() {
      return name;
    }
    
    public int getAge() {
      return age;
    }
    
    public double getWeight() {
      return weight;
    }
    
    public double getHeight() {
      return height;
    }
 }    