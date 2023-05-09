package com.oops;

class Car implements Vehicle {
	public void start() {
		System.out.println("Starting car");
	}

	public void stop() {
		System.out.println("Stopping car");
	}

	public void accelerate() {
		System.out.println("Accelerating car");
	}

	public void brake() {
		System.out.println("Braking car");
	}
}

class Bike implements Vehicle {
	public void start() {
		System.out.println("Starting bike");
	}

	public void stop() {
		System.out.println("Stopping bike");
	}

	public void accelerate() {
		System.out.println("Accelerating bike");
	}

	public void brake() {
		System.out.println("Braking bike");
	}
}

class VehicleTest {
	public static void main(String[] args) {
		Vehicle car = new Car();
		car.start();
		car.accelerate();
		car.brake();
		car.stop();

		Vehicle bike = new Bike();
		bike.start();
		bike.accelerate();
		bike.brake();
		bike.stop();
	}
}
