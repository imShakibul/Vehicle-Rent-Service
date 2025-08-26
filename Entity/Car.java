package Entity;

public class Car extends Vehicle {
    private int seats;
    private String fuelType;

    // E constructor
    public Car() {
        super();
    }

    // P constructor
    public Car(String vehicleId, String vehicleName, String vehicleModel, double price, boolean isRented, int seats, String fuelType) {
        super(vehicleId, vehicleName, vehicleModel, price, isRented); // call parent constructor
        this.seats = seats;
        this.fuelType = fuelType;
    }

    // Setters
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    // Getters
    public int getSeats() {
        return seats;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public void showInfo() {
        System.out.println("---- Car Information ----");
        super.showInfo();
        System.out.println("Seats    : " + seats);
        System.out.println("Fuel     : " + fuelType);
        System.out.println("-------------------------");
    }


}
