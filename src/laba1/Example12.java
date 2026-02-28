package laba1;

import java.util.Scanner;

public class Example12 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Введите Ваше имя: ");
String name = in.nextLine();
System.out.println("Введите Ваш возраст: ");
int age = in.nextInt();
System.out.println("Ваше имя " + name + " и Вам" + " "  + age );
in.close();
}
}