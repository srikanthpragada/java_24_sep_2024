package lib1;

import java.util.Arrays;
import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {
		String input = "java;c;javascript;python;typescript";
		String names [] = input.split(";");
		Arrays.sort(names);
		
		for (String name : names)
			System.out.println(name);
	}

}
