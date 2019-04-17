//Requirement: TO print the even digits of a number

package com.k2js.loops.practise;

class PrintEvenDigitInReverse{
	
	static void printEvenDigit(int num){
		for(;num!=0;){
			int digit=num%10;
			if(digit%2==0){
				System.out.print(digit);
			}
			num=num/10;
		}
	}
}

class PrintEvenDigitTest{
	
	public static void main(String...xxyy){
		PrintEvenDigit.printEvenDigit(23456);
	}
}