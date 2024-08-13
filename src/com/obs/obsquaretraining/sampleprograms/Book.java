package com.obs.obsquaretraining.sampleprograms;

public class Book {
	String bookName;
	int price;
	Author aur;

	public Book(String bookName, int price, Author aur) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.aur = aur;
	}
public void show() {
	System.out.println("book name: "+this.bookName);
	System.out.println("price: "+this.price);
	System.out.println("author name: "+aur.authorName);
	System.out.println("author age:"+aur.age);
	System.out.println("author place: "+aur.place);
}
	
	public static void main(String[] args) {
	Author aur=new Author("anjana ",24," kollam");
	Book b=new Book(" meluha ",350,aur);
	b.show();

	}

}
