package laba2.GeometricShapes;


public class Square implements Shape {

    private double side;  // сторона квадрата

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
            this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;  // S = a²
    }

    @Override
    public double getPerimeter() {
        return 4 * side;  // P = 4a
    }

    @Override
    public String getName() {
        return "Квадрат";
    }

}