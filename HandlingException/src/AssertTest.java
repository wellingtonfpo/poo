void main() {
    Scanner input = new Scanner(System.in);

    IO.print("Enter a number between 0 and 10: ");
    int number = input.nextInt();

    // Assert that the number is between 0 and 10
    assert number >= 0 && number <= 10 : "Number must be between 0 and 10. You entered: " + number;
    IO.println("You entered: " + number);
}
