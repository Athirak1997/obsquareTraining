package com.obs.obsquaretraining.others;

public class Bank {
	private int pin;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	public void validate() {
		if(pin==1234) {
			System.out.println("valid pin");
		}else if(pin==1001) {System.out.println("valid pin");
	}else if(pin==1256) {System.out.println("valid pin");
	
}else {System.out.println("invalid pin");
}
	}
}