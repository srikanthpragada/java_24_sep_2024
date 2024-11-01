package col;

import java.util.ArrayList;

public class NonGenericDemo {

	public static void main(String[] args) {
		 var list = new ArrayList();
		 
		 list.add(10);     // AutoBoxing -> 10 -> new Integer(10)
		 list.add("Abc");
		 
		 String s = (String) list.get(0);
		 
		 var names = new ArrayList<String>();
		 names.add("Jack");
		 
		 String name = names.get(0);
		 
		 
     
		 
	}

}
