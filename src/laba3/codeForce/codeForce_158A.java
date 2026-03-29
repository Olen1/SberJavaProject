package laba3.codeForce;

import java.util.*;

public class codeForce_158A {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();  // например: "3+2+1"

            // 1. Убираем плюсы и получаем массив цифр
            String[] parts = s.split("\\+");

            // 2. Преобразуем в числа и сортируем
            List<Integer> numbers = new ArrayList<>();
            for (String part : parts) {
                numbers.add(Integer.parseInt(part));
            }
            Collections.sort(numbers);  // сортировка по возрастанию

            // 3. Собираем результат обратно в строку
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < numbers.size(); i++) {
                if (i > 0) result.append("+");
                result.append(numbers.get(i));
            }

            System.out.println(result);
        }
    }