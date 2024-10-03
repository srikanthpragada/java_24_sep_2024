package oop;

public class SavingsAccount {
	// instance variables
	private int acno;
	private String customer;
	private double balance;

	public SavingsAccount(int no, String cust, double bal) {
		acno = no;
		customer = cust;
		balance = bal;
	}
	
	public SavingsAccount(int no, String cust) {
		acno = no;
		customer = cust;
	}

	public void print() {
		System.out.println(acno);
		System.out.println(customer);
		System.out.println(balance);
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public double getBalance() {
		return balance;
	}
}
