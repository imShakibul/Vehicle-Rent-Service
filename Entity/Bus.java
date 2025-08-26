package Entity;

public class Bus extends Vehicle {
    private String driverName;
    private int capacity;

    // E constructor
    public Bus() {
        super();
    }

    // P constructor
    public Bus(String vehicleId, String vehicleName, String vehicleModel, double price, boolean isRented, String driverName, int capacity) {
        super(vehicleId, vehicleName, vehicleModel, price, isRented);
        this.driverName = driverName;
        this.capacity = capacity;
    }

    // Setter & Getter for driverName
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public String getDriverName() {
        return driverName;
    }

    // Setter & Getter for capacity
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }

    // Override showInfo
    @Override
    public void showInfo() {
        System.out.println("---- Bus Information ----");
        super.showInfo();
        System.out.println("Driver    : " + driverName);
        System.out.println("Capacity  : " + capacity + " passengers");
        System.out.println("--------------------------");
    }
}
