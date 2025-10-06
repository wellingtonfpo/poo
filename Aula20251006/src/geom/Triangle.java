package geom;

import java.lang.Math;

public class Triangle extends Shape {
    public Triangle(double sideA, double sideB, double sideC) {
        super(3);
        setMeasure(0, sideA);
        setMeasure(1, sideB);
        setMeasure(2, sideC);
    }

    // Heron's formula
    @Override
    public double area() {
        double sp = (getMeasure(0) + getMeasure(1) + getMeasure(2)) / 2;
        return Math.sqrt(sp * (sp - getMeasure(0)) * (sp - getMeasure(1)) * (sp - getMeasure(2)));
    }
}
