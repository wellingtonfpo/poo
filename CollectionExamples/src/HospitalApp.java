static class Patient implements Comparable<Patient> {
    private String name;
    private Integer age;

    public Patient(String name, Integer age) {
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
    public int compareTo(Patient other) {
        return Integer.compare(other.getAge(), this.age); // Ordem decrescente por idade
    }

    @Override
    public String toString() {
        return String.format("Paciente: %-10s | Idade: %d", name, age);
    }
}

void main() {
    PriorityQueue<Patient> queue = new PriorityQueue<>();

    queue.add(new Patient("Alice", 30));
    queue.add(new Patient("Bob", 25));
    queue.add(new Patient("Charlie", 40));
    queue.add(new Patient("Diana", 35));

    IO.print("Atendendo pacientes por ordem de idade (mais velho primeiro):");

    while (!queue.isEmpty()) {
        IO.println("Chamando -> " + queue.poll());
    }
}
