package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadNames3 {

	public static void main(String[] args) throws IOException {
		Path p = Path.of("c:\\classroom\\java24\\names.txt");
		System.out.println(Files.readString(p));
		
	}
}
