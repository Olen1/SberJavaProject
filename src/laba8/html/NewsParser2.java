package laba8.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NewsParser2 {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://news.ycombinator.com/")
                    .get();

            // Новости в тегах <tr class="athing">
            Elements news = doc.select("tr.athing");

            System.out.println("Hacker News — последние " + Math.min(10, news.size()) + " новостей:\n");

            for (int i = 0; i < Math.min(10, news.size()); i++) {
                Element item = news.get(i);

                String title = item.selectFirst(".titleline > a").text();
                String link = item.selectFirst(".titleline > a").attr("href");
                String id = item.attr("id");
                String score = doc.select("#score_" + id).first() != null
                        ? doc.select("#score_" + id).first().text() : "N/A";

                System.out.printf("%d. [%s] %s%n", i+1, score, title);
                System.out.println(" " + (link.startsWith("http") ? link : "https://news.ycombinator.com/" + link));
                System.out.println(" " + "-".repeat(60));
            }

        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}