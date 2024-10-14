package lib1;

public class TestMyTime {

	public static void main(String[] args) {
		 MyTime t1 = new MyTime(10,20,30);
		 MyTime t2 = new MyTime(10,20,30);
		 
		 System.out.println(t1.equals(t2));
		 System.out.println(t1); // t1.toString()
		 
		 System.out.println(t1.mins());
		 System.out.println(t1.totalSeconds());		 
	}
}

