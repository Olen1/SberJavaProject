package laba5.task1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example3 {

    public static void main(String [] args) {


        String string = "Напишите функцию, которая принимает на вход список строк и возвращает новый список, содержащий только те строки, которые начинаются с большой буквы.Напишите функцию, которая принимает на вход список строк и возвращает новый список, содержащий только те строки, которые начинаются с большой буквы.";

        List <String> strings = List.of(string.split(""));
        System.out.println("\n" + "Строка после сплитования " + "\n");
        for (String e: strings) {
            System.out.print(e);
        }

        List <String> stringsAfter = filterCapitalizedStrings(strings);

        System.out.println("\n" + "Строка после преобразования "  + "\n");

        for (String e: stringsAfter) {
            System.out.println(e);
        }
    }

    private static List<String> filterCapitalizedStrings(List<String> list) {
        return list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
