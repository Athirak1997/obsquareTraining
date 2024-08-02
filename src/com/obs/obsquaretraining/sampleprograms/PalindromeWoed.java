/**
 * 
 */
package com.obs.obsquaretraining.sampleprograms;

/**@author ATHIRA
 * 
 */
public class PalindromeWoed {
	String s,rev,b,s1;
	public void palindrome(String s){
		this.s=s;
		s1=s.toLowerCase();
		rev="";
		for(int i=s1.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		
			
		
		}

	}
		public  void display(){
			if(s1.equals(rev)){
			System.out.println("the word is palindrome");
		}else{
		System.out.println("the word is not palindrome");
		}
		}
		public static void main(String[] args){
			PalindromeWoed p= new PalindromeWoed();
			p.palindrome("java");
			p.display();
		}

}
