package io;

import java.io.FileReader;
import java.io.IOException;

public class ReadNames {

	public static void main(String[] args) throws IOException {

		// try with resources or ARM
		try (var fr = new FileReader("c:\\classroom\\java24\\names.txt")) {
			while (true) {
				int ch = fr.read();
				if (ch == -1) // EOF
					break;
				System.out.print((char) ch);
			}
		}
	}
}
