 // Example. 11.2: DivideByZeroWithExceptionHandling
 
 package chapter_11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ytosko
 */
public class DivideByZeroWithExceptionHandling {

    public static int quotient(int numerator, int denomirator)
            throws ArithmeticException {
        return numerator / denomirator;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continueLoop = true;

        do {
            try {
                System.out.print("Please enter an Integer numerator: ");
                int numerator = scanner.nextInt();

                System.out.print("Please enter an Integer denominator:");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);

                System.out.println("\nResult: " + numerator + " / " + denominator + " = " + result);

                continueLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                System.err.println("\nException: " + inputMismatchException);
                scanner.nextLine();
                System.out.println("You must enter integers, Please try again.\n");
            }catch (ArithmeticException arithmeticException) {
                System.err.println("\nException : "+arithmeticException);
                scanner.nextLine();
                System.out.println("Zero is an invalid denominator. Please try again.\n");
            }
        } while (continueLoop);

    }
}


