import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// https://docs.oracle.com/javase/8/docs/api/java/util/List.html

public class CollectionTest {
    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Purple"};
        List<String> list = new ArrayList<>();

        for (String color : colors)
            list.add(color);

        String[] removeColors = {"Green", "Yellow"};
        List<String> removeList = new ArrayList<>();

        for (String color : removeColors)
            removeList.add(color);

        System.out.println("ArrayList: ");
        for (int i = 0; i < list.size(); i++)
            System.out.printf("%s ", list.get(i));

        removeColors(list, removeList);

        System.out.printf("%n%nArrayList after removing elements: %n");

        for (int i = 0; i < list.size(); i++)
            System.out.printf("%s ", list.get(i));
    }

    private static void removeColors(List<String> collection1, List<String> collection2) {
        Iterator<String> iterator = collection1.iterator();

        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next()))
                iterator.remove();
        }
    }
}
