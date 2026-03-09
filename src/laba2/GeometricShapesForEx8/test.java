package laba2.GeometricShapesForEx8;

public class test {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle  = new Triangle(3.0, 4.0, 5.0);
        Shape circle = new Circle(10);


        double perimeter1 = rectangle.perimeter();
        double perimeter2 = triangle.perimeter();
        double perimeter3 = circle.perimeter();
        System.out.println("Периметр прямоугольника " + perimeter1);
        System.out.println("Периметр треугольника " + perimeter2);
        System.out.println("Периметр круга  " + perimeter3);

        double area1 = rectangle.area();
        double area2 = triangle.area();
        double area3 = circle.area();
        System.out.println("Периметр прямоугольника " + area1);
        System.out.println("Периметр треугольника " + area2);
        System.out.println("Периметр круга  " + area3);


    }


}

