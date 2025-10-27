package contracts;

public interface Printable {
    public static final String START = "<start>";
    public static final String END = "<end>";
    public abstract void print();
    public abstract void printInConsole();
}
