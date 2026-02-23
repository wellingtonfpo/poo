package sobrecarga;

public class Ponto2D {
    public double x, y;

    //construtor default
    public Ponto2D() {
        x = 0;
        y = 0;
    }

    //contrutor parameterizado - ponto definido na instanciação
    public Ponto2D(double px, double py) {
        x = px;
        y = py;
    }

    //determina distância entre a instancia e a coordanada dada
    public double distancia(double px, double py) {
        return Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - y, 2));
    }

    //determina distância entre a instancia e ponto dado
    public double distancia(Ponto2D p) {
        return Math.sqrt(Math.pow(x- p.x, 2) + Math.pow(x - p.y, 2));
    }

    @Override
    public String toString() {
        return "Ponto2D[x=" + x + ", y=" + y + "]";
    }
}
