/**
  * TerminalCalculator.java
  * @description A simple terminal calculator
  * @author Sakeena Younus
  *version 1.0 2022-01-12
*/

import java.util.Scanner;

public class TerminalCalculator {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in); //declaration & assignment

    //take in first int
    System.out.println("Type an integer: "); //directions
    int num1 = input.nextInt();

    //take in operation
    System.out.println("Type an operation (+, -, *, or /, \"pi times\": ");
    input.nextLine(); //take in newline character
    String operation = input.nextLine();  //take in user response

    //take in second int
    System.out.println("Type an integer: "); //directions
    int num2 = input.nextInt();

    double result = 0;
    final double PI = 3.14;
    //perform calculation
    if (operation.equals("+")) {    //addition
      result = num1 + num2;
    }
    else if (operation.equals("*")) {   //multiplication
      result = num1 * num2;
    }
    else if (operation.equals("pi times")) {
      result = num1 * num2 * PI;
    }
    else {
      System.out.println("I don't know how to do that!");
    }
    System.out.println("The result is: " + result);
    //print the result

  } // end of main method

} // end of class
