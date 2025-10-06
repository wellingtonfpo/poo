package geom;

public abstract class Shape {
    private final double[] measure;

    public Shape(int numberOfMeasures) {
        this.measure = new double[numberOfMeasures];
    }

    public double getMeasure(int index) {
        if (index < 0 || index >= measure.length) {
            throw new RuntimeException("Invalid number of measurements!");
        }
        return measure[index];
    }

    public int getNumberOfMeasures() {
        return this.measure.length;
    }

    protected void setMeasure(int index, double measure) {
        if (index < 0 || index >= this.measure.length) {
            throw new RuntimeException("Invalid number of measurements!");
        }
        if (measure < 0) {
            throw new RuntimeException("Measurement cannot be negative!");
        }
        this.measure[index] = measure;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer(getClass().getName());
        sb.append("[measures:");
        for (double v : measure) {
            sb.append(v);
            sb.append(",");
        }
        sb.append(measure[measure.length - 1]);
        sb.append("]");
        return sb.toString();
    }

    public abstract double area();
}
