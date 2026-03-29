
//Создание класса "Прямоугольник":
//        •	Создайте класс Rectangle, который содержит поля для длины и ширины прямоугольника.
//        •	Добавьте методы, которые позволяют установить и получить значения этих полей.
//•	Добавьте методы, которые позволяют вычислить площадь и периметр прямоугольника.
//        •	Добавьте конструктор, который позволяет создавать объекты класса Rectangle,
//        используя значения для длины и ширины.

package laba2;

public class Rectangle {
    private int length;
    private int width;

    // методы для получения
    public int getLength() {
        return length;
    }
    
    public int getWidth() {
        return width;
    }

    // методы для установки значения
    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int pyrimeter (int length, int width ) {
        int p = 2*length + 2*width;
        return p;
    }

    public int square (int length, int width ) {
        int s = length * width;
        return s;
    }
        // конструктор
    public Rectangle (int length, int width) {
            this.length = length;
            this.width = width;
        }
    }