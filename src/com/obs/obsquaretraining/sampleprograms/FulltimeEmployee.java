package com.obs.obsquaretraining.sampleprograms;

public class FulltimeEmployee extends Employeeee {
	int  paymentPerHour;
	public  FulltimeEmployee(int paymentPerHour) {
		this.paymentPerHour=paymentPerHour;
	}



	@Override
	double calculateSalary() {
	
		return 8*paymentPerHour;
	}
	public static void main(String[] args) {
		Contractor c=new Contractor(100,12);

	System.out.println("contractor salary :"+c.calculateSalary());
	FulltimeEmployee f= new FulltimeEmployee(100);
	
	System.out.println("fulltime salary:"+f.calculateSalary());
}
}