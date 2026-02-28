package laba1;

import java.util.Scanner;

public class Example6 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Введи имя: ");
String name = in.nextLine();
System.out.println("Введи фмилию: ");
String name2 = in.nextLine();
System.out.println("Введи отчество: ");
String name3 = in.nextLine();
System.out.println("Привет! " + name2 + " " + name + " " + name3);
in.close();
}
}