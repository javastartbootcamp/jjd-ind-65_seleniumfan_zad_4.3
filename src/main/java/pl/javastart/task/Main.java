package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        double a = 5.0;
        double b = 10.0;
        double c = 15.0;
        Circle circle = new Circle(a);
        double circleArea = circle.calculateCircleArea();
        System.out.printf("Pole koła o boku %.2f wynosi: %.2f\n", a, circleArea);

        Rectangle rectangle = new Rectangle(a, b);
        double rectanglePerimeter = rectangle.calculateRectPerimeter();
        System.out.printf("Obwód prostokąta o bokach %.2f i %.2f wynosi: %.2f\n", a, b, rectanglePerimeter);

        Square square = new Square(a);
        double squareArea = square.calculateSquareArea();
        System.out.printf("Pole kwadratu o bokach %.2f wynosi: %.2f\n", a, squareArea);

        Triangle triangle = new Triangle(a, b, c);
        double trianglePerimeter = triangle.calculateTrianglePerimeter();
        System.out.printf("Obwód trójkąta o bokach %.2f, %.2f, %.2f wynosi: %.2f\n", a, b, c, trianglePerimeter);
    }
}
