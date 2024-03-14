package com.ap;

public class Test {
	
	public static void main(String[] args) {
		
		CreditCardPayment cd=new CreditCardPayment();
		DebitCardPayment db=new DebitCardPayment();
		SodexoCard sd=new SodexoCard();
		
		PaymentProcesser processer=new PaymentProcesser(sd);
		
		processer.doPayment(1200.34);
		
	}

}
