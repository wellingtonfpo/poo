package geom;

import java.lang.Math.*;

public class Circumference extends Shape {
    public Circumference(double radius) {
        super(1);
        setRadius(radius);
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(getMeasure(0), 2);
    }

    public void setRadius(double radius) {
        setMeasure(0, radius);
    }
}
