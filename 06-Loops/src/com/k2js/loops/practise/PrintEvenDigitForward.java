//Requirement: To Print digits in forward order if they are even

package com.k2js.loops.practise;

class PrintEvenDigitForward{
		
	static int countNoOfDigits(int num){
		int countNoOfDigits=0;
		for(;num!=0;){
			num=num/10;
			countNoOfDigits++;
		}
		return countNoOfDigits;
	}
	
	static void printEvenDigitForward(){
		int num=23645,p=0;
		int countNoOfDigits=PrintEvenDigitForward.countNoOfDigits(num);
		for(;num!=0;){				
			p=(int)Math.pow(10,--countNoOfDigits);
			int digit=num/p;
			if (digit%2==0)
				System.out.print(digit);
			num=num%p;
		}
	}
}

class PrintEvenDigitForwardTest{
	
	public static void main(String...xxyy){
		PrintEvenDigitForward.printEvenDigitForward();
	}
}