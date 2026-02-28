package timus.task_1001;
import java.util.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // 1. читаем все числа
        Scanner sc = new Scanner(System.in);
        List<Long> numbers = new ArrayList<>();

        while (sc.hasNextLong()) {            // пока в потоке есть целое
            numbers.add(sc.nextLong());
        }
        sc.close();

        // 2. выводим в обратном порядке
        StringBuilder out = new StringBuilder();

        for (int i = numbers.size() - 1; i >= 0; i--) {
            long a = numbers.get(i);
            double root = Math.sqrt((double) a);            // квадратный корень
            out.append(String.format(Locale.US, "%.4f", root))
                    .append('\n');
        }

        System.out.print(out.toString());
    }
}
