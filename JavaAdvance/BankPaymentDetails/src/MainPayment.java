
public class MainPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CashPayment c1 = new CashPayment(100.0);
		CashPayment c2 = new CashPayment(200.0);
		
		CreditCardPayment p1 = new CreditCardPayment(500.0, "bruno" ,"22/03/2022","1545666265");
		CreditCardPayment p2 = new CreditCardPayment(800.0, "pablo" , "21/03/2022", "46494616945");
		System.out.println("");
		c1.paymentDetails();
		System.out.println("");
		
		c2.paymentDetails();
		
		System.out.println("");
		
		p1.paymentDetails();
		System.out.println("");
		
		p2.paymentDetails();
	}

}
