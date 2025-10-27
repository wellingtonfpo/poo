package entities;

import contracts.Printable;

public class PrintableMessage extends Message implements Printable{
    public PrintableMessage(String content) {
        super(content);
    }

    @Override
    public void print() {
        printInConsole();
    }

    @Override
    public void printInConsole() {
        System.out.println(Printable.START);
        System.out.println(getContent());
        System.out.println(Printable.END);
    }
}
