package laba2.GeometricShapesForEx8;

public class Triangle extends Shape {

    private final double a, b, c; // длины сторон

    public Triangle(double a, double b, double c) {
        super("Треугольник");
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        // Формула Герона
        double p = perimeter() / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
