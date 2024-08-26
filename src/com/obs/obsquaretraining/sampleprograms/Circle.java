package com.obs.obsquaretraining.sampleprograms;

public class Circle {
	Operation op;
	public double area(int n) {
		op=new Operation();
		int square=op.area(n);
		return 3.14*square;
	}

	public static void main(String[] args) {
		Circle c =new Circle();
		System.out.println(c.area(7));

	}

}
