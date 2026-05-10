package laba6.CodeForce;


import java.util.Scanner;

public class task_266B  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем n (длина очереди) и t (время в секундах)
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.nextLine(); // Съедаем символ новой строки после чисел

        // Считываем строку с очередью
        String s = scanner.nextLine();

        // Превращаем строку в массив символов
        char[] queue = s.toCharArray();

        // Каждую секунду делаем обмены
        for (int second = 0; second < t; second++) {
            int i = 0;
            while (i < n - 1) { // Проходим по очереди, не доходя до последнего
                // Если мальчик (B) стоит перед девочкой (G)
                if (queue[i] == 'B' && queue[i + 1] == 'G') {
                    // Меняем их местами
                    char temp = queue[i];
                    queue[i] = queue[i + 1];
                    queue[i + 1] = temp;

                    // Перешагиваем через пару, чтобы не менять ту же девочку обратно
                    i += 2;
                } else {
                    i++;
                }
            }
        }

        // Выводим результат
        System.out.println(new String(queue));

        scanner.close();
    }
}