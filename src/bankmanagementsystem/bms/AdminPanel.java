package bankmanagementsystem.bms;

import java.util.*;

public class AdminPanel {
    private String adminUsername = "admin";
    private String adminPassword = "admin123";
    private CustomerManagement customerManagement;
    private AccountManagement accountManagement;
    private TransactionHistory transactionHistory;

    public AdminPanel(CustomerManagement cm, AccountManagement am, TransactionHistory th) {
        this.customerManagement = cm;
        this.accountManagement = am;
        this.transactionHistory = th;
    }

    public boolean loginAdmin(String username, String password) {
        return adminUsername.equals(username) && adminPassword.equals(password);
    }

    public List<?> viewAllCustomers() {
        return customerManagement.viewCustomerList();
    }

    public List<?> viewAllAccounts() {
        return accountManagement.viewAllAccounts();
    }

    public List<?> viewAllTransactions() {
        return transactionHistory.viewAllTransactions();
    }

    public void deleteCustomer(String customerId) {
        customerManagement.deleteCustomer(customerId);
    }
}
