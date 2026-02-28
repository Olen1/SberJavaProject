package laba1;

import java.util.Scanner;

public class Example9 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Введите текущий день недели: ");
String day = in.nextLine();
System.out.println("Введите текущий месяц: ");
String month = in.nextLine();
System.out.println("Введите текущий номер дня в месяце");
int num = in.nextInt();
System.out.println("День недели: " + day);
System.out.println("Дата: " + num);
System.out.println("Месяц: " + month);
in.close();
}
}