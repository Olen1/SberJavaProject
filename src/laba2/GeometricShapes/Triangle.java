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

    // Setter с проверкой существования треугольника
    public void setSides(double a, double b, double c) {
        if (a > 0 && b > 0 && c > 0 &&
                a + b > c && a + c > b && b + c > a) {  // неравенство треугольника
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("Ошибка: некорректные стороны треугольника!");
        }
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

    @Override
    public String toString() {
        return String.format("%s{стороны=%.2f,%.2f,%.2f, площадь=%.2f, периметр=%.2f}",
                getName(), a, b, c, getArea(), getPerimeter());
    }
}