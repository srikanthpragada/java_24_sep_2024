package lib1;

import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		 LocalDate d1 = LocalDate.now();
		 System.out.println(d1);
		 System.out.println(d1.plusDays(20));
	}

}

