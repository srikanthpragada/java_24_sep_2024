package col;

import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		 var marks = new TreeMap<String, Integer>();
		 
		 marks.put("Joe", 90);
		 marks.put("Andy", 80);
		 marks.put("Andy", 90);
		 marks.put("Mark", 85);
		 
		 for(var name : marks.keySet())
			 System.out.println(name + " - " + marks.get(name));
		 
		 

	}

}
