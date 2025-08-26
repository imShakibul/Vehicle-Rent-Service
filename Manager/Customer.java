package Manager;

public class Customer {
    private String customerId;
    private String customerName;

    // E constructor
    public Customer() {
    }

    // P constructor
    public Customer(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    // Setters
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Getters
    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    // Display customer info
    public void showInfo() {
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
    }
}

