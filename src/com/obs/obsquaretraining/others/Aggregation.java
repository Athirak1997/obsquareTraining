package com.obs.obsquaretraining.others;

public class Aggregation {
	String name;
	int id;
	Address adr;
	public Aggregation(String name, int id, Address adr) {
		super();
		this.name = name;
		this.id = id;
		this.adr = adr;
	}
public void display() {
	System.out.println("name :"+this.name);
	System.out.println("id :"+id);
	System.out.println(adr.city);
	System.out.println(adr.state);
}
	

	public static void main(String[] args) {
		Address adr=new Address("hgghh","kerala");
		Aggregation e=new Aggregation("athira",121,adr);
		e.display();
	

	}

}
