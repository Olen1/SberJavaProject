package laba1;

import java.util.Scanner;

public class Example15 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Введите первое число: ");
int i = in.nextInt();
System.out.println("Введите второе число: ");
int i2 = in.nextInt();
System.out.println("Сумма чисел: " + (i+i2));
System.out.println("Разность чисел: " + (i-i2));
in.close();
}
}