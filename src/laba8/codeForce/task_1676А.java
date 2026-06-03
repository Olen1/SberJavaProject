package laba8.codeForce;

import java.util.Scanner;

public class task_1676А {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Читаем количество тестов

        for (int i = 0; i < t; i++) {
            String num = scanner.next(); // Читаем шестизначный номер как строку

            // Преобразуем символы в цифры
            int[] digits = new int[6];
            for (int j = 0; j < 6; j++) {
                digits[j] = num.charAt(j) - '0'; // Преобразуем char в int
            }

            // Сравниваем суммы первых трёх и последних трёх цифр
            if ((digits[0] + digits[1] + digits[2]) == (digits[3] + digits[4] + digits[5])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}