package com.bptn.course.course_Week2;


public class Car {
    String color;
    String brand; 
    int price; 
    
    // Constructor with parameters
    public Car(String color, String brand, int price) {
        this.color = color; // Assign constructor argument to instance variables
        this.brand = brand;
        this.price = price;
    } 
    
    // Method to print car details
    public void printCarDetails() { 
        System.out.println(color + " " + brand + " " + price); 
    }
}
