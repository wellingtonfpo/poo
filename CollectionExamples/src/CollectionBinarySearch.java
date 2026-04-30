private static void printSearchResults(List<String> list, String key) {
    int result = Collections.binarySearch(list, key);

    System.out.println();
    System.out.println("Search for: " + key);

    if (result >= 0) {
        System.out.printf("Found \"%s\" at index %d%n", key, result);
    } else {
        System.out.printf("\"%s\" not found in the list.%n", key);
    }
}

void main() {
    String[] colors = {"red", "white", "blue", "yellow", "green", "tan", "pink", "gray"};
    List<String> list = new ArrayList<>(Arrays.asList(colors));

    Collections.sort(list);
    System.out.printf("Sorted list: %s%n", list);

    printSearchResults(list, "tan");
    printSearchResults(list, "cyan");
    printSearchResults(list, "gray");
    printSearchResults(list, "aqua");
    printSearchResults(list, "teal");
}