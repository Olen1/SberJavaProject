package laba2.GeometricShapes;

public class Triangle implements Shape {

    private double a;  // сторона A
    private double b;  // сторона B
    private double c;  // сторона C

    public Triangle(double a, double b, double c) {
        setSides(a, b, c);
    }

    // Getter-ы
    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }

    // Setter
    public void setSides(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
    }

    @Override
    public double getArea() {
        // Формула Герона: S = √[p(p-a)(p-b)(p-c)], где p = полупериметр
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;  // P = a + b + c
    }

    @Override
    public String getName() {
        return "Треугольник";
    }

}