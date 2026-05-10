package laba7.task8;

import java.io.*;

public class task8 {

    static class Book implements Serializable {


        private String title;
        private String author;
        private int year;
        private double price;

        public Book(String title, String author, int year, double price) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.price = price;
        }

        public void display() {
            System.out.println("Название: " + title);
            System.out.println("Автор: " + author);
            System.out.println("Год издания: " + year);
            System.out.println("Цена: " + price + " руб.");
        }
    }
}
