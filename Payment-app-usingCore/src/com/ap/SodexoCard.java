package com.ap;

public class SodexoCard implements IPayment {

	
	@Override
	public boolean pay(double amount) {
		System.out.println("SodexoCard in process with amount : "+amount);
		return true;
	}
}
