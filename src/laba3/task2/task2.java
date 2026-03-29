package laba3.task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();
        toBinary(num);
        System.out.println("Результат: " + toBinary(num));
        System.out.println();
    }

    public static String toBinary(int n) {
        if (n == 0) return "0";
        if (n == 1) return "1";
        return toBinary(n / 2) + (n % 2);  // рекурсия + остаток от деления
    }
// Пример: toBinary(10) → "1010"
    }
