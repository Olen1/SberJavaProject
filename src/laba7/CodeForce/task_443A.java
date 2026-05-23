package laba7.CodeForce;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task_443A {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String line = scanner.nextLine();

            Set<Character> uniqueLetters = new HashSet<>();

            // Проходим по каждому символу в строке
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);

                // Если символ - маленькая латинская буква
                if (c >= 'a' && c <= 'z') {
                    uniqueLetters.add(c);
                }
            }

            // Выводим количество уникальных букв
            System.out.println(uniqueLetters.size());

            scanner.close();
        }
    }


