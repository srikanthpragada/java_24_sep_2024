package adv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class HigherThanAvg {

	public static void main(String[] args) throws IOException {
		 
		var p = Path.of("c:\\classroom\\java24\\marks.txt");
		
		var avgMarks = 
		     Files.lines(p)
		     .mapToInt( v -> Integer.parseInt(v))
		     .average().getAsDouble();
		     
	    System.out.println(avgMarks);
	    
		Files.lines(p)
			     .mapToInt( v -> Integer.parseInt(v))
			     .filter( v -> v > avgMarks)
			     .forEach(System.out::println);
	   
		

		
		
		     
		    
		
		
	}

}
