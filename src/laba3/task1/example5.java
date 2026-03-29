package laba3.task1;

public class example5 {
    public static void main(String[] args) {
        int fibResult = fibonacciWithTrace(5, 0);
        System.out.println("Итоговое значение Fib(5) = " + fibResult);
    }

    public static int fibonacciWithTrace(int n, int depth) {

        for (int i = 0; i < depth; i++) System.out.print("  ");
        System.out.println("fib(" + n + ")");

        if (n == 0) return 0;
        if (n == 1) return 1;

        int left = fibonacciWithTrace(n - 1, depth + 1);
        int right = fibonacciWithTrace(n - 2, depth + 1);

        return left + right;
    }
}
