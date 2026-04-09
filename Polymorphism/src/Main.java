import geometria.Circunferencia;
import geometria.Forma;
import geometria.Retangulo;
import geometria.Triangulo;

void main() {
//    Retangulo r = new Retangulo(1.0, 2.0);
//    System.out.println("Área do retângulo: " + r.area());
//    Forma f = new Retangulo(1.0, 2.0);
//    System.out.println("Área do retângulo (Usando Forma): " + f.area());

    Circunferencia c = new Circunferencia(1.5);
    System.out.println("Área da circunferência: " + c.area());

    Retangulo r = new Retangulo(2.5, 4.0);
    System.out.println("Área do retângulo: " + r.area());

    System.out.println();
    System.out.println("Comparando áreas usando polimorfismo:");

    Forma[] formas = new Forma[3];
    formas[0] = c;
    formas[1] = r;
    formas[2] = new Triangulo(1.0, 2.0, 2.0);

    for (Forma f : formas) {
        System.out.println("Área: " + f.area());
    }
}
