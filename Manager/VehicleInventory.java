package Manager;

import Entity.Vehicle;

public class VehicleInventory {
    private Vehicle[] vehicles = new Vehicle[100];
    private int vehicleCount = 0;                 

    // Add a vehicle
    public void addVehicle(Vehicle v) {
        vehicles[vehicleCount++] = v;
    }

    // Get vehicle by ID
    public Vehicle getVehicleById(String id) {
        for (int i = 0; i < vehicleCount; i++) {
            if (vehicles[i].getId().equals(id)) {
                return vehicles[i];
            }
        }
        return null;
    }

    // Show all vehicles
    public void showAllVehicles() {
        System.out.println("\n=== Vehicle Inventory ===");
        for (int i = 0; i < vehicleCount; i++) {
            vehicles[i].showInfo(); 
        }
    }

    // Get all vehicles
    public Vehicle[] getVehicles() {
        Vehicle[] currentVehicles = new Vehicle[vehicleCount];
        for (int i = 0; i < vehicleCount; i++) {
            currentVehicles[i] = vehicles[i];
        }
        return currentVehicles;
    }
}

