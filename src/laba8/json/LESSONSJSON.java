package laba8.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class LESSONSJSON {

    private static final String FILE_PATH = "D:\\Users\\Alina\\IdeaProjects\\SberJavaProject\\src\\laba8\\json\\lessons.json";
    private static JSONArray lessonsArray;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        load();


        //findByTeacher();
        //   addLesson();
       deleteLesson();
        }


    // Загрузка JSON файла
    static void load() throws Exception {
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader(FILE_PATH);
        JSONObject jsonObject = (JSONObject) parser.parse(reader);
        lessonsArray = (JSONArray) jsonObject.get("lessons");
        reader.close();
        System.out.println("Загружено предметов: " + lessonsArray.size());
    }

    // Сохранение JSON файла
    static void save() throws Exception {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("lessons", lessonsArray);

        FileWriter writer = new FileWriter(FILE_PATH);
        writer.write(jsonObject.toJSONString());
        writer.flush();
        writer.close();
        System.out.println("Сохранено");
    }


    // Поиск по преподавателю
    static void findByTeacher() {
        System.out.print("Введите фамилию преподавателя: ");
        String searchTeacher = scanner.nextLine();

        boolean found = false;



        for (int i = 0; i < lessonsArray.size(); i++) {
            JSONObject lesson = (JSONObject) lessonsArray.get(i);
            String teacher = (String) lesson.get("teacher");

            if (teacher.toLowerCase().contains(searchTeacher.toLowerCase())) {
                String title = (String) lesson.get("title");
                Long hours = (Long) lesson.get("hours");
                System.out.println("  - " + title + " (" + hours + " ч)");
                found = true;
            }
        }

        if (!found) {
            System.out.println("  Предметы не найдены");
        }
    }



    //  Добавить предмет
    static void addLesson() throws Exception {


        System.out.print("Название предмета: ");
        String title = scanner.nextLine();

        System.out.print("Преподаватель: ");
        String teacher = scanner.nextLine();

        System.out.print("Количество часов: ");
        long hours = scanner.nextLong();

        System.out.print("Номер семестра: ");
        long semester = scanner.nextLong();
        scanner.nextLine();

        JSONObject newLesson = new JSONObject();
        newLesson.put("title", title);
        newLesson.put("teacher", teacher);
        newLesson.put("hours", hours);
        newLesson.put("semester", semester);

        lessonsArray.add(newLesson);
        save();
        System.out.println(" Предмет \"" + title + "\" добавлен");
    }

    // Удалить предмет
    static void deleteLesson() throws Exception {
        System.out.print("Введите название предмета для удаления: ");
        String titleToDelete = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < lessonsArray.size(); i++) {
            JSONObject lesson = (JSONObject) lessonsArray.get(i);
            String title = (String) lesson.get("title");

            if (title.equalsIgnoreCase(titleToDelete)) {
                lessonsArray.remove(i);
                found = true;
                break;
            }
        }

        if (found) {
            save();
            System.out.println("Предмет \"" + titleToDelete + "\" удален");
        } else {
            System.out.println("Предмет \"" + titleToDelete + "\" не найден");
        }
    }


    }
