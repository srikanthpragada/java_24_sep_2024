package oop2;

public class AnonyDemo {

	public static void main(String[] args) {
		 
	 Runnable r = 
		new Runnable() {
			@Override
			public void run() {
			    System.out.println("Run method!");
			}
		 };
		 
	 System.out.println(r.getClass());	 
	}

}
