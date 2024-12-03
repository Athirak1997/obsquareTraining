package com.obs.obsquaretraining.others;

public class AdditionResult extends Addition {
public AdditionResult(int d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
public void  check() {
	int sum=super.d;
	if(sum%10==0) {
		System.out.println("sum is divisible by 10");
		
	}else {
		System.out.println("sum is not divisible  by 10");
	}
}
public static void main(String[] args) {
	AdditionResult a1= new AdditionResult(d);
	a1.add();
	a1.check();
}
}