package laba1.timus.task_1293;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите колчиество панелей: ");
        int n = in.nextInt();
        System.out.println("Введите длину в метрах: ");
        int a = in.nextInt();
        System.out.println("Введите ширину в метрах: ");
        int b = in.nextInt();
        //узнаем площаль одной панели с учетом, что у панели 2 стороны
            int s = 2*(a*b);
            //узнаем площадь всех панелей
            int s2 = s*n;
            //узнаем сколько нужно сульфида
            int sul = s2*1;
        System.out.println("Потребуется " + sul + " нанограмм");
        in.close();
    }
    }

