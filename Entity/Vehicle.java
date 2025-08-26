package Entity;

public class Vehicle {
    private String vehicleId;
    private String vehicleName;
    private String vehicleModel;
    private double price;
    private boolean isRented;

    // E constructor
    public Vehicle() {
    }

    // P constructor
    public Vehicle(String vehicleId, String vehicleName, String vehicleModel, double price, boolean isRented) {
        setId(vehicleId);
        setName(vehicleName);
        setModel(vehicleModel);
        setPrice(price);
        setIsRented(isRented);
    }

    // Setters
    public void setId(String id) {
        this.vehicleId = id;
    }

    public void setName(String name) {
        this.vehicleName = name;
    }

    public void setModel(String model) {
        this.vehicleModel = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIsRented(boolean isRented) {
        this.isRented = isRented;
    }

    // Getters
    public String getId() {
        return vehicleId;
    }

    public String getName() {
        return vehicleName;
    }

    public String getModel() {
        return vehicleModel;
    }

    public double getPrice() {
        return price;
    }

    public boolean getIsRented() {
        return isRented;
    }

    public void showInfo() {
        System.out.println("ID        : " + vehicleId);
        System.out.println("Name      : " + vehicleName);
        System.out.println("Model     : " + vehicleModel);
        System.out.println("Price/hr  : " + price);
        System.out.println("Rented    : " + isRented);
        System.out.println("--------------------------");
    }

}
