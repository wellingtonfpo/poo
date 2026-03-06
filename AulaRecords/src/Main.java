void main() {
    Cliente client1 = new Cliente("Wellington", 1);
    var client2 = new Cliente("Luanny", 2);

    System.out.println("Cliente 1: " + client1.nome() + ", ID: " + client1.id());
    System.out.println("Cliente 2: " + client2.nome() + ", ID: " + client2.id());
}