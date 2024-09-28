package basics;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		 
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int num = s.nextInt();
		
		for(int i = 1; i <= 10; i ++)
			System.out.printf("%2d * %2d = %4d\n",num, i, num * i);
		
		s.close();
	}

}
