//Requirement: Print every 3 digit from back

package com.k2js.loops.practise;

class PrintEvery3DigitFromBack{
	
	static void printEvery3DigitFromBack(int num){
		for(;num!=0;){
			int last3Digit=num%1000;
			System.out.println(last3Digit);
			num=num/1000;
		}			
	}
}

class PrintEvery3DigitFromBackTest{
	
	public static void main(String...xxyy){
		PrintEvery3DigitFromBack.printEvery3DigitFromBack(72432615);
	}
}