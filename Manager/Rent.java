package Manager;

import Entity.Vehicle;

public class Rent {
    private Customer customer;  // has-a relationship
    private Vehicle vehicle;    // has-a relationship
    private int hours;          

    // E constructor
    public Rent() {
    }

    // P constructor
    public Rent(Customer customer, Vehicle vehicle, int hours) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.hours = hours;
        this.vehicle.setIsRented(true); // mark vehicle as rented
    }

    // Setters
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    // Getters
    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getHours() {
        return hours;
    }

    // total bill
    public double calculateBill() {
        return hours * vehicle.getPrice();
    }

    public void showRentInfo() {
        System.out.println("==== Rent Information ====");
        customer.showInfo(); 
        vehicle.showInfo();
        System.out.println("Hours Rented : " + hours);
        System.out.println("Total Bill   : $" + calculateBill());
        System.out.println("==========================");
    }
}
