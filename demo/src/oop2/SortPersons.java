package oop2;

import java.util.Arrays;

class Person implements Comparable<Person> {
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
	// this == other then 0, this > other > then 0, this < other then < 0
	@Override
	public int compareTo(Person other) {
	    return this.age - other.age;
	}
}

public class SortPersons {
	public static void main(String[] args) {
		Person people[] = { new Person("James", 40), new Person("Steve", 30), new Person("Kevin", 20),
				new Person("Jacob", 50), new Person("Larry", 25) };
		
		Arrays.sort(people);
		
		for(var p : people)
			System.out.println(p);

	}

}
