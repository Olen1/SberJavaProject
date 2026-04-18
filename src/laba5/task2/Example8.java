package laba5.task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {


        List<String> spisok = Arrays.asList("Kомпьютер", "Траволта", "Пианино", "Гитара");


        System.out.println("Список строк: " + spisok);


        System.out.println("Длина > 7: " + filterByMinLength(spisok, 7));

    }

    public static List<String> filterByMinLength(List<String> list, int minLength) {
        return list.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }
}

