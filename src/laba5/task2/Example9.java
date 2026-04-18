package laba5.task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example9 {


    public static void main(String [] args) {

        List<Integer> nums = Arrays.asList(10, 3, 20, 25, 30, 35);
        System.out.println("Список чисел: " + nums);


        System.out.println("Больше  5: " + filterGreaterThan(nums, 5));


    }

    public static List<Integer> filterGreaterThan(List<Integer> list, int threshold) {
        return list.stream()
                .filter(n -> n > threshold)
                .collect(Collectors.toList());
    }
}

