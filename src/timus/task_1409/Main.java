package timus.task_1409;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем количество банок, простреленных Гарри и Ларри
        int a = scanner.nextInt(); // прострелил Гарри
        int b = scanner.nextInt(); // прострелил Ларри

        // Вычисляем, сколько банок не прострелил каждый
        int notHarry = b - 1;
        int notLarry = a - 1;

        // Выводим результат
        System.out.println(notHarry + " " + notLarry);

        scanner.close();
    }
}