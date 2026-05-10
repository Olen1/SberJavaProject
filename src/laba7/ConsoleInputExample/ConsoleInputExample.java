package laba7.ConsoleInputExample;

import java.io.*;
import java.util.Scanner;

public class ConsoleInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите данные для записи в файл: ");
        String userInput = scanner.nextLine();

        String filePath = "src/laba7/ConsoleInputExample/user_file";

        // Запись данных, введённых с консоли
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(userInput);
            System.out.println("Данные записаны в файл: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        // Чтение и вывод данных
        System.out.println("\nСодержимое файла:");
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }

        scanner.close();
    }
}