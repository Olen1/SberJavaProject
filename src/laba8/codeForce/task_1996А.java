package laba8.codeForce;

import java.util.Scanner;

public class task_1996А {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Читаем количество тестов

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Читаем количество ног

            // Минимальное количество животных:
            // Сначала берём максимальное количество коров (n / 4)
            // Оставшиеся ноги (n % 4) могут быть только 0 или 2,
            // так как n чётное. Делим их на 2, чтобы получить количество кур.
            int minAnimals = n / 4 + (n % 4) / 2;

            System.out.println(minAnimals);
        }

        scanner.close();
    }
}