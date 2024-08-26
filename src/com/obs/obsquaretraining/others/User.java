package com.obs.obsquaretraining.others;

public class User  {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.setPin(1256);
		int pin=b.getPin();
		System.out.println(pin);
		b.validate();

	}
	


}