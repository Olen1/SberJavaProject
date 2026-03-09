package laba2.bank;

public class SimpleAccount implements BankAccount {

    // Поля (данные счёта)
    private String owner;      // владелец
    private double balance;    // баланс

    // Конструктор (создание счёта)
    public SimpleAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    // Метод: положить деньги
    @Override
    public void deposit(double amount) {
            balance = balance + amount;
    }

    // Метод: снять деньги
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Снято: " + amount + " ₽");
        } else if (amount > balance) {
            System.out.println("Ошибка: недостаточно денег!");
        } else {
            System.out.println("Ошибка: сумма должна быть больше 0!");
        }
    }

    // Метод: узнать баланс
    @Override
    public double getBalance() {
        return balance;
    }

    // Метод: вывести информацию о счёте
    public void printInfo() {
        System.out.println("Владелец: " + owner);
        System.out.println("Баланс: " + balance + " ₽");
        System.out.println();
    }
}