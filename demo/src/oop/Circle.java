package oop;

public class Circle {
	// Instance variable
	private double radius;

	// constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}
}
