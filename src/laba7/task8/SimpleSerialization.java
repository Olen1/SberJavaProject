package laba7.task8;


import java.io.*;

public class SimpleSerialization {
    public static void main(String[] args) {
        String fileName = "src/laba7/task8/Book.json";


        task8.Book book = new task8.Book("Java для начинающих", "Иван Иванов", 2024, 1500.0);

        book.display();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(book);
            System.out.println("\nОбъект сохранён в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка сохранения: " + e.getMessage());
            return;
        }


        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            task8.Book restoredBook = (task8.Book) ois.readObject();
            System.out.println("\n Объект восстановлен из файла: " + fileName);

            System.out.println("\nВосстановленный объект:");
            restoredBook.display();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка восстановления: " + e.getMessage());
        }
    }
}
