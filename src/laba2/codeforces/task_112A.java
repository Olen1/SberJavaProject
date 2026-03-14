
//
//Маленький Петя очень любит подарки.
// Его мама подарила ему на день рождения две строки равной длины, состоящие из больших и маленьких букв латинского алфавита.
// Теперь Петя хочет сравнить эти строки лексикографически.
// При этом регистр букв значения не имеет, то есть большая буква считается эквивалентной соответствующей маленькой букве.
// Помогите Пете выполнить сравнение.

package laba2.codeforces;

import java.util.Scanner;

public class task_112A {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            int n = s1.length();                // обе строки одинаковой длины
            for (int i = 0; i < n; i++) {
                char c1 = Character.toLowerCase(s1.charAt(i));
                char c2 = Character.toLowerCase(s2.charAt(i));

                if (c1 < c2) {
                    System.out.println("-1");
                    return;
                }
                if (c1 > c2) {
                    System.out.println("1");
                    return;
                }
            }
            System.out.println("0");
        }
    }
