package oop;

import java.util.Arrays;

abstract class Shape {
	private int x, y;

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public abstract int getArea();
}

class Square extends Shape {
	private int side;

	public Square(int x, int y, int side) {
		super(x, y);
		this.side = side;
	}

	@Override
	public int getArea() {
		return this.side * this.side;
	}
}

class Rect extends Shape {
	private int length, width;

	public Rect(int x, int y, int length, int width) {
		super(x, y);
		this.length = length;
		this.width = width;
	}

	@Override
	public int getArea() {
		return this.length * this.width;
	}
}

public class TestShape {
	public static void main(String[] args) {
		Shape s;

		s = new Square(10, 20, 15);
		System.out.println(s.getArea());

		s = new Rect(10, 10, 15, 20);
		System.out.println(s.getArea());
		
	}

}
