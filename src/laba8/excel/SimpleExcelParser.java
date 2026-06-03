package laba8.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SimpleExcelParser {

    private static final String FILE = "data.xlsx";

    public static void main(String[] args) {
        createFile();
        readFile();
    }

    static void createFile() {
        try (Workbook wb = new XSSFWorkbook()) {
            Sheet sheet = wb.createSheet("Лист1");

            // Заголовки
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Название");
            headerRow.createCell(1).setCellValue("Значение");

            // Данные
            Row row2 = sheet.createRow(1);
            row2.createCell(0).setCellValue("Тест");
            row2.createCell(1).setCellValue(123);


            try (FileOutputStream fos = new FileOutputStream(FILE)) {
                wb.write(fos);
            }

            System.out.println("Создано: " + FILE);

        } catch (Exception e) {
            System.err.println("Ошибка создания: " + e.getMessage());
            System.err.println("Проверьте права на запись");
        }
    }

    static void readFile() {
        File file = new File(FILE);

        if (!file.exists()) {
            System.err.println("Файл не найден Сначала создайте файл.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(file);
             Workbook wb = new XSSFWorkbook(fis)) {

            Sheet sheet = wb.getSheetAt(0);

            System.out.println("\nСодержимое файла:");
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(getValue(cell) + " | ");
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
            System.err.println("Возможные причины:");
            System.err.println("- Файл открыт в другой программе");
            System.err.println("- Файл поврежден");
            System.err.println("- Неверный формат (нужен .xlsx)");
        }
    }

    static String getValue(Cell cell) {
        if (cell == null) return "";
        switch (cell.getCellType()) {
            case STRING: return cell.getStringCellValue();
            case NUMERIC:
                double num = cell.getNumericCellValue();
                if (num == (long) num) {
                    return String.valueOf((long) num);
                }
                return String.valueOf(num);
            case BOOLEAN: return String.valueOf(cell.getBooleanCellValue());
            default: return "";
        }
    }
}