//requirement: to check given number is palidrome or not

package com.k2js.loops.practise;

class Palidrome{
	
	static void palidrome(int num){
		int reverse=0;
		int originalNum=num;
		for (;num!=0;){
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		
		if (originalNum==reverse)
			System.out.println("Number "+originalNum+ " is palidrome");
		else
			System.out.println("Number "+originalNum+ " is not palidrome");
			
	}
}

class PalidromeTest{
	
	public static void main(String...xxyy){
		Palidrome.palidrome(121);
	}
}