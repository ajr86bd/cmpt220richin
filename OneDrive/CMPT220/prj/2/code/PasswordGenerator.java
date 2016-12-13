/* file: PasswordGenrator.java
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Project 1
 * due date: 12/8/2016
 * version: 1.0.8_111
 *
 * This file contains the declaration of PasswordGenerator abrastract data 
 * type.
 */
import java.util.Scanner;
/**
 * PasswordGenerator 
 *
 * This class implements a method to create a user's account information
 * easily and efficiently. PasswordGenerator asks the user a series of questions
 * and receives the input. Then it takes the input and turns it into information
 * that can be used to change a password, or even create a new account.
 */
public class PasswordGenerator {
  public static void main(String[] args) {
    // Creates Scanner object
    Scanner input = new Scanner(System.in);

    // Prompts user for input regarding initials
    // Can be capital or lower case letters
    System.out.println("What is your initials? (Can also include middle initial): ");
    String initials = input.next();

    // Can also enforce exactly 2 chars by changing the if statement to == 2 instead.
    if (initials.length() < 2) {
    System.out.println("Error: Please input 2 letters.");
    }
    // Prompts user for input regarding lucky number
    // Should be set of numbers, do not seperate by spaces
    System.out.println("What is your lucky number(s)?");
    int luckyNumbers = input.nextInt();
    
    // Prompts user for input regarding birth month
    // Can be capital or lowercase letters or both
    System.out.println("What month were you born in?");
    String month = input.next();

    // Prompts user for input regarding significant year in lifetime
    // Should be inputed as a number
    System.out.println("What year was the most significant in your life?");
    int year = input.nextInt();
    
    String password = initials + luckyNumbers + month + year;
    // Displays output of generated password
    System.out.println("Here is your password:");
    System.out.println(password);

    // Stores list of questions
    String[] questions = {
      "What was your first pet's name?",
      "What town were your born in?",
      "What is your grandfather's middle name?",
      "What is your mother's maiden name?",
      "What is the last name of your bestfriend from highschool?"
    };
    for(int i=0; i<questions.length; i++){
    	System.out.println(i + ": " + questions[i]);
    }
    // Prompts user to chooser a number corresponding to a question
    System.out.println("Choose a number between 0-4 for your question:");
    int questionNum=input.nextInt();

    String questionChoice = questions[questionNum];
    System.out.println(questionChoice);

    // Prompts the user for an answer to the question of their choosing
    System.out.println("What is the answer to your question: ");
    String answer = input.next();

    // Prompts user to provide a username
    System.out.println("Please provide a username: ");
    String username = input.next();

    // Displays the chosen username
    System.out.println("This is your username: " + username);

    // Prompts user if they would like all information to be displayed
    System.out.println("If you would like your information to be displayed accordingly,\n" 
        + "please hit enter:");
    String display = input.next();

    // Displays total output
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
    System.out.println("Security Question: " + questionChoice);
    System.out.println("Answer: " + answer);
  }
}
