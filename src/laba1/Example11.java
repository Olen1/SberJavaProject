package laba1;

import java.util.Scanner;

public class Example11 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Введите год Вашего рождения: ");
int yare = in.nextInt();
System.out.println("Введите текущий год: ");
int yare2 = in.nextInt();
int age = yare2 - yare;
System.out.println("Вам " + age );
in.close();
}
}