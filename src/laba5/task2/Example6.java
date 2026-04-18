package laba5.task2;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class Example6 {
    public static void main(String [] args) {
    List<String> words = Arrays.asList("Привет", "Мир", "ДЖава", "Крокодил", "Пока");
        System.out.println("Содержат 'дил': " + filterBySubstring(words, "дил"));


    }

   public static List<String> filterBySubstring(List<String> list, String substring) {
    return list.stream()
            .filter(s -> s.contains(substring))
            .collect(Collectors.toList());
    }
    }


