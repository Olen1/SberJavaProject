package laba7.Example3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        String filePath = "src/laba7/Example3/example_file.txt";
        String data = "Hello, World!";

        // Запись с помощью FileWriter
        try (FileWriter fw = new FileWriter(filePath)) {
            fw.write(data);
            System.out.println("Данные записаны в файл (FileWriter)");
            System.out.println("Записано символов: " + data.length());
        } catch (IOException e) {
            System.out.println("Ошибка при записи: " + e.getMessage());
        }

        // Чтение с помощью FileReader
        try (FileReader fr = new FileReader(filePath)) {
            char[] buffer = new char[1024];
            int charsRead = fr.read(buffer);
            String readData = new String(buffer, 0, charsRead);
            System.out.println("Прочитано из файла (FileReader): " + readData);
            System.out.println("Прочитано символов: " + charsRead);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении: " + e.getMessage());
        }

        // Удаление файла
        new java.io.File(filePath).delete();
        System.out.println("Файл удалён");
    }
}