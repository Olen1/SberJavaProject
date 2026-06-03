package laba8.xml;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static Document doc;
    static Element root;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        load();
        findByTeacher();
        add();
        delete();

    }

    // Загрузка XML файла
    static void load() throws Exception {
        File file = new File("src/laba8/xml/lessons.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        doc = builder.parse(file);
        root = doc.getDocumentElement();
    }

    // Сохранение в XML
    static void save() throws Exception {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("lessons.xml"));
        transformer.transform(source, result);
        System.out.println("Сохранено!");
    }



    //  Поиск по преподавателю
    static void findByTeacher() {
        System.out.print("Фамилия учителя: ");
        String search = sc.nextLine().toLowerCase();

        NodeList nodeList = root.getElementsByTagName("lesson");

        List<Element> found = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            found.add((Element) nodeList.item(i));
        }

        // Используем Stream API и filter() как в подсказке 2
        List<Element> result = found.stream()
                .filter(element -> {
                    String teacher = element.getElementsByTagName("teacher").item(0).getTextContent();
                    return teacher.toLowerCase().contains(search);
                })
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("Не найдено");
        } else {
            for (Element el : result) {
                String title = el.getElementsByTagName("title").item(0).getTextContent();
                String hours = el.getElementsByTagName("hours").item(0).getTextContent();
                System.out.println("  - " + title + " (" + hours + " ч)");
            }
        }
    }


    // Добавить предмет
    static void add() throws Exception {
        System.out.print("Название: ");
        String title = sc.nextLine();
        System.out.print("Учитель: ");
        String teacher = sc.nextLine();
        System.out.print("Часы: ");
        String hours = sc.nextLine();
        System.out.print("Семестр: ");
        String semester = sc.nextLine();

        Element newLesson = doc.createElement("lesson");

        Element titleElem = doc.createElement("title");
        titleElem.setTextContent(title);
        newLesson.appendChild(titleElem);

        Element teacherElem = doc.createElement("teacher");
        teacherElem.setTextContent(teacher);
        newLesson.appendChild(teacherElem);

        Element hoursElem = doc.createElement("hours");
        hoursElem.setTextContent(hours);
        newLesson.appendChild(hoursElem);

        Element semElem = doc.createElement("semester");
        semElem.setTextContent(semester);
        newLesson.appendChild(semElem);

        root.appendChild(newLesson);
        save();
        System.out.println("Добавлено");
    }

    // Удалить предмет
    static void delete() throws Exception {
        System.out.print("Название предмета: ");
        String titleToDelete = sc.nextLine();

        NodeList nodeList = root.getElementsByTagName("lesson");
        boolean found = false;

        for (int i = 0; i < nodeList.getLength(); i++) {
            Element lesson = (Element) nodeList.item(i);
            String title = lesson.getElementsByTagName("title").item(0).getTextContent();

            if (title.equalsIgnoreCase(titleToDelete)) {

                Node parentNode = lesson.getParentNode();
                parentNode.removeChild(lesson);
                found = true;
                break;
            }
        }

        if (found) {
            save();
            System.out.println("Удалено");
        } else {
            System.out.println("Не найдено");
        }
    }

}