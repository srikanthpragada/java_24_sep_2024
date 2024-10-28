package io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		 var f = new File("c:\\classroom\\java24\\names.txt");
		 
		 System.out.println(f.exists());
		 System.out.println(f.isDirectory());
		 System.out.println(f.isAbsolute());
		 System.out.println(f.length());		 

	}

}

