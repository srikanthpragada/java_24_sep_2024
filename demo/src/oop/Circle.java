package oop;

public class Circle {
	// Instance variable
	private double radius;

	// Methods
	public void setRadius(double r) {
		radius = r;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}
}
