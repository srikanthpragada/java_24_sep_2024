package oop2;

public class ExHandlingDemo {

	public static void main(String[] args) {
		String value = "0";

		try {
			int v = Integer.parseInt(value);
			int r = 100 / v;
			System.out.println(r);
		} catch (NumberFormatException ex) {
			System.out.println("Invalid Number!");
		} 
		finally {
			System.out.println("Finally!");
		}
		System.out.println("The End!");
	}

}
