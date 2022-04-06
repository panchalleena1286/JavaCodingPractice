
public class CreditCardPayment extends Payment {
	String name;
	String expiration;
	String CreditCardNo;
	
	
	public CreditCardPayment(double amount, String name, String expiration, String CreditCardNo) {
		super(amount);
		// TODO Auto-generated constructor stub
		this.name = name;
		this.expiration =expiration;
		this.CreditCardNo = CreditCardNo;
	}
	
	void paymentDetails() {
		System.out.println("amount of Credit Card: "+getPayment());
		System.out.println("Credit Card name: "+name);
		System.out.println("Expiration date: "+expiration);
		System.out.println("Credit Card Number: "+CreditCardNo);
	}
	
}
