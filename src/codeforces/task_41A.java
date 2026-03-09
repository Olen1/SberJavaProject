//
//Перевод с берляндского языка на бирляндский — задача не из легких.
//        Эти языки очень похожи: слово на бирляндском языке отличается от такого же по смыслу слова на берляндском только тем, что оно пишется (и произносится) наоборот.
//        Например, слову code в берляндском языке соответствует слово edoc в бирляндском. Несмотря на это, при «переводе» легко ошибиться.
//        Вася перевел слово s с берляндского на бирляндский как t. Помогите ему: определите, правильно ли он выполнил перевод?


package codeforces;

import java.util.Scanner;

public class task_41A {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String t = sc.nextLine();

            StringBuilder sb = new StringBuilder(s);
            sb.reverse();                     // получаем обратную строку
            String rev = sb.toString();

            System.out.println(rev.equals(t) ? "YES" : "NO");
        }
    }
