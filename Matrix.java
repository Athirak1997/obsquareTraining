package com.obs.obsquaretraining.sampleprograms;


public class Matrix {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{6,7,8}};
		int b[][]= {{4,5,6},{5,7,8},{8,9,9}};
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"  ");
			}
	System.out.println();
		}
		}}

	