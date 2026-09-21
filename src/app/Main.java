package app;

import bank.Account;

public class Main {
    public static void main(String[] args) {
        Account alice = new Account("A1001", "Alice Johnson", 1500.00);
        Account bob = new Account("A1002", "Bob Smith", 2200.00);
        Account charlie = new Account("A1003", "Charlie Brown", 900.00);

        System.out.println("Banking application demo");
        System.out.println();

        alice.deposit(300.50);
        alice.withdraw(200.00);
        printAccountDetails(alice);

        bob.withdraw(500.75);
        bob.deposit(125.25);
        printAccountDetails(bob);

        charlie.deposit(100.00);
        charlie.withdraw(1500.00);
        printAccountDetails(charlie);

        System.out.println();
        System.out.println("All account balances are shown above.");
    }

    private static void printAccountDetails(Account account) {
        System.out.printf("%s (%s) balance: $%.2f%n",
                account.getAccountHolder(),
                account.getAccountNumber(),
                account.checkBalance());
    }
}
