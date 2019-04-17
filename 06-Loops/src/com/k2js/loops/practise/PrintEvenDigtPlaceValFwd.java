//Requirement: To Print place value of even digits in a number from forward

package com.k2js.loops.practise;

class PrintEvenDigtPlaceValFwd{
	
	static int countOfDigit(int num){
		int countOfDigit=0;
		for(;num!=0;){
			num=num/10;
			countOfDigit++;
		}
		return countOfDigit;
	}
	
	static void printEvenDigtPlaceValFwd(int num){
		int countOfDigit=PrintEvenDigtPlaceValFwd.countOfDigit(num);
		for (;num!=0;){
			int power=(int)(Math.pow(10,--countOfDigit));
			int digit=num/power;
			if (digit%2==0){
				int placeVal=digit*power;
				System.out.println(placeVal);
			}
			num=num%power;
		}
	}
}

class PrintEvenDigtPlaceValFwdTest{
	
	public static void main(String...xxyy){
		PrintEvenDigtPlaceValFwd.printEvenDigtPlaceValFwd(2456);
	}
}