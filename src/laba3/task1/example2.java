package laba3.task1;

public class example2 {

    public static void main(String[] args) {
        printSequenceReverse(0); // Начинаем с 0
        System.out.println();
    }

    public static void printSequenceReverse(int x) {
        // Базовый случай
        if (x >= 20) return;

        printSequenceReverse(2 * x + 1);
        System.out.print(x + " ");
    }
}