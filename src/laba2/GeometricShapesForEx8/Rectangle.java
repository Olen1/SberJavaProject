package laba2.GeometricShapesForEx8;

public class Rectangle extends Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        super("Прямоугольник");
        this.width  = width;
        this.height = height;
    }

    public double getWidth()  { return width; }
    public double getHeight() { return height; }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
