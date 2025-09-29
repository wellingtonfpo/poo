package utils;

public class Conversor {
    protected double kProp, kLin;

    public Conversor(double kProp, double kLin) {
        this.kProp = kProp;
        this.kLin = kLin;
    }

    public double getkProp() {
        return kProp;
    }

    public double getkLin() {
        return kLin;
    }

    public double converter(double valor) {
        return kProp * valor + kLin;
    }

    public String toString() {
        return "kProp: " + kProp + ", kLin: " + kLin;
    }
}
