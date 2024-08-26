package com.obs.obsquaretraining.sampleprograms;

public class Rectangle extends Shape{

	@Override
	void draw() {
	System.out.println("draw circle");
		
	}
public static void main(String[] args) {
	Shape s= new Rectangle();
	s.draw();
}
}

