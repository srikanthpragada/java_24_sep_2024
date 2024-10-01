package basics;

public class AverageOfNumbers {

	public static int average(int... nums) {
		int total = 0;

		for (int n : nums)
			total += n;

		return total / nums.length;
	}

	public static void main(String[] args) {

		System.out.println(average(10, 10, 5));
	}

}
