package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames2 {

	public static void main(String[] args) throws IOException {
		String[] names = { "Java", "JavaScript", "Python", "SQL", "C" };

		// try with resources or ARM
		try (var fw = new FileWriter("c:\\classroom\\java24\\names.txt")) {
			for (var name : names) {
				fw.write(name + "\n");
			}
		}
	}
}
