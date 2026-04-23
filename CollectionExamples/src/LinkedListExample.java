private static void printList(LinkedList<String> list) {
    System.out.println("\nlist: ");

    for (String color : list) {
        System.out.printf("%s ", color);
    }

    System.out.println();
}

private static void convertToUppercaseStrings(LinkedList<String> list) {
    ListIterator<String> iterator = list.listIterator();

    while (iterator.hasNext()) {
        String color = iterator.next();
        iterator.set(color.toUpperCase());
    }
}

private static void removeItems(LinkedList<String> list, int start, int end) {
    list.subList(start, end).clear();
}

private static void printReversedList(LinkedList<String> list) {
    ListIterator<String> iterator = list.listIterator(list.size());

    System.out.println("\nReversed list: ");

    while (iterator.hasPrevious()) {
        System.out.printf("%s ", iterator.previous());
    }

    System.out.println();
}

void main() {
    String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
    LinkedList<String> list1 = new LinkedList<>();

    for (String color : colors) {
        list1.add(color);
    }

    String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
    LinkedList<String> list2 = new LinkedList<>();

    for (String color : colors2) {
        list2.add(color);
    }

    list1.addAll(list2);
    list2 = null;
    printList(list1);

    convertToUppercaseStrings(list1);
    printList(list1);

    System.out.println("\nDeleting elements 4 to 6...");
    removeItems(list1, 4, 7);
    printList(list1);
    printReversedList(list1);
}
