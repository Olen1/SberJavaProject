package laba3.task1;

public class example1 {

    public static void main(String[] args) {
        printSequence(0); // Начинаем с 0
        System.out.println();
    }

    public static void printSequence(int x) {
        //  если x >= 20, останавливаемся
        if (x >= 20) return;

        System.out.print(x + " ");
        printSequence(2 * x + 1);
    }
}
