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
        double c = conversorKtoC.converter(kelvin);

        System.out.printf("%.2f cm = %.2f pol%n", cm, pol);
        System.out.printf("%.2f Celsius = %.2f Kelvin %n", celsius, k);
        System.out.printf("%.2f Kelvin = %.2f Celsius %n", kelvin, c);
    }
}
