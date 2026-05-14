void main() {
    Map<String, Integer> map = new HashMap<>();

    map.put("Wellington", 2026051010);
    map.put("Luanny", 2026051011);
    map.put("Luan", 2026051012);

    System.out.println("---------------------|-----------------");
    System.out.printf("%-20s | %s\n", "Aluno", "Matrícula");
    System.out.println("---------------------|-----------------");

    for (String key : map.keySet()) {
        System.out.printf("%-20s | %d\n", key, map.get(key));
    }

    System.out.println("---------------------|-----------------");


}
