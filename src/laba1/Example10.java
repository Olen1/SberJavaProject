package laba1;

import java.util.Scanner;

public class Example10{
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Введите навазние месяца ");
String month = in.nextLine();
System.out.println("Введите количество дней в указанном месяце");
int num = in.nextInt();
System.out.println(month + " содержит " + num + " дней.");
in.close();
}
}