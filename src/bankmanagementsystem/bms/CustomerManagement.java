package bankmanagementsystem.bms;

import java.util.*;

public class CustomerManagement {
    private Map<String, Customer> customers = new HashMap<>();

    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    public void deleteCustomer(String customerId) {
        customers.remove(customerId);
    }

    public void updateCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    public List<Customer> viewCustomerList() {
        return new ArrayList<>(customers.values());
    }
}

class Customer {
    private String customerId;
    private String name;
    private String address;
    private String phone;
    private String email;
    private List<Account> accountList = new ArrayList<>();

    public Customer(String customerId, String name, String address, String phone, String email) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    // Getters and setters
    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public List<Account> getAccountList() { return accountList; }
    public void setAccountList(List<Account> accountList) { this.accountList = accountList; }
}
