package laba3.task7;


public class CreateFromHead {

    public static void main(String[] args) {
        System.out.println("Создание с головы\n");

        // Начинаем с пустого списка
        Node head = null;

        for (int i = 1; i <= 5; i++) {

            head = new Node(i, head);

            System.out.println("Добавили " + i + ", голова теперь: " + head);
        }

        // Выводим список
        System.out.println("\nИтоговый список:");
        printList(head);
    }


    public static void printList(Node head) {
        Node current = head;  // временная переменная для прохода

        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
            }
            current = current.next;  // переход к следующему
        }
        System.out.println(" → null");
    }
}