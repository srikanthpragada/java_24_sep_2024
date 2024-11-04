package col;

public class GenericMethodDemo {
	
	public static <T> void printArray(T [] a) {
		for (var n : a)
			System.out.println(n);
	}
	
//	public static void printArray(double [] a) {
//		for (var n : a)
//			System.out.println(n);
//	}
//	
//	public static void printArray(String [] a) {
//		for (var n : a)
//			System.out.println(n);
//	}

	public static void main(String[] args) {
		 Integer a[] = {1,2,3,4,5};
		 String n[] = {"Java", "JavaScript"};
		 
		 printArray(a);
		 printArray(n);

	}

}
