package com.bptn_Week2;

public class Vehicle {
	
	int speed;
	
	public Vehicle(int speed) {
		this.speed = speed;
		}
	public void displaySpeed() {
	System.out.println("The vehicle speed is: " + speed+ "km/h." );
	}
	
	}
	// child class, sub class, derived class
	class Car extends Vehicle {
		String model;
		
		public Car(int speed, String model) {
			super(speed);
			this.model = model;
		}
		public void display(Car speed) {
			System.out.println("The model of the car is: " +model);
			super.displaySpeed();
		}
}
	public class main{
		public static void main(String[] args) {
			Car car = new Car(150, "Kia");
			car.displaySpeed();
				
		}
	}
