package oop;

public class TestSavingsAccount {

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount(1, "James", 10000);
		
		s.deposit(5000);
		s.withdraw(2000);
		//s.print();
		
		System.out.println(s.getBalance());
		
	}

}
