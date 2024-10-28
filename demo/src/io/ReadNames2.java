package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadNames2 {

	public static void main(String[] args) throws IOException {

		// try with resources or ARM
		try (var fr = new FileReader("c:\\classroom\\java24\\names.txt"); var br = new BufferedReader(fr)) {
			while (true) {
				String line = br.readLine();
				if (line == null) // EOF
					break;
				System.out.println(line);
			}
		}
	}
}
