package bank;

public class Account {
    private final String accountNumber;
    private final String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double initialBalance) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be empty.");
        }
        if (accountHolder == null || accountHolder.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder cannot be empty.");
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        validateAmount(amount);
        balance += amount;
        System.out.printf("Deposit successful: $%.2f added to %s.%n", amount, accountNumber);
    }

    public boolean withdraw(double amount) {
        validateAmount(amount);
        if (amount > balance) {
            System.out.printf("Withdrawal failed for %s: not enough balance to withdraw $%.2f.%n", accountNumber, amount);
            return false;
        }

        balance -= amount;
        System.out.printf("Withdrawal successful: $%.2f removed from %s.%n", amount, accountNumber);
        return true;
    }

    public double checkBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    private void validateAmount(double amount) {
        if (Double.isNaN(amount) || Double.isInfinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Transaction amount must be greater than zero.");
        }
    }
}
