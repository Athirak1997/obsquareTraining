package com.obs.obsquaretraining.others;

public class LineItem {
	int quantity;
	Product pdr;
	public LineItem(int quantity, Product pdr) {
		super();
		this.quantity = quantity;
		this.pdr = pdr;
	}
public void show() {
	System.out.println("quantity :"+this.quantity);
	System.out.println(pdr.description);
	System.out.println(pdr.name+pdr.id);
}
public static void main(String[] args) {
	Product pdr=new Product("soap  ",121," red");
	LineItem li=new LineItem(2,pdr);
	li.show();
}
}
