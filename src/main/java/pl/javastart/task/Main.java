package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        double a = 5.0;
        double b = 10.0;
        double c = 15.0;
        Circle circle = new Circle(a);
        double circleArea = shapeCalculator.calculateCircleArea(circle);
        System.out.printf("Pole koła o boku %.2f wynosi: %.2f\n", a, circleArea);

        Rectangle rectangle = new Rectangle(a, b);
        double rectanglePerimeter = shapeCalculator.calculateRectPerimeter(rectangle);
        System.out.printf("Obwód prostokąta o bokach %.2f i %.2f wynosi: %.2f\n", a, b, rectanglePerimeter);

        Square square = new Square(a);
        double squareArea = shapeCalculator.calculateSquareArea(square);
        System.out.printf("Pole kwadratu o bokach %.2f wynosi: %.2f\n", a, squareArea);

        Triangle triangle = new Triangle(a, b, c);
        double trianglePerimeter = shapeCalculator.calculateTrianglePerimeter(triangle);
        System.out.printf("Obwód trójkąta o bokach %.2f, %.2f, %.2f wynosi: %.2f\n", a, b, c, trianglePerimeter);
    }
}
