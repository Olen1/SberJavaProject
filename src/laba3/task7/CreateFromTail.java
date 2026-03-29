package laba3.task7;

public class CreateFromTail {

    public static void main(String[] args) {
        System.out.println("Создание с хвоста\n");
        Node node5 = new Node(5, null);      // последний: next = null
        Node node4 = new Node(4, node5);     // ссылается на node5
        Node node3 = new Node(3, node4);     // ссылается на node4
        Node node2 = new Node(2, node3);     // ссылается на node3
        Node node1 = new Node(1, node2);     // ссылается на node2


        Node head = node1;

        System.out.println("Итоговый список:");
        printList(head);

    }


    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
            }
            current = current.next;
        }
        System.out.println("  null");
    }

    }

