package laba6;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> System.out.println("поток1"));
        Thread t2 = new Thread(() -> System.out.println("поток2"));
        Thread t3 = new Thread(() -> System.out.println("поток3"));
        Thread t4 = new Thread(() -> System.out.println("поток4"));
        Thread t5 = new Thread(() -> System.out.println("поток5"));
        Thread t6 = new Thread(() -> System.out.println("поток6"));
        Thread t7 = new Thread(() -> System.out.println("поток7"));
        Thread t8 = new Thread(() -> System.out.println("поток8")); // Fixed: now started
        Thread t9 = new Thread(() -> System.out.println("поток9"));
        Thread t10 = new Thread(() -> System.out.println("поток10"));

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start(); // Now started!
        t9.start();
        t10.start();

        // Wait for all threads to finish
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        t9.join();
        t10.join();
    }
}