package com.obs.obsquaretraining.others;

public class Student{
	
	
		Student(String name,int age){
	
	System.out.println("name is  "+name+" and age is " +age);
		
	}
		public float example(float a,double b) {
	
		System.out.println(a);
		return a;
		}
	public static void main (String[] args) {
		Student s= new Student("athira",26);
		s.example(23f, 3.2);
	
	}
	}

	