package laba7.Example9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example9 {



        public static void main(String[] args) {
            String inputFile = "src/laba7/Example9/input";
            String outputFile = "src/laba7/Example9/output";

            try (FileReader reader = new FileReader(inputFile);
                 FileWriter writer = new FileWriter(outputFile)) {

                int character;
                int charCount = 0;

                while ((character = reader.read()) != -1) {
                    writer.write(character);
                    charCount++;
                }

                System.out.println("Файл скопирован успешно!");
                System.out.println("Скопировано символов: " + charCount);
                System.out.println("Из: " + inputFile);
                System.out.println("В: " + outputFile);

            } catch (IOException e) {
                System.out.println("Ошибка при копировании файла: " + e.getMessage());
            }
        }
    }

