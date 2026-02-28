package laba1;

import java.util.Scanner;

public class Example14 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Введите число: ");
int i = in.nextInt();
System.out.println(i-1 + " " + i + " " + (i+1) + " " + ((i-1)+i+(i+1))*((i-1)+i+(i+1)));
in.close();
}
}