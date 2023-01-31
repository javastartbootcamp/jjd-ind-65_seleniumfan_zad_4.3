package pl.javastart.task;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateTrianglePerimeter() {
        return a + b + c;
    }
}
