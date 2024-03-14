package com.ap;

public class DebitCardPayment implements IPayment {

	@Override
	public boolean pay(double amount) {
		System.out.println("DebitCardPayment in process with amount : "+amount);
		return true;
	}

}
