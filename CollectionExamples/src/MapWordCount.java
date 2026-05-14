void main() {
    Map <String, Integer> map = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite uma frase: ");
    String frase = scanner.nextLine();

    String[] tokens = frase.split(" ");

    for (String token : tokens) {
        String word = token.toLowerCase();

        if (map.containsKey(word)) {
            int count = map.get(word);
            map.put(word, count + 1);
        } else {
            map.put(word, 1);
        }
    }

    Set<String> keys = map.keySet();

    TreeSet<String> sortedKeys = new TreeSet<>(keys);

    System.out.println("---------------------|-----------------");
    System.out.printf("%-20s | %s\n", "Palavra", "Contagem");
    System.out.println("---------------------|-----------------");

    for (String key : sortedKeys) {
        System.out.printf("%-20s | %d\n", key, map.get(key));
    }

    System.out.printf("---------------------|-----------------\n");

    System.out.println("Total de palavras: " + tokens.length);
}
