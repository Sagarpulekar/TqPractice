package com.oops;

class Vehicles {
	public String getName() {
		return "Vehicle";
	}
}

class Car1 extends Vehicles {
	@Override
	public String getName() {
		return "Car";
	}
}

class Motorcycle extends Vehicles {
	@Override
	public String getName() {
		return "Motorcycle";
	}
}

public class VehicleDemo {
	public static void main(String[] args) {
		Vehicles car = new Car1();
		Vehicles motorcycle = new Motorcycle();

		System.out.println(car.getName());
		System.out.println(motorcycle.getName());
	}
}
