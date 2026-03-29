package laba3.task8;

import java.util.Scanner;

public class LinkedList {

    private Node head;
    private Scanner scanner;


    public LinkedList() {

        this.head = null;
        this.scanner = new Scanner(System.in);

    }

    public void createHead() {
        System.out.println("Введите количество элементов: ");
        int n = scanner.nextInt();

        head = null;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент: ");
            int value = scanner.nextInt();
            head = new Node(value, head);
        }
    }

    public void createTail() {
        System.out.println("Введите количество элементов: ");
        int n = scanner.nextInt();

        head = null;

        Node tail = null;

        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент: ");
            int value = scanner.nextInt();
            Node newNode = new Node(value, null);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append("-");
            }

            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }


    public void addFirst(int value) {
        head = new Node(value, head);
    }

    public void addLast(int value) {
        Node newNode = new Node(value, null);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }


    public void insert(int position, int value) {

        if (position == 0) {
            addFirst(value);
            return;
        }

        Node newNode = new Node(value, null);
        Node current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        newNode.next = current.next;
        current.next = newNode;
    }


    public int removeFirst() {

        int value = head.value;
        head = head.next;
        return value;
    }

    public int removeLast() {

        if (head.next == null) {
            // Если только один элемент
            int value = head.value;
            head = null;
            return value;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        int value = current.next.value;
        current.next = null;
        return value;
    }

    public int remove(int position) {

        if (position == 0) {

            return removeFirst();
        }

        Node current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current == null || current.next == null) {
            System.out.println("Ошибка: позиция вне диапазона");
            return -1;
        }

        int value = current.next.value;
        current.next = current.next.next;
        return value;
    }

    public void createHeadRec(int n, int current) {
        // Базовый случай: ввели все элементы
        if (current >= n) {
            return;
        }

        System.out.print("Введите элемент " + (current + 1) + ": ");
        int value = scanner.nextInt();

        head = new Node(value, head);

        createHeadRec(n, current + 1);
    }


    private Node createTailRecHelper(int n, int current) {
        if (current >= n) {
            return null;
        }

        System.out.print("Введите элемент " + (current + 1) + ": ");
        int value = scanner.nextInt();

        Node node = new Node(value, null);
        node.next = createTailRecHelper(n, current + 1);

        return node;
    }


    public void createTailRec(int n) {
        head = createTailRecHelper(n, 0);
    }


    private String toStringRecHelper(Node node) {
        if (node == null) {
            return "null";
        }

        return node.value + " → " + toStringRecHelper(node.next);
    }

    public String toStringRec() {
        return toStringRecHelper(head);
    }
}