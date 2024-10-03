package oop;

public class TestSavingsAccount {

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount(1, "James", 10000);
		SavingsAccount s2 = new SavingsAccount(2, "Andy");
		
		s.deposit(5000);
		s.withdraw(2000);
		
		
		System.out.println(s.getBalance());
		
		s2.print();
		
	}

}
