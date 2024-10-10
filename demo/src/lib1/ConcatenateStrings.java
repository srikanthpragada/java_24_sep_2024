package lib1;

import java.util.Scanner;

public class ConcatenateStrings {

	public static void main(String[] args) {
		 
		 StringBuffer names = new StringBuffer("");
		 
		 Scanner s = new Scanner(System.in);
		 
		 while(true)
		 {
			 System.out.print("Enter name [end to stop]:");
			 String name = s.nextLine();
			 if(name.equals("end"))
				  break;
			 
			 names.append(name + " ");
		 }
		 
         System.out.println(names);		 
	}

}
