package laba6.CodeForce;


import java.util.Scanner;

public class task_705А  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем количество уровней
        int n = scanner.nextInt();

        // Создаем StringBuilder для эффективной сборки строки
        StringBuilder result = new StringBuilder();

        // Строим фразу
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) { // Нечетный уровень
                result.append("I hate");
            } else { // Четный уровень
                result.append("I love");
            }

            // Если это не последний уровень, добавляем " that "
            if (i != n) {
                result.append(" that ");
            }
        }

        // В конце добавляем " it"
        result.append(" it");

        // Выводим результат
        System.out.println(result.toString());

        scanner.close();
    }
}
