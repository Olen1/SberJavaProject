package laba2.Animal;

public class test {
    public static void main(String[] args) {

        //  Создаём объекты подклассов
        dog dog   = new dog("Барбос", 5, "Лабрадор");
        cat cat   = new cat("Барсик", 3, "Сухой");
        bird bird = new bird("Кеша", 2, true);
        bird bird1 = new bird("Гоша", 1, true);

        //  Вызываем общие методы (наследованные от Animal)
        System.out.println("--- Общая информация ---");
        dog.printInfo();
        cat.printInfo();
        bird.printInfo();
        bird1.printInfo();

        System.out.println("\n--- Звуки животных ---");
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
        bird1.makeSound();

        //  Уникальные методы подклассов
        System.out.println("\n--- Уникальное поведение ---");
        dog.fetchStick();
        cat.rubAgainstLeg();
        bird.tryToFly();
        bird1.tryToFly();

        }
    }

