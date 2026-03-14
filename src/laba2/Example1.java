
//1. Напишите программу, в которой создается массив и заполняется случайными числами.
// Массив отображается в консольном окне. В этом массиве необходимо определить элемент с минимальным значением.
// В частности, программа должна вывести значение элемента с минимальным значением и индекс этого элемента.
// Если элементов с минимальным значением несколько, должны быть выведены индексы всех этих элементов.
//

package laba2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();
        System.out.println("Размер массива равен " + size);
        int[] nums = new int[size];
        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }

        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("Элемент массива c минимальным значением " + min);


        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min) {
                count++;
            }
        }

        int[] minIndexes = new int[count];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min) {
                minIndexes[index] = i;
                index++;
            }
        }
        System.out.println("Индексы минимсвльных элементов: ");
        for (int i = 0; i < minIndexes.length; i++) {
            System.out.print(minIndexes[i]);
            if (i < minIndexes.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}


