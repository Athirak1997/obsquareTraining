package com.obs.obsquaretraining.others;

public class Example implements Drawable,Drawable1 {

	
	

	@Override
	public void display() {
		System.out.println("displaying");
		
	}

	@Override
	public void draw() {
		System.out.println("drawing");
		
		
	}
	public static void main(String[] args) {
	Example e=new Example();
	e.display();
	e.draw();
}
}