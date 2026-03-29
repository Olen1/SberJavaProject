package laba3.task8;


public class tast {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Ввод с головы (цикл)
        System.out.println("Ввод с головы (цикл):");
        list.createHead();
        System.out.println("Список: " + list.toString());
        System.out.println();

        //  Добавление в начало
        System.out.println(" Добавление в начало (addFirst(100)):");
        list.addFirst(100);
        System.out.println("Список: " + list.toString());
        System.out.println();

        //  Добавление в конец
        System.out.println(" Добавление в конец (addLast(999)):");
        list.addLast(999);
        System.out.println("Список: " + list.toString());
        System.out.println();

        // Вставка в позицию
        System.out.println(" Вставка в позицию 2 (insert(2, 555)):");
        list.insert(2, 555);
        System.out.println("Список: " + list.toString());
        System.out.println();

        // Удаление с головы
        System.out.println("Удаление с головы (removeFirst()):");
        int removed = list.removeFirst();
        System.out.println("Удалено: " + removed);
        System.out.println("Список: " + list.toString());
        System.out.println();

        // Удаление с хвоста
        System.out.println(" Удаление с хвоста (removeLast()):");
        removed = list.removeLast();
        System.out.println("Удалено: " + removed);
        System.out.println("Список: " + list.toString());
        System.out.println();

        // Удаление по позиции
        System.out.println(" Удаление из позиции 1 (remove(1)):");
        removed = list.remove(1);
        System.out.println("Удалено: " + removed);
        System.out.println("Список: " + list.toString());
        System.out.println();

        //  Рекурсивный вывод
        System.out.println(" Рекурсивный вывод (toStringRec()):");
        System.out.println("Список: " + list.toStringRec());
        System.out.println();

        //  Ввод с хвоста (цикл)
        System.out.println(" Очистка и ввод с хвоста (цикл):");
        list.createTail();
        System.out.println("Список: " + list.toString());
        System.out.println();

        //Рекурсивный ввод с головы
        System.out.println(" Очистка и рекурсивный ввод с головы (3 элемента):");
        list.createHeadRec(3, 0);
        System.out.println("Список: " + list.toStringRec());
        System.out.println();

        //Рекурсивный ввод с хвоста
        System.out.println(" Очистка и рекурсивный ввод с хвоста (3 элемента):");
        list.createTailRec(3);
        System.out.println("Список: " + list.toStringRec());
        System.out.println();

    }
}