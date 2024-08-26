package com.obs.obsquaretraining.others;

public  class Hdfc implements Rbi {
	double a;
	double i;

	

	public static void main(String[] args) {
		Hdfc obj=new Hdfc();
		obj.recurringDeposit(2000, 36);
	
		
	

	}

	@Override
	public double recurringDeposit(double amount,int duration) {
		double d=duration+1;
		double i=(amount*duration*d*interestRate)/2400;
		double a=amount*duration+i;
		System.out.println("amount deposited="+amount);
		System.out.println("duration:"+duration);
		System.out.println("amount after maturity:"+a);

		return a;
		
	}

}
