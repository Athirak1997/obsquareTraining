package com.obs.obsquaretraining.others;

public class Employee {
	int id;
	String name;
static String company=" ABC";
	Employee(int id,String name){
	this.id=id;
	this.name=name;
	}
  void display()
	{
		System.out.println(name+" "+id+" "+company);
	}
	
	

	public static void main(String[] args) {
	Employee e=new Employee(1,"athira");
	e.display();
	Employee e1= new Employee(2,"anjana");
			e1.display();
			Employee e2= new Employee(3,"aarathi");
			e2.display();

	}

}
