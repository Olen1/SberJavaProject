package laba2.GeometricShapes;

/**
 * Интерфейс для геометрических фигур
 * Определяет контракт: каждая фигура должна уметь вычислять площадь и периметр
 */
public interface Shape {

    /**
     * Вычисляет площадь фигуры
     * @return площадь (double)
     */
    double getArea();

    /**
     * Вычисляет периметр фигуры
     * @return периметр (double)
     */
    double getPerimeter();

    /**
     * Возвращает название фигуры
     * @return строка с именем фигуры
     */
    String getName();
}