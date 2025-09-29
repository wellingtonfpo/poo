import utils.ConversorCmPol;
import utils.CelsiusKelvin;
import utils.KelvinCelsius;

public class App {
    public static void main(String[] args) {
        ConversorCmPol conversorCmPol = new ConversorCmPol();
        CelsiusKelvin conversorCtoK = new CelsiusKelvin();
        KelvinCelsius conversorKtoC = new KelvinCelsius();

        double cm = 10.0;
        double celsius = 25.0;
        double kelvin = 300.0;

        double pol = conversorCmPol.converter(cm);
        double k = conversorCtoK.converter(celsius);
        double cel = conversorKtoC.converter(kelvin);

        System.out.printf("%.2f cm = %.2f pol%n", cm, pol);
        System.out.printf("%.2f Celsius = %.2f Kelvin %n", celsius, k);
        System.out.printf("%.2f Kelvin = %.2f Celsius %n", kelvin, cel);

        // Método equals()
        Object a = new Object();
        Object b = new Object();
        Object c = b;

        System.out.println("HashCodes: " + a.hashCode() + " " + b.hashCode() + " " + c.hashCode());

        System.out.println("a == b " + a.equals(b) + "\tb == a " + b.equals(a));
        System.out.println("b == c " + b.equals(c) + "\tc == b " + c.equals(b));
        System.out.println("a == c " + a.equals(c) + "\tc == a " + c.equals(a));

        String s = new String("FPO - Java");
        String w = "Wellington";
        String u = s;

        System.out.println("s == w " + s.equals(w) + "\tw == s " + w.equals(s));
        System.out.println("s == u " + s.equals(u) + "\tu == s " + u.equals(s));

    }
}
