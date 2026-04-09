package geometria;

public class Triangulo extends Forma {
    public Triangulo(double l1, double l2, double l3) {
        super(3);
        setMedida(0, l1);
        setMedida(1, l2);
        setMedida(2, l3);
    }

    /**
     * Calcula a área do triângulo usando a fórmula de Heron.
     * A fórmula de Heron é dada por: <br> A = sqrt(s * (s - a) * (s - b) * (s - c))
     * <br>
     * onde s é o semiperímetro do triângulo, calculado como: s = (a + b + c) / 2
     * <br>
     * a, b e c são os lados do triângulo.
     * @return a área do triângulo
     */
    @Override
    public double area() {
        double s = (getMedida(0) + getMedida(1) + getMedida(2)) / 2;
        return Math.sqrt(s * (s - getMedida(0)) * (s - getMedida(1)) * (s - getMedida(2)));
    }
}
