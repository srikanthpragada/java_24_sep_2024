package col;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;

public class Union {

	public static void main(String[] args) throws IOException {
		var p1 = Path.of("c:\\classroom\\java24\\names.txt");
		var p2 = Path.of("c:\\classroom\\java24\\names2.txt");

		var lines = new LinkedHashSet<String>(Files.readAllLines(p1));

		for (var line : Files.readAllLines(p2)) {
			if (!lines.contains(line))
				lines.add(line);
		}

		for (var line : lines)
			System.out.println(line);
	}

}
