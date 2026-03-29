package laba3.task1;

public class example4 {
    public static void main(String[] args) {

    int fact = factorial(5);
        System.out.println("Результат: " + fact);
        System.out.println();
}

public static int factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}
}