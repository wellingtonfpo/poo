package enums;

public enum Opcoes {
    COMPACATAR("Compactar", 0),
    DESCOMPACATAR("Descompactar", 1);

    private final String nome;
    private final int valor;

    Opcoes(String n, int v) {
        nome = n;
        valor = v;
    }

    public int getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return nome + " (" + valor + ")";
    }
}
