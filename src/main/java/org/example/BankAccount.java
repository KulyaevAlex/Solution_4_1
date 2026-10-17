package org.example;

public class BankAccount {
    /**
     * Счетчик созданных счетов
     */
    static int totalAccounts = 0;

    private String accountNumber;
    private String client;
    private double balance;

    public BankAccount(String accountNumber, String client, double balance) {
        totalAccounts++;
        this.accountNumber = accountNumber;
        this.client = client;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод увеличивает баланс счета
     *
     * @param amount - Входящая сумма
     */
    public void deposit(double amount) {
        this.balance += amount;
    }

    /**
     * Метод уменьшает баланс счета
     *
     * @param amount - Сумма, которую нужно вычесть из баланса
     */
    public void withdraw(double amount) {
        if ((this.balance <= 0) || (amount > this.balance)) {
            throw new IllegalArgumentException("Недостаточно средств");
        }
        this.balance -= amount;
    }

    /**
     * Метод выводит информацию о счете
     */
    public void printStatement() {
        System.out.println("Номер счета: " + this.accountNumber + " Клиент: " + this.client + " Баланс: " + this.balance);
    }
}
