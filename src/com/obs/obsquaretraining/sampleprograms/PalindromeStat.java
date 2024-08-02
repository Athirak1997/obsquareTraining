/**
 * 
 */
package com.obs.obsquaretraining.sampleprograms;

/**
 * 
 */
public class PalindromeStat {
	static int b;static int rev=0;
	public static int reverse(int a){
		
 b=a;

while(a>0){

int rem=a%10;
rev=rev*10+rem;
a=a/10;
}
return rev;
}


public static boolean ispalindrome(){
	if(b==rev){
		return true;
	}else{
		return false;
	}
}
	public static void main(String[] args) {
		int result=PalindromeStat.reverse(121);
		
		
		boolean status=PalindromeStat.ispalindrome();
		if(status){
			System.out.println("The no: is palindrome");
		}else{
			System.out.println("The no: is not palindrome");

	}

}
	}
