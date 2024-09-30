package basics;

public class VaryingArgsDemo {

	public static void wish(String name) {
		System.out.println("Hello " + name);
	}

	public static void wishAll(String ... names) {
		for(String name : names)
			System.out.println("Hello " + name);
	}
	
	public static void main(String[] args) {
		wish("James");
		wishAll("Andy", "Bob", "Kevin");
	}

}
