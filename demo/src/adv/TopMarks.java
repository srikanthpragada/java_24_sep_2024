package adv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class TopMarks {

	public static void main(String[] args) throws IOException {
		 
		var p = Path.of("c:\\classroom\\java24\\marks.txt");
		
		var marks = 
		     Files.lines(p)
		     .mapToInt( v -> Integer.parseInt(v))
		     .sorted() 
		     .toArray();
		
		for(int i = marks.length - 1;  i >= marks.length - 5; i --)
			System.out.println(marks[i]);
		
		

		
		
		     
		    
		
		
	}

}
