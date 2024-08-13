package com.obs.obsquaretraining.sampleprograms;

public class Employee {

	String empName;
	int empId;
	Car c;
	Bike b;
	public Employee(String empName, int empId, Car c, Bike b) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.c = c;
		this.b = b;
	}
public void display() {
	System.out.println("Employee name:"+this.empName);
	System.out.println("Employee id :"+empId);
	System.out.println("car name : "+c.carName+" car colour : "+c.colour+" car regno: "+c.regNo);
	System.out.println("bike name:"+b.bikeName+"bike reg no:"+b.regNo);
}

	public static void main(String[] args) {
	Car c =new Car("red","alto",121);
	Bike b=new Bike(" honda ",211);
	Employee e=new Employee("athira",4567,c,b);
	e.display();

	}

}
