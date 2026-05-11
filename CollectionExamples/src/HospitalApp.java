static class Pacient implements Comparable<Pacient> {
    private String name;
    private Integer age;

    public Pacient(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(Pacient other) {
        return Integer.compare(other.getAge(), this.age); // Ordem decrescente por idade
    }

    @Override
    public String toString() {
        return String.format("Paciente: %-10s | Idade: %d", name, age);
    }
}

void main() {
    PriorityQueue<Pacient> queue = new PriorityQueue<>();

    queue.add(new Pacient("Alice", 30));
    queue.add(new Pacient("Bob", 25));
    queue.add(new Pacient("Charlie", 40));
    queue.add(new Pacient("Diana", 35));

    IO.print("Atendendo pacientes por ordem de idade (mais velho primeiro):");

    while (!queue.isEmpty()) {
        IO.println("Chamando -> " + queue.poll());
    }
}
