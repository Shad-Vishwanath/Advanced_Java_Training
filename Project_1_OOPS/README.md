# Hospital Management System

A simple **console-based Hospital Management System** developed in **Java** using **Object-Oriented Programming (OOP)** concepts.  
This project was created for training class purposes to demonstrate the practical use of core OOP principles in Java.

---

## 📌 Project Overview

The Hospital Management System helps manage basic hospital operations such as:

- Adding doctors
- Adding patients
- Viewing doctor details
- Viewing patient details
- Booking appointments
- Viewing appointments
- Generating bills

This project is implemented as a **menu-driven console application** and does not use any database, making it ideal for understanding OOP concepts clearly.

---

## 🚀 Features

- Add new doctors
- Add new patients
- Display all doctors
- Display all patients
- Book appointments between doctors and patients
- View all booked appointments
- Generate patient bills based on doctor consultation fees

---

## 🛠️ Technologies Used

- **Java**
- **Object-Oriented Programming (OOP)**
- **ArrayList**
- **Scanner Class**

---

## 📚 OOP Concepts Used

### 1. Class and Object
Classes such as `Doctor`, `Patient`, `Appointment`, `Hospital`, and `Person` are used to create objects and manage the system.

### 2. Inheritance
`Doctor` and `Patient` inherit common properties from the abstract class `Person`.

### 3. Encapsulation
All class attributes are declared as `private` and accessed using getter methods.

### 4. Abstraction
The `Person` class is defined as an abstract class to represent common details shared by doctors and patients.

### 5. Polymorphism
The `displayInfo()` method is overridden in both `Doctor` and `Patient` classes.

---

## 📂 Project Structure

```text
HospitalManagementSystem
│── Person.java
│── Doctor.java
│── Patient.java
│── Appointment.java
│── Hospital.java
│── Main.java
