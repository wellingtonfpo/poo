void main() {
    Character[] letters = {'P', 'C', 'M'};
    List<Character> list = Arrays.asList(letters);
    System.out.println("List contains: " + list);

    System.out.println("Max: " + Collections.max(list));
    System.out.println("Min: " + Collections.min(list));

    Collections.reverse(list);
    System.out.println("Reversed list: " + list);

    System.out.println("Max: " + Collections.max(list));
    System.out.println("Min: " + Collections.min(list));

    Character[] lettersCopy = new Character[3];
    List<Character> copyList = Arrays.asList(lettersCopy);
    Collections.copy(copyList, list);
    System.out.println("Copy of list: " + copyList);

    System.out.println("Max: " + Collections.max(copyList));
    System.out.println("Min: " + Collections.min(copyList));

    Collections.fill(list, 'X');
    System.out.println("Filled list: " + list);

    System.out.println("Max: " + Collections.max(list));
    System.out.println("Min: " + Collections.min(list));
}