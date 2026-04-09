package geometria;

import static java.lang.Math.*;

public class Circunferencia extends Forma {
    public Circunferencia(double raio) {
        super(1);
        setRaio(raio);
    }

    public void setRaio(double raio) {
        setMedida(0, raio);
    }

    @Override
    public double area() {
        return PI * pow(getMedida(0), 2);
    }
}
