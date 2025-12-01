import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileExceptionHandling {
    public static void main(String[] args) {
        File file = new File("input.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
