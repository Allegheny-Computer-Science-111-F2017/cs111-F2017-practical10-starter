package practicalten;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The InvestigateRecursiveSum class will call a recursive method.
 */

public class InvestigateRecursiveSum {

  /**
   * Perform a recursive summation.
   */
  public static int sum(int number) {
    // TODO: Explain a written report where the base case and
    // recursive call are found in this method

    // TODO: Given the value in number, write about how many times
    // this method is going to recursively call itself.
    int result;
    if (number == 1) {
      result = 1;
    } else {
      result = number + sum(number - 1);
    }
    return result;
  }

  /**
   * Call a method that can performs the recursive summation.
   */
  public static void main(String[] args) {

    // Step One: Declare the number input file and the scanner
    File numberInputFile = null;
    Scanner scanner = null;

    // Step Two: Connect the scanner to the input file
    try {
      numberInputFile = new File("inputs/number_input.txt");
      scanner = new Scanner(numberInputFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate the file.");
    }

    // Step Three: Read the numerical value from a file
    System.out.print("Please input an integer: ");
    int number = scanner.nextInt();

    // Step Four: Perform the computation
    int summationResult = sum(number);

    // Step Five: Display the result
    System.out.println("Summing the values from 1 to " + number);
    System.out.println("The answer is " + summationResult);
  }

}
