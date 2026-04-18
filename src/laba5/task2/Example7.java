package laba5.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example7 {

    public static void main(String [] args) {

        List<Integer> nums = Arrays.asList(10, 3, 20, 25, 30, 35);
        System.out.println("Список чисел: " + nums);


        System.out.println("Делятся на 5: " + filterByDivisor(nums, 5));


    }

    public static List<Integer> filterByDivisor(List<Integer> list, int  div) {
        return list.stream()
                .filter(n -> n % div == 0)
                .collect(Collectors.toList());
    }
}

