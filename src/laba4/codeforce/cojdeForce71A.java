package laba4.codeforce;


import java.util.Scanner;
import java.util.InputMismatchException;

public class cojdeForce71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Читаем количество слов
            int n = sc.nextInt();

            // Обрабатываем каждое слово
            for (int i = 0; i < n; i++) {
                String word = sc.next(); // читаем слово

                if (word.length() > 10) {
                    // Первая буква + (длина-2) + последняя буква
                    String shortWord = word.charAt(0) + "" + (word.length() - 2) + word.charAt(word.length() - 1);
                    System.out.println(shortWord);
                } else {
                    System.out.println(word);
                }
            }

        } catch (InputMismatchException e) {
            // Если вместо числа n ввели текст
            System.err.println(" первое значение должно быть числом");
        } catch (Exception e) {
            sc.close();
        }
    }
}