package laba7.Task07_WriteWithCount;

import java.io.*;
import java.util.Scanner;

public class Task07_WriteWithCount {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Имя файла: ");
        String fileName = scanner.nextLine();

        System.out.print("Текст, который нужно записать в файл: ");
        String userInput = scanner.nextLine();
        int charCount = userInput.length();

        // Запись данных, введённых с консоли
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(userInput);
            System.out.println("Данные записаны в файл: " + fileName);
            System.out.println("Количество символов: " + charCount);
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }
    }
}


