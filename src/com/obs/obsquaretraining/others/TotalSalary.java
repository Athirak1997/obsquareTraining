package com.obs.obsquaretraining.others;

public class TotalSalary extends CalculateHra {
	double totalSal;
	public void total() {
			totalSal=this.basicPay+this.hra+this.pf-this.deduction+this.bonus;
		
		}
	public void finalSalary() {
		System.out.println("Basic Pay: "+this.basicPay);
		System.out.println("Deduction : "+this.deduction);
		System.out.println("Bonus : "+this.bonus); 
		System.out.println("hra : "+this.hra);
		System.out.println("pf  :"+this.pf);
		System.out.println("Total Salary : "+this.totalSal);
		
	}
public static void main(String[] args) {
	 TotalSalary  e=new TotalSalary();
	 e.read();
	 e.calculate();
	 e.total();
	 e.finalSalary();
	
	 
		

	}

}
