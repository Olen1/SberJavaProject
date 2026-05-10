package laba7.Example6;

import java.io.*;

public class Example6
{
    public static void main(String[] args) {

        String inputFileName = "src/laba7/Example6/input";
        String outputFileName = "src/laba7/Example6/output";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName));
             PrintWriter printWriter = new PrintWriter(outputFileName, "UTF-8")) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line.toUpperCase());
            }
            System.out.println("Данные записаны в файл: " + outputFileName);

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}