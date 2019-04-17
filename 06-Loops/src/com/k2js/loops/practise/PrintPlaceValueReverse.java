	//requirement: to print place value from reverse

package com.k2js.loops.practise;

class PrintPlaceValueReverse{
	
	static int getNumberOfDigits(int num){
		int c;
		for(c=0;num!=0;c++){
			num=num/10;
		}
		return c;
	}
	
	static void printPlaceValueReverse(){
		int num=426;
		int digitCount=PrintPlaceValueReverse.getNumberOfDigits(num);
		for(;num!=0;)	{
			int p=(int)Math.pow(10,--digitCount);
			int digit=num/p;
			int placeValue=digit*p;
			System.out.println(placeValue);
			num%=p;		
		}
	}
}

class PrintPlaceValueReverseTest{
	public static void main(String...xxyy){
		PrintPlaceValueReverse.printPlaceValueReverse();
	}
}