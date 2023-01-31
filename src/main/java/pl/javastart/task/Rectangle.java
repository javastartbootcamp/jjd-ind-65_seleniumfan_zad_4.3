package pl.javastart.task;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculateRectPerimeter() {
        return 2 * a + 2 * b;
    }
}
