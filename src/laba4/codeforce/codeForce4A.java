package laba4.codeforce;

import java.util.Scanner;
import java.util.InputMismatchException;

public class codeForce4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Читаем вес арбуза
            int w = sc.nextInt();

            // Проверяем: вес должен быть чётным и больше 2
            // (2 = 1+1 — не подходит, т.к. 1 — нечётное)
            if (w % 2 == 0 && w > 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        } catch (InputMismatchException e) {
            // Если вместо числа ввели текст
            System.err.println("  введите число, а не текст");
        } catch (Exception e) {
            sc.close();
        }
    }
}