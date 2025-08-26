package Manager;

public class CustomerList {
    private Customer[] customers = new Customer[100];
    private int customerCount = 0;                     

    // Add a customer
    public void addCustomer(Customer c) {
        // customerCount++;
        customers[customerCount++] = c;
    }

    // Get customer by ID
    public Customer getCustomerById(String id) {
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getCustomerId().equals(id)) {
                return customers[i];
            }
        }
        return null;
    }

    // Show all customers
    public void showAllCustomers() {
        System.out.println("\n=== Customer List ===");
        for (int i = 0; i < customerCount; i++) {
            System.out.println("Customer ID   : " + customers[i].getCustomerId());
            System.out.println("Customer Name : " + customers[i].getCustomerName());
            System.out.println("--------------------------");
        }
    }
}
