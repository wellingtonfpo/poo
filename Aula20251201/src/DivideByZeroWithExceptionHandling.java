import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
    public static int quotient(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {
                System.out.print("Enter numerator: ");
                int numerator = sc.nextInt();

                System.out.print("Enter denominator: ");
                int denominator = sc.nextInt();

                System.out.println("Result: " + quotient(numerator, denominator));
                continueLoop = false;
            } catch (ArithmeticException e) {
                System.err.println("Exception " + e);
                System.out.println("Exception: Division by zero is not allowed. Please try again.");
            } catch (InputMismatchException e) {
                System.err.println("Exception " + e);
                sc.nextLine();
                System.out.println("Exception: Invalid input. Please enter integers only. Please try again.");
            }
        } while (continueLoop);

        sc.close();

    }
}
