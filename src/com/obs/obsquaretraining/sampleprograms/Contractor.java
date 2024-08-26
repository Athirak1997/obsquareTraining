package com.obs.obsquaretraining.sampleprograms;

public class Contractor extends Employeeee{
public double paymentPerHours;
int workingHours;

public  Contractor(int paymentPerHours,int workingHours) {
	this.paymentPerHours=paymentPerHours;
	this.workingHours=workingHours;
	
}
	@Override
	double calculateSalary() {
		return paymentPerHours*workingHours;
	
		
		
	}

}
