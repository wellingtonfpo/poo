package util;

public class Calculadora {
    public static final double PI = 3.14159;

    public static double areaCircunferencia(double raio) {
        return PI * Math.pow(raio, 2);
    }

    public static double perimetroCircunferencia(double raio) {
        return 2.0 * PI * raio;
    }
}
