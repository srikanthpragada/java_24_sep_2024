package col;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SortNames {

	public static void main(String[] args) throws IOException {
		var path = Path.of("c:\\classroom\\java24\\names.txt");
		var lines = Files.readAllLines(path);
		
		lines.sort(null);
		
		for(var line : lines)
			System.out.println(line);

	}

}
