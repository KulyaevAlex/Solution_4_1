package org.example;

public class AccountInfo {

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("23512348", "Иван Иванов", 4500.00);
        BankAccount bankAccount2 = new BankAccount("23512349", "Котова Ольга", 15000.00);
        BankAccount bankAccount3 = new BankAccount("23512350", "Жуков Денис", 50000.00);

        bankAccount1.deposit(500);
        bankAccount2.withdraw(100);
        bankAccount3.deposit(200);
        bankAccount1.printStatement();
        bankAccount2.printStatement();
        bankAccount3.printStatement();
        bankAccount1.withdraw(5100);
        System.out.println();
        System.out.println("Баланс счета № " + bankAccount3.getAccountNumber() + " клиента: " + bankAccount3.getClient() + " составляет: " + bankAccount3.getBalance());
        System.out.println("Было создано счетов: " + BankAccount.getTotalAccounts());
    }
}
