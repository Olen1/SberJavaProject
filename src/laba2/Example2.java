//Напишите программу, в которой создается двумерный числовой массив и этот массив заполняется «змейкой»:
// сначала первая строка (слева направо), затем последний столбец (сверху вниз), вторая строка (справа налево) и так далее,
// как показано на рисунке:
package laba2;
import java.util.Scanner;
import java.util.Random;

public class Example2 {

        public static void main(String[] args) {
            Scanner id = new Scanner(System.in);
            // Ввод размеров массива
            System.out.println("Введите количество строк:");
            int rows = id.nextInt();
            System.out.println("Введите количество столбцов:");
            int cols = id.nextInt();

            // Создание двумерного массива
            int[][] matrix = new int[rows][cols];

            // Заполнение массива змейкой
            int value = 1;
            for (int i = 0; i < rows; i++) {
                if (i % 2 == 0) {
                    // Чётная строка (0, 2, 4...) - слева направо
                    for (int j = 0; j < cols; j++) {
                        matrix[i][j] = value++;
                    }
                } else {
                    // Нечётная строка (1, 3, 5...) - справа налево
                    for (int j = cols - 1; j >= 0; j--) {
                        matrix[i][j] = value++;
                    }
                }
            }

            // Вывод массива
            System.out.println("\nМассив, заполненный змейкой:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }
}

