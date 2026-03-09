package laba2.bank;

    public interface BankAccount {

        // Положить деньги на счёт
        void deposit(double amount);

        // Снять деньги со счёта
        void withdraw(double amount);

        // Узнать баланс
        double getBalance();
    }

