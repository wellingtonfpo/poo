import java.util.Locale;
import java.util.Scanner;

public class DivideByZero {
    public static int quotient(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int numerator = sc.nextInt();

        System.out.print("Enter denominator: ");
        int denominator = sc.nextInt();

        System.out.println("Result: " + quotient(numerator, denominator));

        sc.close();
    }
}
