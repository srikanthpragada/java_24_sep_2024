package lib1;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name + " - " + this.age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person other)
			return this.age == other.age && this.name.equals(other.name);
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		return this.age;
	}
}

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person("Scott", 40);
		Person p2 = new Person("Scott", 40);
		Person p3 = new Person("Ellison", 50);

//		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.toString());
		System.out.println(p1.equals("Abc"));
	}

}
