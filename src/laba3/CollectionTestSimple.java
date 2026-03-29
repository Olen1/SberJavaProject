package laba3;

import java.util.*;

public class CollectionTestSimple {

    // Количество элементов для тестов
    private static final int SIZE = 6_000_000;
    private static final int TEST_OPS = 1000;

    public static void main(String[] args) {


        //  ДОБАВЛЕНИЕ
        System.out.println("ДОБАВЛЕНИЕ ");


        System.out.println("ArrayList:");
        System.out.println("  В начало:   " + testAddFirstArrayList());
        System.out.println("  В середину: " + testAddMiddleArrayList() );
        System.out.println("  В конец:    " + testAddLastArrayList() );
        System.out.println();

        System.out.println("LinkedHashMap:");
        System.out.println(" В начало:  нет такой операции");
        System.out.println(" В середину: нет такой операции");
        System.out.println("  В конец:    " + testAddLastLinkedHashMap());
        System.out.println();

        System.out.println("LinkedList:");
        System.out.println("  В начало:   " + testAddFirstLinkedList());
        System.out.println("  В середину: " + testAddMiddleLinkedList());
        System.out.println("  В конец:    " + testAddLastLinkedList());
        System.out.println();

        // УДАЛЕНИЕ
        System.out.println("УДАЛЕНИЕ");

        System.out.println("ArrayList:");
        System.out.println("  Из начала:   " + testRemoveFirstArrayList());
        System.out.println("  Из середины: " + testRemoveMiddleArrayList() );
        System.out.println("  Из конца:    " + testRemoveLastArrayList() );
        System.out.println();

        System.out.println("LinkedHashMap:");
        System.out.println("  Из начала:   " + testRemoveLinkedHashMap() );
        System.out.println("  Из середины: " + testRemoveLinkedHashMap() );
        System.out.println("  Из конца:    " + testRemoveLinkedHashMap() );
        System.out.println();

        System.out.println("LinkedList:");
        System.out.println("  Из начала:   " + testRemoveFirstLinkedList() );
        System.out.println("  Из середины: " + testRemoveMiddleLinkedList() );
        System.out.println("  Из конца:    " + testRemoveLastLinkedList());


        // 3. ПОЛУЧЕНИЕ ПО ИНДЕКСУ
        System.out.println("ПОЛУЧЕНИЕ ПО ИНДЕКСУ ");

        System.out.println("ArrayList:    " + testGetArrayList() );
        System.out.println("LinkedHashMap: нет доступа по индексу");
        System.out.println("LinkedList:   " + testGetLinkedList());

    }

    //  ДЛЯ ArrayList

    private static long testAddFirstArrayList() {
        List<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < TEST_OPS; i++) {
            list.add(0, i);  // Добавляем в начало
        }
        return System.currentTimeMillis() - start;
    }

    private static long testAddMiddleArrayList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) list.add(i);  // Заполняем
        long start = System.currentTimeMillis();
        int middle = SIZE / 2;
        for (int i = 0; i < TEST_OPS; i++) {
            list.add(middle, i);  // Вставляем в середину
        }
        return System.currentTimeMillis() - start;
    }

    private static long testAddLastArrayList() {
        List<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            list.add(i);  // Добавляем в конец
        }
        return System.currentTimeMillis() - start;
    }

    private static long testRemoveFirstArrayList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) list.add(i);
        long start = System.currentTimeMillis();
        for (int i = 0; i < TEST_OPS; i++) {
            list.remove(0);  // Удаляем из начала
        }
        return System.currentTimeMillis() - start;
    }

    private static long testRemoveMiddleArrayList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) list.add(i);
        long start = System.currentTimeMillis();
        for (int i = 0; i < TEST_OPS; i++) {
            list.remove(SIZE / 2);  // Удаляем из середины
        }
        return System.currentTimeMillis() - start;
    }

    private static long testRemoveLastArrayList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) list.add(i);
        long start = System.currentTimeMillis();
        for (int i = 0; i < TEST_OPS; i++) {
            list.remove(list.size() - 1);  // Удаляем из конца
        }
        return System.currentTimeMillis() - start;
    }

    // LinkedHashMap

    private static long testAddLastLinkedHashMap() {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            map.put(i, i);  // Добавляем пару ключ-значение
        }
        return System.currentTimeMillis() - start;
    }

    private static long testRemoveLinkedHashMap() {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < SIZE; i++) map.put(i, i);
        long start = System.currentTimeMillis();
        for (int i = 0; i < TEST_OPS; i++) {
            map.remove(i);  // Удаляем по ключу
        }
        return System.currentTimeMillis() - start;
    }

    // LinkedList

    private static long testAddFirstLinkedList() {
        List<Integer> list = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < TEST_OPS; i++) {
            list.add(0, i);  // Добавляем в начало
        }
        return System.currentTimeMillis() - start;
    }

    private static long testAddMiddleLinkedList() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < SIZE; i++) list.add(i);
        long start = System.currentTimeMillis();
        int middle = SIZE / 2;
        for (int i = 0; i < TEST_OPS; i++) {
            list.add(middle, i);  // Вставляем в середину
        }
        return System.currentTimeMillis() - start;
    }

    private static long testAddLastLinkedList() {
        List<Integer> list = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            list.add(i);  // Добавляем в конец
        }
        return System.currentTimeMillis() - start;
    }

    private static long testRemoveFirstLinkedList() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < SIZE; i++) list.add(i);
        long start = System.currentTimeMillis();
        for (int i = 0; i < TEST_OPS; i++) {
            list.remove(0);  // Удаляем из начала
        }
        return System.currentTimeMillis() - start;
    }

    private static long testRemoveMiddleLinkedList() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < SIZE; i++) list.add(i);
        long start = System.currentTimeMillis();
        for (int i = 0; i < TEST_OPS; i++) {
            list.remove(SIZE / 2);  // Удаляем из середины
        }
        return System.currentTimeMillis() - start;
    }

    private static long testRemoveLastLinkedList() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < SIZE; i++) list.add(i);
        long start = System.currentTimeMillis();
        for (int i = 0; i < TEST_OPS; i++) {
            list.remove(list.size() - 1);  // Удаляем из конца
        }
        return System.currentTimeMillis() - start;
    }

    // ПОЛУЧЕНИЕ ПО ИНДЕКСУ

    private static long testGetArrayList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) list.add(i);
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            list.get(i);  // Получаем по индексу
        }
        return System.currentTimeMillis() - start;
    }

    private static long testGetLinkedList() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < SIZE; i++) list.add(i);
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            list.get(i);  // Получаем по индексу
        }
        return System.currentTimeMillis() - start;
    }
}