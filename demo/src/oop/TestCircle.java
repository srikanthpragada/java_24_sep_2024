package oop;

public class TestCircle {

	public static void main(String[] args) {
		Circle c; // object reference

		c = new Circle(); // Object
		c.setRadius(10); // calling method

		System.out.println(c.getArea());
	}
}
