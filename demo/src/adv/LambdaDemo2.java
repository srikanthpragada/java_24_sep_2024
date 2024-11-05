package adv;

import java.util.Comparator;
import java.util.TreeSet;

//class LengthCompare implements Comparator<String> {
//	@Override
//	public int compare(String s1, String s2) {
//		return s1.length() - s2.length();
//	}
//}


public class LambdaDemo2 {

	public static void main(String[] args) {
//		Comparator<String> s = ((String s1, String s2) -> s1.length() - s2.length());
//		System.out.println(s);
		
		
		var names = new TreeSet<String>
		  ((s1, s2) -> s1.length() - s2.length());
		
		names.add("Jason");
		names.add("Andy");
		names.add("Li");
		names.add("Richards");

		for (var name : names)
			System.out.println(name);

	}


}
