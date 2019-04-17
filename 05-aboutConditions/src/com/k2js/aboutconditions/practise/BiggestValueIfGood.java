//Requirement: To find out the biggest number of three inputs using if else: Good method

package com.k2js.aboutconditions.practise;

class BiggestIfElseGood{
	
	static int biggestIfElseGood(int num1,int num2,int num3){
		int biggest=0;
		if(num1 > num2 && num1 > num3)
			biggest=num1;
		else if(num2 > num1 && num2 > num3)
			biggest=num2;
		else if(num3 > num1 && num3 > num2)
			biggest=num3;
		
		return biggest;
		
	}
}

class BiggestIfElseGoodTest{
	
	public static void main(String...xxyy){
		int biggest = BiggestIfElseGood.biggestIfElseGood(1000,234,71);
		System.out.println(biggest);
	}
}