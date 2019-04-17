//Requirement: To print place value of even digits from reverse order of number and print its addition

package com.k2js.loops.practise;

class AdditionEvenPlaceValue{
	
	static void additionEvenPlaceValue(int num){
		int p=0,power=0,placeVal=0,sum=0;
		for(;num!=0;){
			int digit=num%10;
			power=(int)(Math.pow(10,p++));
			placeVal=digit*power;
			if(digit%2==0)
				System.out.println(placeVal);
			num=num/10;
			sum+=placeVal;
		}
		System.out.println("Sum of place values is: "+sum);
	}
}

class AdditionEvenPlaceValueTest{
	
	public static void main(String...xxyy){
		AdditionEvenPlaceValue.additionEvenPlaceValue(2468);
	}
}