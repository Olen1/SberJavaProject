package laba4.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class table_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Пример матрицы 3x4
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int columnNumber = -1;

        // Ввод номера столбца с обработкой
        while (true) {
            try {
                System.out.print("Введите номер столбца (от 0 до " + (matrix[0].length - 1) + "): ");
                columnNumber = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("ОШИБКА: нужно ввести целое число");
                scanner.next();
            }
        }

        // Вывод столбца с обработкой выхода за границы
        try {
            System.out.println("Столбец " + columnNumber + ":");
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][columnNumber]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ОШИБКА: столбца с номером " + columnNumber + " не существует");
        } finally {
            scanner.close();
        }
    }
}