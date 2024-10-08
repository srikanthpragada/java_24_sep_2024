package oop;

abstract class Doctor {
	protected String name, dept;

	public Doctor(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.dept);
	}
	
	public abstract int getSalary();
}

class ResidentDoctor extends Doctor {
	protected int salary;

	public ResidentDoctor(String name, String dept, int salary) {
		super(name, dept);
		this.salary = salary;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(this.salary);
	}
	
	public int getSalary() {
		return this.salary;
	}
}

class Consultant extends Doctor {
	protected int visits, charge;

	public Consultant(String name, String dept, int visits, int charge) {
		super(name, dept);
		this.visits = visits;
		this.charge = charge;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(this.visits);
		System.out.println(this.charge);
	}
	
	public int getSalary() {
		return this.visits * this.charge;
	}
}

public class TestDoctor {

	public static void main(String[] args) {
		 ResidentDoctor rd = new ResidentDoctor("Dr. Joe", "CARD",500000);
		 //rd.print();
		 
		 Consultant cd = new Consultant("Dr. Andy", "NERO", 10, 1500);
		 //System.out.println(cd.getSalary());
		 
		 Doctor d; 
		 
		 d = rd;     // upcasting 
		 d.print();  // print() from rd  - runtime polymorphism 
		 System.out.println(d.getSalary());  // from rd - runtime polymorphism
		 
		 d = cd;     // upcasting
		 d.print();  // print() from cd 
		 
		 if(d instanceof ResidentDoctor)
		      rd = (ResidentDoctor) d;  // Downcasting 
		 
		 if (d instanceof Consultant c) // Pattern matching for instanceof
			    c.print(); 
		 
	}
}
