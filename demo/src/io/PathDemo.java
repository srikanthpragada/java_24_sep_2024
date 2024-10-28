package io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	public static void main(String[] args) {
		 Path p = Paths.get("c:\\classroom\\java24");
		 
		 System.out.println(p.getClass());

	}

}
