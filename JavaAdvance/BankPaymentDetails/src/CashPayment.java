
public class CashPayment extends Payment {

	public CashPayment(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}
	public void paymentDetails() {
		System.out.println("Cash amount is: "+getPayment());
	}
}
