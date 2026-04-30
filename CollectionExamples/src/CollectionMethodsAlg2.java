void main() {
    String[] colors = {"red", "white", "blue", "yellow"};
    List<String> list = Arrays.asList(colors);
    ArrayList<String> list2 = new ArrayList<>();

    list2.add("black");
    list2.add("red");
    list2.add("green");

    System.out.println("Before addAll, list2 contains:");
    for (String color : list2) {
        System.out.println(color);
    }

    Collections.addAll(list2, colors);

    System.out.println("\nAfter addAll, list2 contains:");
    for (String color : list2) {
        System.out.println(color);
    }

    int frequency = Collections.frequency(list2, "red");
    System.out.println("\nFrequency of \"red\" in list2: " + frequency);

    boolean disjoint = Collections.disjoint(list, list2);
    System.out.printf("list and list2 %s elements in common.%n", disjoint ? "do not have" : "have");
}
