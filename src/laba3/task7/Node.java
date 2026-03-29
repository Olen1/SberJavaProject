package laba3.task7;

public class Node {
    public int value;   // данные: число
    public Node next;   // ссылка на следующий узел

    // Конструктор: создаём узел с значением и ссылкой
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

}
