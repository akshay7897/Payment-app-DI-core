package com.ap;

public class PaymentProcesser {
	
	private IPayment payment;
	
	public PaymentProcesser(IPayment payment) {
		this.payment=payment;
	}
	
	
	public void doPayment(double amount) {
		
		boolean status = payment.pay(amount);
		
		if(status) {
			System.out.println("Payment is Done...!");
		}else {
			System.out.println("Payment failed....");
		}
		
		
	}

}
