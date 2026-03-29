package laba3.task4;


    /**
     * Класс, представляющий узел односвязного списка
     */
    public class Node {
        public int value;      // информационное поле: значение узла
        public Node next;      // адресное поле: ссылка на следующий узел

        // Конструктор с параметрами
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        // Конструктор без параметров (для удобства)
        public Node() {
            this.value = 0;
            this.next = null;
        }

    }

