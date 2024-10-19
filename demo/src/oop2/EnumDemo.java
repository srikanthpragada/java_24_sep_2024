package oop2;

enum PaymentModes {
	 CASH, CARD, NEFT, UPI
}



class Sale {
	int productId;
	int qty, price;
	PaymentModes payMode;
}

public class EnumDemo {
	public static void main(String[] args) {
		 PaymentModes pm;
		 
		 pm = PaymentModes.CASH;
		 
		 if(pm == PaymentModes.CASH)
			  System.out.println(pm);
	}

}
