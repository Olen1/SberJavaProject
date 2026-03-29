package laba3.task1;

public class example3 {
    public static void main(String[] args) {
        printBeforeAfter(0);
        System.out.println();
    }

    public static void printBeforeAfter(int x) {
        if (x >= 20) return;

        System.out.println("Вход: x = " + x); // ДО вызова
        printBeforeAfter(2 * x + 1);          // Рекурсия
        System.out.println("Выход: x = " + x);
    }
}
