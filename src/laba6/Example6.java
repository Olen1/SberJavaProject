package laba6;

public class Example6 {

        public static void main(String[] args) throws InterruptedException {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

            // Узнаём количество ядер
            int cores = Runtime.getRuntime().availableProcessors();
            System.out.println("Ядер: " + cores);

            // Делим массив на части
            int chunkSize = (int) Math.ceil(array.length / (double) cores);

            // Массивы для потоков и результатов
            Thread[] threads = new Thread[cores];
            int[] sums = new int[cores];

            // Создаём и запускаем потоки
            for (int i = 0; i < cores; i++) {
                final int start = i * chunkSize;
                final int end = Math.min(start + chunkSize, array.length);
                final int threadIndex = i;

                threads[i] = new Thread(() -> {
                    int sum = 0;
                    for (int j = start; j < end; j++) {
                        sum += array[j];
                    }
                    sums[threadIndex] = sum;
                });
                threads[i].start();
            }

            // Ждём завершения всех потоков
            for (int i = 0; i < cores; i++) {
                threads[i].join();
            }

            // Складываем все суммы
            int totalSum = 0;
            for (int i = 0; i < cores; i++) {
                totalSum += sums[i];
            }

            System.out.println("Общая сумма: " + totalSum);
        }
    }



