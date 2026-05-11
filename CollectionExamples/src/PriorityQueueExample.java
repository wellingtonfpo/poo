void main() {
//    Construtor Padrão
//    PriorityQueue<Double> queue = new PriorityQueue<>();
//    queue.add(3.2);
//    queue.add(9.8);
//    queue.add(5.4);

//    Construtor com Capacidade Inicial
//    PriorityQueue<Double> queue = new PriorityQueue<>(10);
//    queue.add(3.2);
//    queue.add(9.8);
//    queue.add(5.4);
//    queue.add(2.7);
//    queue.add(8.1);

//    Construtor com Comparator Personalizado (Ordem Decrescente)
//    PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
//    queue.add(30);
//    queue.add(20);
//    queue.add(10);

//    Construtor com Capacidade Inicial e Comparator Personalizado
    PriorityQueue<String> queue = new PriorityQueue<>(5, (a, b) -> b.length() - a.length());
    queue.add("Wellington Menezes");
    queue.add("Rosimeire Melo Menezes");
    queue.add("Luanny Maria");
    queue.add("Luan Marx");

    IO.print("Polling from queue: ");

    while (!queue.isEmpty()) { // Pode utilizar queue.size() > 0
        IO.print(queue.peek() + " - "); // peek() retorna o elemento de maior prioridade sem removê-lo
        queue.poll();
    }
}
