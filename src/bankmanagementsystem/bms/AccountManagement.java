package bankmanagementsystem.bms;

import java.util.*;

public class AccountManagement {
    private Map<String, Account> accounts = new HashMap<>();

    public void openAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public void closeAccount(String accountNumber) {
        accounts.remove(accountNumber);
    }

    public void deposit(String accountNumber, double amount) {
        Account acc = accounts.get(accountNumber);
        if (acc != null) acc.deposit(amount);
    }

    public void withdraw(String accountNumber, double amount) {
        Account acc = accounts.get(accountNumber);
        if (acc != null) acc.withdraw(amount);
    }

    public double checkBalance(String accountNumber) {
        Account acc = accounts.get(accountNumber);
        return acc != null ? acc.getBalance() : 0.0;
    }

    public List<Account> viewAllAccounts() {
        return new ArrayList<>(accounts.values());
    }
}

class Account {
    private String accountNumber;
    private String accountType;
    private double balance;
    private String ownerId;

    public Account(String accountNumber, String accountType, double balance, String ownerId) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.ownerId = ownerId;
    }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }

    // Getters and setters
    public String getAccountNumber() { return accountNumber; }
    public String getAccountType() { return accountType; }
    public double getBalance() { return balance; }
    public String getOwnerId() { return ownerId; }
}
