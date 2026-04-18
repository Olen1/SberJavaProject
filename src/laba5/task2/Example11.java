package laba5.task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example11 {

    public static void main(String[] args) {

        List<Integer> spisok = Arrays.asList(1,2,3,4,5,6,7,8,9);


        System.out.println("Список чисел: " + spisok);


        System.out.println("Только буквы: " + filterLessThan(spisok, 2));

    }


    public static List<Integer> filterLessThan(List<Integer> list, int threshold) {
        return list.stream()
                .filter(n -> n < threshold)
                .collect(Collectors.toList());
    }

}

