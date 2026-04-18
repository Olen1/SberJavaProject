package laba5.task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {

        List<String> spisok = Arrays.asList("567", "Траволта", "Пи56757анино", "Гитара");


        System.out.println("Список строк: " + spisok);


        System.out.println("Только буквы: " + filterOnlyLetters(spisok));

    }


    public static List<String> filterOnlyLetters(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[a-zA-Zа-яА-Я]+"))  // только буквы
                .collect(Collectors.toList());
    }
}