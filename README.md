# Vehicle Rent Service 🚗🏍️🚌

This project is a **Java-based Vehicle Rental Management System** that simulates renting and returning vehicles such as Cars, Bikes, and Buses. It demonstrates the use of **Object-Oriented Programming (OOP) concepts** in Java, including inheritance, polymorphism, abstraction, encapsulation, and association.

---

## ✨ Features

* Add vehicles (Car, Bike, Bus) to the inventory
* Register customers
* Show vehicle and customer information
* Rent vehicles by customers
* Return rented vehicles
* Show updated inventory and customer details
* Track which customer rented which vehicle
* Calculate rental cost based on hours

---

## 🛠 Topics Covered in This Project

This project helps practice and apply the following concepts:

### 🔹 Core Java Concepts

* Classes and Objects
* Constructors (default & parameterized)
* Access Modifiers (public, private, protected)
* Arrays & ArrayList usage
* Packages & Project Structure

### 🔹 OOP Principles

* **Encapsulation** → Private fields with getters & setters
* **Inheritance** → Car, Bike, Bus extend Vehicle class
* **Polymorphism** → Method overriding (`showInfo()` in subclasses)
* **Abstraction** → Abstract `Vehicle` class with abstract methods
* **Composition/Association** → RentalService uses Inventory and Customers

### 🔹 Advanced Concepts

* Method Overloading & Overriding
* Super keyword usage
* Handling multiple objects
* Relationships: One-to-Many (Customer → Multiple Vehicles)

### 🔹 Project Implementation Topics

* **Start.java** → main driver class
* **Vehicle.java** → abstract base class
* **Car.java, Bike.java, Bus.java** → specialized vehicle classes
* **Customer.java** → stores customer details
* **VehicleInventory.java** → manages available vehicles
* **CustomerList.java** → manages registered customers
* **RentalService.java** → handles renting & returning logic

---


Vehicle_Rent_Service/
│── Entity/
│ ├── Vehicle.java
│ ├── Car.java
│ ├── Bike.java
│ ├── Bus.java
│
│── Manager/
│ ├── Customer.java
│ ├── Rent.java
│ ├── RentalService.java
│ ├── VehicleInventory.java
│ ├── CustomerList.java
│
│── Start.java # Main class



## 🚀 How to Run

1. Clone this repository:

   ```bash
   git clone https://github.com/your-username/Vehicle-Rent-Service.git
   ```

2. Navigate into the folder:

   ```bash
   cd Vehicle-Rent-Service
   ```

3. Compile the code:

   ```bash
   javac Start.java
   ```

4. Run the program:

   ```bash
   java Start
   ```

---

## 📌 Future Improvements

* Add database connectivity (MySQL/SQLite)
* Implement GUI (JavaFX or Swing)
* Add authentication system for customers
* Handle edge cases with exception handling

---

## 👨‍💻 Author

**Shakib Islam**
Student of CSE, AIUB
📧 Contact: [imshakibul@gmail.com](mailto:imshakibul@gmail.com)
