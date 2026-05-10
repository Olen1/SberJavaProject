package laba7.Example2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        String fileName = "src/laba7/Example2/example_file.txt";
        String data = "Эти данные для записи в файл";

        try {
            FileOutputStream outputStream = new FileOutputStream(fileName);
            outputStream.write(data.getBytes());
            outputStream.close(); // Важно закрыть поток
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }


        try (FileInputStream inputstream=new FileInputStream(fileName)){
            byte [] buffer= new byte[1024];
            int bytesRead=inputstream.read(buffer);
            String readData= new String(buffer, 0, bytesRead);
            System.out.println("Прочитанные данные " + readData);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении из файла " + e.getMessage());
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