package com.ap;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean pay(double amount) {
		System.out.println("CreditCardPayment in process with amount : "+amount);
		return true;
	}

}
