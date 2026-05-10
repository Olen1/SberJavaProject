package laba7.Example4;

import java.io.*;

public class Example4 {
    public static void main(String[] args) {
        String fileName = "example_file.txt";
        String data = "Это данные для записи в файл";

        // Запись данных в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
            System.out.println("Данные успешно записаны: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при попытке записи данных: " + e.getMessage());
        }

        // Чтение данных из файла
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            char[] buffer = new char[1024];
            int charRead = reader.read(buffer);
            String readData = new String(buffer, 0, charRead);
            System.out.print("Прочитанные данные: " + readData);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        // Удаление файла
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("Файл удален: " + fileName);
        } else {
            System.out.println("Не удалось удалить файл: " + fileName);
        }
    }
}