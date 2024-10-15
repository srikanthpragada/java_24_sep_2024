package lib1;

public class BoxingDemo {

	public static void main(String[] args) {
		Object obj;

		obj = "Abc"; // String to Object
		obj = new Integer(11);  // Boxing 
		
		// Auto-Boxing 
		obj = 11;
		System.out.println(obj.getClass());
		Double d = 10.50;
		System.out.println(d.getClass());
		
		// Auto-unboxing d and perform operation 
		System.out.println(d * 10);
	}
}
