package laba6;

public class Example5 {
    public static void main(String[] args) throws InterruptedException {
        int[] array = {3, 8, 1, 9, 5, 2, 7, 6, 4, 10, 12, 9, 2, 11, 15, 9, 7, 4, 6, 20};

        // Узнаём количество ядер
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Ядер: " + cores);

        // Делим массив на части
        int chunkSize = (int) Math.ceil(array.length / (double) cores);

        // Массивы для хранения потоков и результатов
        Thread[] threads = new Thread[cores];
        int[] results = new int[cores];

        // Создаём и запускаем потоки
        for (int i = 0; i < cores; i++) {
            final int start = i * chunkSize;
            final int end = Math.min(start + chunkSize, array.length);
            final int threadIndex = i;

            threads[i] = new Thread(() -> {
                int max = Integer.MIN_VALUE;
                for (int j = start; j < end; j++) {
                    if (array[j] > max) {
                        max = array[j];
                    }
                }
                results[threadIndex] = max;
            });
            threads[i].start();
        }

        // Ждём завершения всех потоков
        for (int i = 0; i < cores; i++) {
            threads[i].join();
        }

        // Находим общий максимум
        int globalMax = Integer.MIN_VALUE;
        for (int i = 0; i < cores; i++) {
            if (results[i] > globalMax) {
                globalMax = results[i];
            }
        }

        System.out.println("Максимум: " + globalMax);
    }
}