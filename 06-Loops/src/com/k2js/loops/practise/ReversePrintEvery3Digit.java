	//Requirement: To reverse every 3 digit and print

package com.k2js.loops.practise;

class ReverseEvery3Digit{
	
	static void reverseEvery3Digit(int num){
		int power=0;
		for(;num!=0;){
			power=(int)(Math.pow(10,3));
			int last3Digits=num%power;
			num/=power;
			int reverseDigits=ReverseEvery3Digit.reverseDigits(last3Digits);
			System.out.println("Reverse is :" +reverseDigits);
		}
	}
	
	static int reverseDigits(int last3Digits){
		System.out.println("Last 3 digit " +last3Digits);
		int reverseDigits=0;
		for(;last3Digits!=0;){
			int lastDigit=last3Digits%10;
			reverseDigits=reverseDigits*10+lastDigit;
			last3Digits/=10;
		}
		return reverseDigits;		
	}
}

class ReverseEvery3DigitTest{
	
	public static void main(String...xxyy){
		ReverseEvery3Digit.reverseEvery3Digit(12345698);
	}
}