package autorreferencia;

public class Retangulo {
    private double altura, largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public void setTamanho(double altura, double largura) {
        if (largura >= 0 && altura >= 0) {
            this.altura = altura;
            this.largura = largura;
        }
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }
}
