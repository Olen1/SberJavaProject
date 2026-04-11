package laba4.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class table_task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            byte a, b, c;

            System.out.print("Введите первое число (от -128 до 127): ");
            a = scanner.nextByte();

            System.out.print("Введите второе число (от -128 до 127): ");
            b = scanner.nextByte();

            System.out.print("Введите третье число (от -128 до 127): ");
            c = scanner.nextByte();

            int sum = a + b + c;
            System.out.println("Сумма = " + sum);

        } catch (InputMismatchException e) {
            // Эта ошибка будет и для букв, и для чисел вне диапазона
            System.out.println("ОШИБКА: нужно ввести число от -128 до 127!");
        } finally {
            System.out.println("Конец программы");
            scanner.close();
        }
    }
}