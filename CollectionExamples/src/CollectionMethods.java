void main() {

    // Copas, Ouros, Paus, Espadas
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

    List<String> cardSuits = Arrays.asList(suits);
    System.out.printf("Unsorted array elements: %s%n", cardSuits);

    Collections.sort(cardSuits);
    System.out.printf("Sorted array elements: %s%n", cardSuits);

    Collections.sort(cardSuits, Collections.reverseOrder());
    System.out.printf("Sorted array elements in reverse order: %s%n", cardSuits);

    Collections.shuffle(cardSuits);
    System.out.printf("Shuffled array elements: %s%n", cardSuits);
}
