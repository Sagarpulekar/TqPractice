package com.oops;

public class Employee {
	private String name;
	private int age;
	private float salary;

	public Employee(String name, int age, float salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void printDisplay() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Salary: " + this.salary);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("sagar", 28, 45000);
		Employee e2 = new Employee("pritish", 24, 50000);

	}
}
