package geometria;

import java.util.Arrays;

public abstract class Forma {
    private double medida[];

    public Forma(int numMedidas) {
        this.medida = new double[numMedidas];
    }

    public double getMedida(int i) {
        if (i < 0  || i >= medida.length) {
            throw new RuntimeException("Número inválido de medida.");
        }

        return medida[i];
    }

    public int getNumMedidas() {
        return medida.length;
    }

    public void setMedida(int i, double valor) {
        if (i < 0  || i >= medida.length) {
            throw new RuntimeException("Número inválido de medida.");
        }

        if (valor <= 0) {
            throw new RuntimeException("Valor da medida deve ser positivo.");
        }

        this.medida[i] = valor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[medidas:");
        for (double m : medida) {
            sb.append(m);
            sb.append(",");
        }
        sb.append(medida[medida.length - 1]);
        sb.append("]");
        return sb.toString();
    }

    public abstract double area();
}
