package col;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;

public class Subset {

	public static void main(String[] args) throws IOException {
		var p1 = Path.of("c:\\classroom\\java24\\names3.txt");
		var p2 = Path.of("c:\\classroom\\java24\\names2.txt");

		// lines from second file
		var lines = new LinkedHashSet<String>(Files.readAllLines(p2));

		// check whether lines from first file are present in second
		for (var line : Files.readAllLines(p1)) {
			if (!lines.contains(line)) {
				System.out.println("Sorry! First file is not a subset of second file!");
				return;
			}
		}

		System.out.println("Yes. First file is a subset of second file!");
	}

}
