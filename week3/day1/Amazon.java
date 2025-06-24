package week3.day1;

public class Amazon extends CanaraBank{

	@Override
	public void cashOnDelivery() {
		System.out.println("Payment will be Made after delivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("Payment made by UPI Transaction");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Payment made by using Credit/Debit card Transaction");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Payment made through Internet Banking");
		
	}
	public static void main(String[] args) {
		Amazon az = new Amazon();
		az.recordPaymentDetails();
		az.cashOnDelivery();
		az.upiPayments();
		az.cardPayments();
		az.internetBanking();
		az.paymentStructure();
		
		
	}

}
