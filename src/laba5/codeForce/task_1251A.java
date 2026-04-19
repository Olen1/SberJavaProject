package laba5.codeForce;

import java.util.Scanner;
import java.util.stream.Collectors;

public class task_1251A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            // Перебираем буквы от a до z
            String result = "abcdefghijklmnopqrstuvwxyz"
                    .chars()  // поток символов a,b,c...
                    .filter(c -> countChar(s, (char) c) % 2 == 1)  // оставляем с нечетным количеством
                    .mapToObj(c -> String.valueOf((char) c))
                    .collect(Collectors.joining());

            System.out.println(result);
        }
        sc.close();
    }

    //  сколько раз символ ch встречается в строке s
    static long countChar(String s, char ch) {

        return s.chars().filter(c -> c == ch).count();
    }
}

