# 🚗 Vehicle Rent Service 🏍️🚌

A **Java-based Vehicle Rental Management System** that simulates renting and returning vehicles such as **Cars, Bikes, and Buses**. This project demonstrates the use of **Object-Oriented Programming (OOP)** principles in Java including **inheritance, polymorphism, abstraction, encapsulation, and association**.

---

## ✨ Features

* Add vehicles (Car, Bike, Bus) to the inventory
* Register and manage customers
* Show detailed information of vehicles & customers
* Rent vehicles to customers
* Return rented vehicles and update availability
* Track rental history (which customer rented which vehicle)
* Calculate rental cost based on duration

---

## 🛠 Topics Covered

### 🔹 Core Java Concepts

* Classes and Objects
* Constructors (default & parameterized)
* Access Modifiers (public, private, protected)
* Arrays & ArrayList usage
* Packages & Project Structure

### 🔹 OOP Principles

* **Encapsulation** → Private fields with getters & setters
* **Inheritance** → Car, Bike, Bus extend Vehicle class
* **Polymorphism** → Overriding `showInfo()` in subclasses
* **Abstraction** → Abstract `Vehicle` class with abstract methods
* **Composition/Association** → RentalService uses Inventory & Customer classes

### 🔹 Advanced Concepts

* Method Overloading & Overriding
* `super` keyword usage
* Managing multiple objects
* One-to-Many Relationship (Customer → Multiple Rentals)

### 🔹 Project Implementation

* **Start.java** → Main driver class
* **Vehicle.java** → Abstract base class
* **Car.java, Bike.java, Bus.java** → Specialized vehicle classes
* **Customer.java** → Stores customer details
* **VehicleInventory.java** → Manages available vehicles
* **CustomerList.java** → Manages registered customers
* **RentalService.java** → Handles renting & returning logic
* **Rent.java** → Tracks rental details (duration, cost, status)

---

## 📂 Project Structure

```
Vehicle_Rent_Service/
│── Entity/
│   ├── Vehicle.java
│   ├── Car.java
│   ├── Bike.java
│   ├── Bus.java
│
│── Manager/
│   ├── Customer.java
│   ├── Rent.java
│   ├── RentalService.java
│   ├── VehicleInventory.java
│   ├── CustomerList.java
│
│── Start.java   # Main class
```

---

## 🚀 How to Run

1. Clone the repository:

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

* ✅ Add database connectivity (MySQL/SQLite)
* ✅ Implement GUI (JavaFX or Swing)
* ✅ Add authentication system for customers
* ✅ Improve exception handling & edge case coverage
* ✅ Add advanced reporting (total revenue, most rented vehicle, etc.)

---

## 👨‍💻 Author

**Shakib Islam**
🎓 Student of CSE, AIUB
📧 Contact: [imshakibul@gmail.com](mailto:imshakibul@gmail.com)

---

🔗 *This project is created for learning and practicing **Object-Oriented Programming (OOP)** in Java.*
