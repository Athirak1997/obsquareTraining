/**
 * 
 */
package com.obs.obsquaretraining.sampleprograms;

public class Shopping {
	int  a,b,discount,costToPaid;
	public int amount(int a){
	if(a>5000){
		System.out.println("eligible for discount");
	}else{
		System.out.println("not eligible for discount");

	}
	return a;
	}
	public   int finddiscount(int b){
	if(b>5000){
		discount=(b*20)/100;
		costToPaid=b-discount;
		System.out.println("The discounted amountis "+costToPaid);
	}else{
		System.out.println("The amount is "+b);
		
		
	}
	return costToPaid;
	}
	public static void main(String[] args) {
		Shopping s= new Shopping();
		s.amount(6000);
		s.finddiscount(6000);

	}

}
