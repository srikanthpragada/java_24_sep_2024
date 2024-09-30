package basics;

public class FunDemo {

	public static void hello() {
		System.out.println("Hello!");
	}

	public static int add(int n1, int n2) {
		return n1 + n2;
	}

	public static void main(String[] args) {
		hello();
		System.out.println(add(10, 20));
	}

}
