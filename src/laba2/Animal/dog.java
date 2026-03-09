package laba2.Animal;

public class dog extends Animal {

    private String breed;

    public dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Гав!");
    }

    public void fetchStick() {
        System.out.println(name + " приносит палку.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Порода: " + breed);
    }
}
