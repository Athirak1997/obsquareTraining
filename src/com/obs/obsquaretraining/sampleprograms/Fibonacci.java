/**
 * 
 */
package com.obs.obsquaretraining.sampleprograms;

/**
 * @author ATHIRA
 */
public class Fibonacci {


	public static void main(String[] args) {
		int n=6;
		int a=0;
		int b=1;
		int nextnum;
		for(int i=1;i<=n;i++){
		System.out.print(a+",");
		nextnum= a+b;
		a=b;
		b=nextnum;

	}

}
}