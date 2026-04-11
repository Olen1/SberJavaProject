package laba4.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class table_task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        // Ввод размера массива с обработкой ошибок
        while (true) {
            try {
                System.out.print("Введите размер массива: ");
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Размер должен быть > 0");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("ОШИБКА: введите целое число, а не строку");
                scanner.next(); // очищаем неправильный ввод
            }
        }

        int[] arr = new int[n];

        // Ввод элементов массива
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("arr[" + i + "] = ");
                    arr[i] = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("ОШИБКА: введите целое число");
                    scanner.next();
                }
            }
        }

        // Вычисление среднего среди положительных
        try {
            int sum = 0;
            int count = 0;

            for (int num : arr) {
                if (num > 0) {
                    sum += num;
                    count++;
                }
            }

            if (count == 0) {
                throw new ArithmeticException("Нет положительных элементов");
            }

            double average = (double) sum / count;
            System.out.println("Среднее положительных: " + average);

        } catch (ArithmeticException e) {
            System.out.println("ОШИБКА: " + e.getMessage());
        } finally {

            scanner.close();
        }
    }
}