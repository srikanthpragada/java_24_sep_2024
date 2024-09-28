package basics;

import java.util.Scanner;

public class MonthDays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a month number :");
		int month = s.nextInt();

		int days = switch (month) {
		case 2 -> 28;
		case 4, 6, 9, 11 -> 30;
		default -> 31;
		};
		
		System.out.println("Days = " + days);
		s.close();
		
	}

}
