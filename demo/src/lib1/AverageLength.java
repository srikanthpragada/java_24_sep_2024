package lib1;

import java.util.Scanner;

public class AverageLength {

	public static void main(String[] args) {
		int totalLength = 0;
		Scanner s = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter name [end to stop]:");
			String name = s.nextLine();
			totalLength += name.length();
		}

		System.out.println(totalLength / 5);
		s.close();
	}

}
