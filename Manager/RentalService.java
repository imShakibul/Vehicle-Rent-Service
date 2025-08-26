package Manager;

import Entity.Vehicle;

public class RentalService {
    private Rent[] rents = new Rent[100];
    private int rentCount = 0;

    private VehicleInventory inventory;    // link to V I
    private CustomerList customerList;     // link to C L

    // Constructor
    public RentalService(VehicleInventory inventory, CustomerList customerList) {
        this.inventory = inventory;
        this.customerList = customerList;
    }

    // Rent a vehicle
    public void rentVehicle(String customerId, String vehicleId, int hours) {
        Customer c = customerList.getCustomerById(customerId);
        Vehicle v = inventory.getVehicleById(vehicleId);

        if (c != null && v != null && !v.getIsRented()) {
            Rent rent = new Rent(c, v, hours);
            rents[rentCount++] = rent;
            v.setIsRented(true);
            System.out.println("✅ Vehicle rented successfully!");
        } else {
            System.out.println("❌ Renting failed: Invalid customer/vehicle or vehicle already rented.");
        }
    }

    // all rents
    public void showAllRents() {
        System.out.println("\n=== All Rents ===");
        if (rentCount == 0) {
            System.out.println("No vehicles rented yet.");
        } else {
            for (int i = 0; i < rentCount; i++) {
                rents[i].showRentInfo();
            }
        }
    }
}
