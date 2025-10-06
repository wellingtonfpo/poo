package geom;

public class Rectangle extends Shape {
    public Rectangle(double height, double width) {
        super(2);
        setMeasure(0, height);
        setMeasure(1, width);
    }

    @Override
    public double area() {
        return getMeasure(0) * getMeasure(1);
    }

    public double perimeter() {
        return 2 * (getMeasure(0) + getMeasure(1));
    }
}
