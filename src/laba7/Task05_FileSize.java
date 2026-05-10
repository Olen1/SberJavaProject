package laba7;

import java.io.File;
import java.util.Scanner;

public class Task05_FileSize {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название файла (путь): ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (file.exists() && file.isFile()) {
            long bytes = file.length();
            System.out.println("Размер файла: " + bytes + " байт");

            System.out.println("Файл не найден или указан неверный путь: " + file);
        }
    }
}


