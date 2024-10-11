package lib1;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		String input = "10,40, 50,33, 44,55";
		String nums [] = input.split(",");
		
		int total = 0; 
		for (String num : nums)
			 total += Integer.parseInt(num.strip());  // String to int
		
		System.out.println(total);
	}

}
