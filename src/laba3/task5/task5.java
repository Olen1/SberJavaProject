package laba3.task5;

import java.util.HashMap;
import java.util.Map;

public class task5 {

    public static void main(String[] args) {

        //  Создаём HashMap и заполняем 10 элементами
        Map<Integer, String> map = new HashMap<>();

        // Добавляем пары: ключ (число) → значение (строка)
        map.put(0, "крокодил");
        map.put(1, "банан");
        map.put(2, "вишня");
        map.put(3, "дата");
        map.put(4, "библиотека");
        map.put(5, "рыба");
        map.put(6, "груша");
        map.put(7, "домашка");
        map.put(8, "джава");
        map.put(9, "лимон");

        System.out.println("ВСЕ ЭЛЕМЕНТЫ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + " Значение: " + entry.getValue());
        }
        System.out.println();

        //  Найти строки, у которых ключ > 5
        System.out.println("Ключи больше 5");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {  // Проверяем ключ
                 System.out.println("Ключ " + entry.getKey() + ":" + entry.getValue());
            }
        }
        System.out.println();

        // Если ключ = 0, вывести значение
        System.out.println("Значение для ключа 0");
        if (map.containsKey(0)) {  // Проверяем, есть ли ключ 0
            String value = map.get(0);  // Получаем значение
            System.out.println("Значение: " + value);
        } else {
            System.out.println("Ключ 0 не найден");
        }
        System.out.println();

        //  Перемножить ключи, где длина строки > 5
        System.out.println("Произведение ключей");
        long product = 1;

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String text = entry.getValue();      // Берём строку
            int key = entry.getKey();            // Берём ключ
            int length = text.length();          // Считаем длину строки

            if (length > 5) {  // Если длина больше 5
                System.out.println("Строка \"" + text + "\" (длина=" + length + ") → ключ " + key + " участвует");
                product = product * key;
            }
        }

        System.out.println("\n Произведение = " + product);
    }
}