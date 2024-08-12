package com.obs.obsquaretraining.others;
import java.util.Scanner;
public class EmployeeSalary {
public static  int basicPay;
public int bonus;
public int deduction;
 public void read() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter basic pay");
	this. basicPay=sc.nextInt();
	System.out.println("Enter deduction");
	this. deduction=sc.nextInt();
	System.out.println("Enter bonus");
	this. bonus=sc.nextInt();
	sc.close();

	 }

	}


	

