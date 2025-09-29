import java.util.Scanner;
import java.util.Locale;

import util.Calculadora;

public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor do raio: ");
        double raio = sc.nextDouble();

        double area = Calculadora.areaCircunferencia(raio);
        double perimetro = Calculadora.perimetroCircunferencia(raio);

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimetro: %.2f%n", perimetro);
        System.out.printf("Valor de PI: %.2f%n", Calculadora.PI);

        sc.close();
    }
}
