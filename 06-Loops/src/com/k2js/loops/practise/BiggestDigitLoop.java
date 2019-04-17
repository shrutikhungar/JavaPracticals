//Requirement: TO find the biggest of all digits in a number

package com.k2js.loops.practise;

class BiggestDigit{
	
	static int biggestDigit(int num){
		int biggest=0;
		for(;num!=0;){
			int digit=num%10;
			if (biggest<digit){
				biggest=digit;
			}
			num/=10;
		}
		return biggest;
	}
}

class BiggestDigitTest{
	
	public static void main(String...xxyy){
		int biggest=BiggestDigit.biggestDigit(987);
		System.out.println(biggest);
	}
}