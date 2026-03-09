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
        if (side > 0) {
            this.side = side;
        } else {
            System.out.println("Ошибка: сторона должна быть больше 0!");
        }
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

    @Override
    public String toString() {
        return String.format("%s{сторона=%.2f, площадь=%.2f, периметр=%.2f}",
                getName(), side, getArea(), getPerimeter());
    }
}