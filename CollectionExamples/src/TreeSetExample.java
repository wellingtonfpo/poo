void main() {
    String[] colors =
            {"red", "green", "blue", "yellow", "red", "green", "blue", "yellow", "red", "red", "orange", "purple", "cyan", "magenta", "black", "white", "gray", "pink", "brown", "maroon", "navy", "teal"};
    SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));

    IO.println("SortedSet: " + tree);

    IO.println("HeadSet (marron): " + tree.headSet("marron"));
    IO.println("TailSet (marron): " + tree.tailSet("marron"));
    IO.println("SubSet (green, pink): " + tree.subSet("green", "pink"));
    IO.println("First: " + tree.first());
    IO.println("Last: " + tree.last());
}

