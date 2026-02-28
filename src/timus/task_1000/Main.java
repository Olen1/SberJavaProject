
package timus.task_1000;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаём объект‑сканер, который читает данные из стандартного ввода (консоль)
        Scanner scanner = new Scanner(System.in);

        // Читаем первое число
        System.out.print("Введите a: ");
        long a = scanner.nextLong();          // можно использовать int, если гарантируется диапазон int

        // Читаем второе число
        System.out.print("Введите b: ");
        long b = scanner.nextLong();

        // Вычисляем сумму
        long sum = a + b;

        // Печатаем результат
        System.out.println("a + b = " + sum);

        // Закрываем scanner (необязательно в простом консольном приложении,
        // но хорошая привычка)
        scanner.close();
    }
}
