package col;

import java.util.Comparator;
import java.util.TreeSet;

class LengthCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		if (s1.length() == s2.length())
			return s1.compareTo(s2); // compare by chars when lengths are same 
		else
			return s1.length() - s2.length();
	}
}

public class SortStringByLength {

	public static void main(String[] args) {
		var names = new TreeSet<String>(new LengthCompare());
		names.add("Jason");
		names.add("Andy");
		names.add("Li");
		names.add("Richards");
		names.add("Anderson");

		for (var name : names)
			System.out.println(name);

	}

}
