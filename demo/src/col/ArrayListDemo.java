package col;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		 var names = new ArrayList<String>();
		 
		 names.add("Scott");
		 names.add("Harry");
		 names.add("Jack");
		 names.add(0, "Ben");
		 names.remove("Ben");
		 
		 System.out.println(names.indexOf("Scott"));
		 
		 names.sort(null);  // sort by default order - dictionary order
		 
		 for(String s : names)
			 System.out.println(s);

	}

}
