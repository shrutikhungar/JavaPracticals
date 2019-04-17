//Requirement: To find the small digit is even or odd

package com.k2js.loops.practise;

class SmallDigitEvenOdd{
	
	//To find the smallest digit
	static int smallDigit(int num){
		int smallDigit=num%10;
		for(;num!=0;){
			int digit=num%10;
			smallDigit=digit<smallDigit?digit:smallDigit;
			num/=10;
		}
		return smallDigit;
	}
	
	
	//To find the digit is even or odd
	static String evenOdd(int num){
		
		return ((num/2==0)?"even":"odd");
	}
	
	//To find the smallest digit and to find digit is even or odd
	static void smallDigitEvenOdd(int num){
		int smallDigit=SmallDigitEvenOdd.smallDigit(num);
		String evenOdd=SmallDigitEvenOdd.evenOdd(num);
		System.out.println("Smallest Digit "+smallDigit+ "is " +evenOdd);
	}
	
	
}	

class SmallDigitEvenOddTest{
	
	public static void main(String...xxyy){
		SmallDigitEvenOdd.smallDigitEvenOdd(9361);
	}
}

