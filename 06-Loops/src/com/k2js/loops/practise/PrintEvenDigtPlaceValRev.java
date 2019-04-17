//Requirement: To Print place value of even digits in a number in reverse order of number

package com.k2js.loops.practise;

class PrintEvenDigtPlaceValRev{
	
	static void printEvenDigPlaceValRev(int num){
		int p=0,placeVal=0,power=0;
		for (;num!=0;){
			int digit = num%10;
			power=(int)Math.pow(10,p++);
			if(digit%2==0){
				placeVal=digit*power;
				System.out.println(placeVal);
			}
			num=num/10;
		}		 
	}
}

class PrintEvenDigtPlaceValRevTest{
	
	public static void main(String...xxyy){
		PrintEvenDigtPlaceValRev.printEvenDigPlaceValRev(768942);
	}
}