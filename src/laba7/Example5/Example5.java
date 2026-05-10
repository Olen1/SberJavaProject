package laba7.Example5;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Example5 {
    public static void main(String[] args) {
        String inputFileName = "src/laba7/Example5/input";
        String outputFileName = "src/laba7/Example5/output";

        try (
                InputStream inputStream =
                        new FileInputStream(inputFileName);
                InputStreamReader inputStreamReader =
                        new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                BufferedReader bufferedReader =
                        new BufferedReader(inputStreamReader);
                OutputStream outputStream =
                        new FileOutputStream(outputFileName);
                OutputStreamWriter outputStreamWriter =
                        new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
                BufferedWriter bufferedWriter =
                        new BufferedWriter(outputStreamWriter)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine(); // Перенос строки
            }
            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException ex) {
            System.out.println("Ошибка при чтении или записи файла: " + ex.getMessage());
        }
    }
}