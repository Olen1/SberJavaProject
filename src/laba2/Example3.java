
//Напишите программу «Шифр Цезаря», которая зашифровывает введенный текст.
// Используете кодовую таблицу символов. При запуске программы в консоль необходимо вывести сообщение:
// «Введите текст для шифрования», после ввода текста, появляется сообщение: «Введите ключ».
// После того как введены все данные, необходимо вывести преобразованную строку с сообщением «Текст после преобразования: ».
// Далее необходимо задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)», если пользователь вводит «y»,
// тогда выполнить обратное преобразование. Если пользователь вводит «n», того программа выводит сообщение «До свидания!».
// Если пользователь вводит что-то другое, отличное от «y» или «n»,
// то программа ему выводит сообщение: «Введите корректный ответ».

package laba2;

import java.util.Scanner;

public class Example3 {

    // Метод для шифрования/расшифровки строки
    public static String caesarCipher(String text, int shift) {
        char[] arrayChar = text.toCharArray();
        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            // Прибавляем сдвиг к символу (для расшифровки shift будет отрицательным)
            arrayCharNew[i] = (char) (arrayChar[i] + shift);
        }
        return new String(arrayCharNew);
    }

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        // 1. Ввод текста для шифрования
        System.out.println("Введите текст для шифрования:");
        String input = str.nextLine();

        // 2. Ввод ключа (сдвига)
        System.out.println("Введите ключ:");
        int shift = str.nextInt();
        str.nextLine(); // очищаем буфер после nextInt()

        // 3. Шифрование и вывод результата
        String encrypted = caesarCipher(input, shift);
        System.out.println("Текст после преобразования: " + encrypted);

        // 4. Спрашиваем, нужно ли выполнить обратное преобразование
        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String answer = str.nextLine().trim().toLowerCase();

            if (answer.equals("y")) {
                // Обратное преобразование: вычитаем тот же сдвиг
                String decrypted = caesarCipher(encrypted, -shift);
                System.out.println("Текст после обратного преобразования: " + decrypted);
                System.out.println("До свидания!");
                break;
            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
                // цикл продолжится, снова спросим
            }
        }

        str.close();
    }
}