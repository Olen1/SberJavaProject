package laba3.task6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task6 {

    public static void main(String[] args) {
        int n = 10000;  // Количество человек


        long timeArrayList = testJosephusArrayList(n);
        System.out.println("ArrayList: время = " + timeArrayList + " мс");


        long timeLinkedList = testJosephusLinkedList(n);
        System.out.println("LinkedList: время = " + timeLinkedList + " мс");


        System.out.println();
        if (timeArrayList < timeLinkedList) {
            System.out.println("Быстрее: ArrayList");
        } else {
            System.out.println("Быстрее: LinkedList");
        }
    }

    public static long testJosephusArrayList(int n) {
        List<Integer> people = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        long start = System.currentTimeMillis();

        int index = 0;
        while (people.size() > 1) {

            index = (index + 1) % people.size();


            people.remove(index);


        }

        long end = System.currentTimeMillis();
        System.out.println("  Последний: " + people.get(0));

        return end - start;
    }


    public static long testJosephusLinkedList(int n) {
        List<Integer> people = new LinkedList<>();


        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        long start = System.currentTimeMillis();

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index);
        }

        long end = System.currentTimeMillis();
        System.out.println("  Последний: " + people.get(0));

        return end - start;
    }
}