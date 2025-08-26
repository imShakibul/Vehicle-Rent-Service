package Entity;

public class Bike extends Vehicle {
    private int engineCC;

    // E constructor
    public Bike() {
        super();
    }

    //P constructor
    public Bike(String vehicleId, String vehicleName, String vehicleModel, double price, boolean isRented, int engineCC) {
        super(vehicleId, vehicleName, vehicleModel, price, isRented);
        this.engineCC = engineCC;
    }

    // Setter
    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    // Getter
    public int getEngineCC() {
        return engineCC;
    }

    @Override
    public void showInfo() {
        System.out.println("---- Bike Information ----");
        super.showInfo();
        System.out.println("EngineCC : " + engineCC + "cc");
        System.out.println("--------------------------");
    }
}
