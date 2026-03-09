package laba2.Animal;

public abstract class Animal {


    protected String name;
    protected int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void printInfo() {
        System.out.println("Имя: " + name + ", возраст: " + age);
    }


    public abstract void makeSound();
}
