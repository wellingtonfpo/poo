void main() {
    String[] colors = {"red", "green", "blue", "yellow", "red", "green", "blue", "yellow", "red", "red"};
    List<String> colorList = Arrays.asList(colors);

    IO.println("List: " + colorList);

    printNonDuplicates(colorList);
}

private void printNonDuplicates(Collection<String> values) {
    Set<String> set = new HashSet<>(values);
    IO.println("Set: " + set);
}
