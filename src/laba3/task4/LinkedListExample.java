package laba3.task4;

import laba3.task4.Node;

public class LinkedListExample {

    public static void main(String[] args) {

        System.out.println(" Создание с хвоста (последний элемент создаётся первым)");

        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);


        Node head1 = node1;

        // Вывод списка
        printList(head1);
        System.out.println();


        System.out.println("\nСоздание с головы (добавляем в начало)");

        Node head2 = null;
        head2 = addToHead(head2, 5);
        head2 = addToHead(head2, 4);
        head2 = addToHead(head2, 3);
        head2 = addToHead(head2, 2);
        head2 = addToHead(head2, 1);

        printList(head2);
        System.out.println();


    }

    public static void printList(Node head) {
        Node current = head;  // временная переменная для прохода по списку

        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(" → ");
            }
            current = current.next;  // переход к следующему узлу
        }
        System.out.println(" → null");
    }


    public static Node addToHead(Node head, int value) {
        return new Node(value, head);
    }

}