
//Создание классов и интерфейсов для работы с фигурами:
//        •	Создайте классы для различных геометрических фигур
//        (например, круг, квадрат, треугольник), каждый из которых имеет свои методы и поля.
//        •	Создайте интерфейс, который определяет методы, которые должны быть реализованы для каждой фигуры,
//        чтобы вычислить ее площадь и периметр.
//•	Реализуйте методы интерфейса в каждом классе фигуры и создайте объекты для каждой из них,
// чтобы вычислить их площадь и периметр.


package laba2.GeometricShapes;


public class Circle implements Shape {

    private double radius;  // радиус круга

    // Конструктор с валидацией
    public Circle(double radius) {
        setRadius(radius);
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter с валидацией
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Ошибка: радиус должен быть больше 0!");
        }
    }

    // Реализация методов интерфейса
    @Override
    public double getArea() {
        return Math.PI * radius * radius;  // S = πr²
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;  // P = 2πr
    }

    @Override
    public String getName() {
        return "Круг";
    }

    @Override
    public String toString() {
        return String.format("%s{радиус=%.2f, площадь=%.2f, периметр=%.2f}",
                getName(), radius, getArea(), getPerimeter());
    }
}