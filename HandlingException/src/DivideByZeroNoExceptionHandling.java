public int quotient(int numerator, int denominator) {
    return numerator / denominator;
}
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the numerator: ");
    int numerator = scanner.nextInt();
    System.out.print("Enter the denominator: ");
    int denominator = scanner.nextInt();

    int result = quotient(numerator, denominator);
    System.out.printf("Result: %d / %d = %d%n", numerator, denominator, result);
}
