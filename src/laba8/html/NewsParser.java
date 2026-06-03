package laba8.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class NewsParser {
    public static void main(String[] args) {
        try {
            // Подключаемся к сайту
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();


            // Упрощённый способ: ищем все элементы с классом blocktitle (темы новостей)
            Elements titles = doc.getElementsByClass("blocktitle");
            Elements dates = doc.getElementsByClass("blockdate");

            // Проверяем, что нашли данные
            if (titles.isEmpty()) {
                System.out.println("Не удалось найти новости. Возможно, сайт изменился или недоступен.");
            }

            // Выводим последние 10 новостей
            int count = Math.min(10, Math.min(titles.size(), dates.size()));
            System.out.println("Последние " + count + " новостей:\n" + "=".repeat(50));

            for (int i = 0; i < count; i++) {
                System.out.println("Тема: " + titles.get(i).text());
                System.out.println("Дата: " + dates.get(i).text());
                System.out.println("-".repeat(30));
            }

        } catch (IOException e) {
            System.out.println("Ошибка подключения: " + e.getMessage());
        }
    }
}