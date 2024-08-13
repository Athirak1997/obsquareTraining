package com.obs.obsquaretraining.sampleprograms;

public class Student {
	String name;
	int rollno;
	Address adr;
public Student(String name, int rollno, Address adr) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.adr = adr;
}
public void show() {
	System.out.println("name:"+this.name);
	System.out.println("roll no:"+this.rollno);
	System.out.println("state : "+adr.state);
	System.out.println("city :"+adr.city);
	
}
	public static void main(String[] args) {
		Address adr=new Address("kerala","alappuzha");
		Student s= new Student("athira",123,adr);
		s.show();
	}

}
