package oop;

public class SavingsAccount {
	// instance variables
	private int acno;
	private String customer;
	private double balance;

	// static or class variable
	private static double minBalance = 5000;

	public SavingsAccount(int acno, String customer, double balance) {
		this.acno = acno;
		this.customer = customer;
		this.balance = balance;
	}

	public SavingsAccount(int acno, String customer) {
		// call another constructor
		this(acno, customer, 0);
	}

	public void print() {
		System.out.println(this.acno);
		System.out.println(this.customer);
		System.out.println(this.balance);
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (amount >= this.balance - SavingsAccount.minBalance)
			this.balance -= amount;
	}

	public double getBalance() {
		return this.balance;
	}

	public static double getMinBalance() {
		return SavingsAccount.minBalance;
	}
}
