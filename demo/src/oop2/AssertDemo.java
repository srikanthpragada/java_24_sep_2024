package oop2;

public class AssertDemo {

	public static boolean isEven(int n) {
		return  n % 2 == 0; 
	}
	public static void main(String[] args) {
		assert  isEven(10) == true : "isEven() returned false for 10";
		assert  isEven(11) == false : "isEven() returned true for 11";
	}
}
