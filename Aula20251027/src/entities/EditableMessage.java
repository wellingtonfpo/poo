package entities;

import contracts.Editable;

public class EditableMessage extends Message implements Editable {
    public EditableMessage(String content) {
        super(content);
    }


    @Override
    public void edit(String newContent) {
        setContent(newContent);
    }

    @Override
    public void print() {
        System.out.println(getContent());
    }

    @Override
    public void printInConsole() {
        System.out.println(getContent());
    }
}
