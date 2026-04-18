package laba5.codeForce;

import java.util.Scanner;

public class task_96A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // Проверяем, есть ли в строке "0000000" или "1111111"
        if (s.contains("0000000") || s.contains("1111111")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
