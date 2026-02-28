package laba1;

import java.util.Scanner;

public class Example13 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Введите Ваш возраст ");
int age = in.nextInt();
System.out.println("Введите текущий год: ");
int yare2 = in.nextInt();
int yare = yare2 - age;
System.out.println("Вы родились в " + yare );
in.close();
}
}