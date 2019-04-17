//Requirement: To find out the biggest number of three inputs using if else: Good method

package com.k2js.aboutconditions.practise;

class BiggestIfElseGood{
	
	static String biggestIfElseGood(int num1,int num2,int num3){
		String result=null;
		if(num1 > num2)
			if  (num1 > num3)
				result="value 1 is biggest";
			else 
				result="value 3 is biggest";
		else if(num2 > num3)
				if(num2 > num1)
					result="value 2 is biggest";
				else 
				result="value 3 is biggest";
		else
			result="value 3 is biggest";
		return result;		
	}
}

class BiggestIfElseGoodTest{
	
	public static void main(String...xxyy){
		String result = BiggestIfElseGood.biggestIfElseGood(102,31,71);
		System.out.println(result);
	}
}	