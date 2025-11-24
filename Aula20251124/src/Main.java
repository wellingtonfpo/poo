import service.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value #" + (i + 1) + ": ");
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer firstValue = ps.first();
        System.out.println("First value: " + firstValue);
    }
}
