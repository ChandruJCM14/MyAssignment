package week3.day1;

public interface Payments {
	 void cashOnDelivery(); 
	 void upiPayments();
	 void cardPayments();
	 void internetBanking();
	 default void paymentStructure() {
	 System.out.println("Money will be refunded if product request the return within one week");
}
}