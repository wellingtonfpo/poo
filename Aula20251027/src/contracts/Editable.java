package contracts;

public interface Editable extends Printable {
    void edit(String newContent);

    default void clear() {
        edit("");
    }
}
