
package laba8.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleNewsParser {

    private static final String URL = "https://news.ycombinator.com/";
    private static final String FILE = "news.txt";

    public static void main(String[] args) {
        Document doc = getDocument();

        if (doc != null) {
            saveNews(doc);
        } else {
            System.out.println("Не удалось загрузить страницу");
        }
    }

    // Подключение с повторными попытками
    static Document getDocument() {
        for (int i = 1; i <= 3; i++) {
            try {
                System.out.println("Попытка " + i + "...");
                return Jsoup.connect(URL).timeout(10000).get();
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                if (i == 3) return null;
                try { Thread.sleep(2000); } catch (InterruptedException ex) {}
            }
        }
        return null;
    }

    // Сохранение в файл
    static void saveNews(Document doc) {
        Elements news = doc.select("tr.athing");

        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE, true))) {

            writer.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + " ===");


            int count = 0;

            for (int i = 0; i < Math.min(10, news.size()); i++) {
                Element item = news.get(i);
                String title = item.selectFirst(".titleline > a").text();
                String link = item.selectFirst(".titleline > a").attr("href");
                String id = item.attr("id");
                String score = doc.select("#score_" + id).first() != null ?
                        doc.select("#score_" + id).first().text() : "N/A";

                count++;
                String line = count + ". [" + score + "] " + title;

                System.out.println(line);
                writer.println(line);
            }

            writer.println("Всего: " + count);
            System.out.println("Сохранено в файл: " + FILE);

        } catch (Exception e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }
    }
}