//requirement: To divide the number by 3 and 5 and return a particular string using if else: good method

package com.k2js.aboutconditions.practise;

class DivideIfElseGood{
	
	static String divideIfElseGood(int num){
		String result=null;
		if (num%3==0 && num%5==0)
			result="Hello World";
		else if (num%5==0)
			result="World";
		else if(num%3==0)
			result="Hello";
		else
			result="Invalid Input";
		
		return result;
	}
}

class DivideIfElseGoodTest{
	
	public static void main(String...xxyy){
		
		//int num=(int)(Math.random()*5+12);
		int num=25;
		String result=DivideIfElseGood.divideIfElseGood(num);
		System.out.println(num+" : "+result);
	}
}