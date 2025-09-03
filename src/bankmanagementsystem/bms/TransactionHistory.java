package bankmanagementsystem.bms;

import java.util.*;

public class TransactionHistory {
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactionHistory(String accountNumber) {
        List<Transaction> result = new ArrayList<>();
        for (Transaction t : transactions) {
            if (t.getAccountNumber().equals(accountNumber)) {
                result.add(t);
            }
        }
        return result;
    }

    public List<Transaction> viewAllTransactions() {
        return new ArrayList<>(transactions);
    }
}

class Transaction {
    private String transactionId;
    private String accountNumber;
    private String type;
    private double amount;
    private Date date;

    public Transaction(String transactionId, String accountNumber, String type, double amount, Date date) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    // Getters
    public String getTransactionId() { return transactionId; }
    public String getAccountNumber() { return accountNumber; }
    public String getType() { return type; }
    public double getAmount() { return amount; }
    public Date getDate() { return date; }
}
