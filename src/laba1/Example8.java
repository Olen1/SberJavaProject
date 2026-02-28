package laba1;

import java.util.Scanner;

public class Example8 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Введите первое число: ");
int num = in.nextInt();
System.out.println("Введите второе число: ");
int num2 = in.nextInt();
System.out.println("Сумма: " + (num + num2));
in.close();
}
}