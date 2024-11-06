package adv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StreamDemo2 {

	public static void main(String[] args) throws IOException {
		 
		var p = Path.of("c:\\classroom\\java24\\names.txt");
		
		Files.lines(p)
		     .filter( s -> s.length() > 3)
		     .sorted()
		     .forEach(System.out::println);
		
		
	}

}
