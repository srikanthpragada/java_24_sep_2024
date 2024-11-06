package adv;

import java.util.Arrays;

public class StreamDemo1 {

	public static void main(String[] args) {
		int a[] = { 10, 80, 22, 33, 44, 55, 22 };

		var s = Arrays.stream(a);

		s.filter(v -> v % 2 == 0) // intermediate
				.sorted() // intermediate
				//.forEach(v -> System.out.println(v)); // terminal
				.forEach(System.out::println);
	}

}
