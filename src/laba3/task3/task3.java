package laba3.task3;

import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();
        System.out.println("Размер массива равен " + size);
        int[] nums = new int[size];

        System.out.println("\nВведите " + size + " элементов массива:");
        inputArray(nums,0, scanner);


        // Рекурсивный вывод элементов
        System.out.println("\nЭлементы массива (рекурсивный вывод):");
        printArray(nums, 0);
        System.out.println(); // перенос строки в конце

        scanner.close();


    }

    // Ввод массива рекурсивно
    public static void inputArray(int[] arr, int index, Scanner sc) {
        if (index >= arr.length) return;
        System.out.print("arr[" + index + "] = ");
        arr[index] = sc.nextInt();
        inputArray(arr, index + 1, sc);  // рекурсия
    }

    // Вывод массива рекурсивно
    public static void printArray(int[] arr, int index) {
        if (index >= arr.length) return;
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);  // рекурсия
    }
    }

