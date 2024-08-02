/**
 * 
 */
package com.obs.obsquaretraining.sampleprograms;

/**
 * @author ATHIRA
 */
public class Area {
	int a;
 int b;
 int c;

	/**
	 * @param args
	 */
	public void calculate(int a, int b) {
		this.a=a;
		this.b=b;
 c= a*b/2;
 System.out.println("area ="+c );
	}
public static void main(String [] args) {
	Area a= new Area();
	a.calculate(10, 20);
}
}
