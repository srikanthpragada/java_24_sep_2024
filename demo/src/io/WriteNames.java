package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames {

	public static void main(String[] args) throws IOException {
		String[] names = { "Java", "JavaScript", "Python", "SQL", "C" };

		var fw = new FileWriter("c:\\classroom\\java24\\names.txt");

		for (var name : names) {
			fw.write(name + "\n");
		}

		fw.close();
	}
}
