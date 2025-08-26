import Entity.Car;
import Entity.Bike;
import Entity.Bus;
import Manager.Customer;
import Manager.CustomerList;
import Manager.Rent;
import Manager.RentalService;
import Manager.VehicleInventory;

public class Start {
    public static void main(String[] args) {

        // 1. Create Vehicle Inventory

        VehicleInventory inventory = new VehicleInventory();
        inventory.addVehicle(new Car("C001", "Toyota", "Corolla", 10, false, 5, "Petrol"));
        inventory.addVehicle(new Bike("B001", "Honda", "CBR", 5, false, 150));
        inventory.addVehicle(new Bus("BUS001", "Volvo", "X100", 20, false, "Shakibul Islam", 40));

        System.out.println("\n--- Vehicle Inventory After Adding Vehicles ---");
        inventory.showAllVehicles();

        // 2. Create Customer List

        CustomerList customers = new CustomerList();
        customers.addCustomer(new Customer("CU001", "Shakib"));
        customers.addCustomer(new Customer("CU002", "Sumon"));

        System.out.println("\n--- Customer List After Adding Customers ---");
        customers.showAllCustomers();

        // 3. Create Rental Service

        RentalService rentalService = new RentalService(inventory, customers);

        // 4. Rent Vehicles

        System.out.println("\n--- Renting Vehicles ---");
        rentalService.rentVehicle("CU001", "C001", 3);  
        rentalService.rentVehicle("CU002", "B001", 2); 
        rentalService.rentVehicle("CU001", "BUS001", 5);

        // Attempt to rent already rented vehicle
        rentalService.rentVehicle("CU002", "C001", 1);   // should fail

        // 5. Show Updated Inventory

        System.out.println("\n--- Vehicle Inventory After Renting ---");
        inventory.showAllVehicles();

        // 6. Show Customers
        System.out.println("\n--- Customers ---");
        customers.showAllCustomers();

        // 7. Show All Rents
        System.out.println("\n--- All Rents ---");
        rentalService.showAllRents();
    }
}
