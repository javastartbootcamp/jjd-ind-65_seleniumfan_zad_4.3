package pl.javastart.task;

public class Square {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double calculateSquareArea() {
        return Math.pow(a, 2);
    }
}
