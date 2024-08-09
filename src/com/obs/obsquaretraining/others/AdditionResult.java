package com.obs.obsquaretraining.others;

public class AdditionResult extends Addition {
public void  check() {
	int sum=super.c;
	if(sum%10==0) {
		System.out.println("sum is divisible by 10");
		
	}else {
		System.out.println("sum is not divisible  by 10");
	}
}
public static void main(String[] args) {
	AdditionResult a1= new AdditionResult();
	a1.add();
	a1.check();
}
}