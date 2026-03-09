package laba2.Animal;


public class bird extends Animal {

    private boolean canFly;

    public bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Чик-чик!");
    }

    public void tryToFly() {
        if (canFly) {
            System.out.println(name + " поднимается в воздух!");
        } else {
            System.out.println(name + " не может летать.");
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Умеет летать: " + (canFly ? "да" : "нет"));
    }
}
