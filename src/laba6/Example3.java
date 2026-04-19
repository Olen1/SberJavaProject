package laba6;

import java.time.LocalTime;

public class Example3 {

    public static final Object lock = new Object();

    private static int number = 1;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {

            synchronized (lock) {
            while (number < 10){
                    if (number % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
                }
        });

        Thread t2 = new Thread(() -> {

            synchronized (lock) {
                while (number < 10){
                    if (number % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        });

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();

    }
}
