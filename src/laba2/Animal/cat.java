package laba2.Animal;


public class cat extends Animal {

    private String foodType;

    public cat(String name, int age, String foodType) {
        super(name, age);
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Мяу!");
    }

    public void rubAgainstLeg() {
        System.out.println(name + " терется о ногу.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Тип корма: " + foodType);
    }
}
