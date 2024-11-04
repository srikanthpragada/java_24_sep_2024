package adv;

import java.util.regex.Pattern;

public class ReDemo {

	public static void main(String[] args) {
		 var p  = Pattern.compile("\\d");
		 
		 var m = p.matcher("Java 23");
		 
		 m.find();
		 System.out.println(m.group());

	}

}
