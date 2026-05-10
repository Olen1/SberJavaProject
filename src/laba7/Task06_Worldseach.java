package laba7;

import java.io.*;
import java.util.Scanner;

public class Task06_Worldseach {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Имя файла: ");
        String fileName = scanner.nextLine();

        System.out.print("Слово для поиска: ");
        String word = scanner.nextLine();


        int lineNum = 0;
        int found = 0;


        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;


            while ((line = reader.readLine()) != null) {
                lineNum++;

                if (line.toLowerCase().contains(word.toLowerCase())) {
                    System.out.println("  Строка " + lineNum + ": " + line);
                    found++;
                }
            }

            System.out.println("Найдено: " + found);

        } catch (FileNotFoundException e) {

            System.out.println(" Файл \"" + fileName + "\" не найден");
        } catch (IOException e) {
            System.out.println(" Ошибка: " + e.getMessage());
        }

        scanner.close();
    }
}


