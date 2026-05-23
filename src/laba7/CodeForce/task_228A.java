package laba7.CodeForce;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task_228A {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Считываем 4 числа
            int s1 = scanner.nextInt();
            int s2 = scanner.nextInt();
            int s3 = scanner.nextInt();
            int s4 = scanner.nextInt();

            // Создаём множество для хранения уникальных цветов
            Set<Integer> uniqueColors = new HashSet<>();

            // Добавляем все подковы в множество
            uniqueColors.add(s1);
            uniqueColors.add(s2);
            uniqueColors.add(s3);
            uniqueColors.add(s4);

            // Количество уникальных цветов
            int uniqueCount = uniqueColors.size();

            // Сколько нужно купить
            int needToBuy = 4 - uniqueCount;

            System.out.println(needToBuy);

            scanner.close();
        }
    }


