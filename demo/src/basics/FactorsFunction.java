package basics;

public class FactorsFunction {

	public static void factors(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		factors(124);
	}

}
