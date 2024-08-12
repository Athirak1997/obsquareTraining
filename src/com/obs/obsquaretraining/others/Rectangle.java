package com.obs.obsquaretraining.others;

public class Rectangle extends Shape {
	void display() {
		System.out.println("this is rectangle");
		System.out.println(super.a);
		super.display();
	}

public static void main(String []args) {
	Rectangle r= new Rectangle();
	r.display();
}
}
