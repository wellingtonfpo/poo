public int quotient(int numerator, int denominator) throws ArithmeticException {
    return numerator / denominator;
}
void main() {
    Scanner scanner = new Scanner(System.in);
    boolean continueLoop = true;

    do {
        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            int result = quotient(numerator, denominator);
            System.out.printf("Result: %d / %d = %d%n", numerator, denominator, result);
            continueLoop = false;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.err.printf("%nException: %s%n", e);
            System.out.println("Error: Invalid input. Please enter integers for numerator and denominator.");
        } catch (ArithmeticException e) {
            System.err.printf("%nException: %s%n", e);
            System.out.printf("Zero is invalid denominator. Please enter a non-zero integer for the denominator.%n");
        }
    } while (continueLoop);
}

