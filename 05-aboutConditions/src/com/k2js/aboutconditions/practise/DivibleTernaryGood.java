//requirement: To divide the number by 3 and 5 and return a particular string using terenary: good method

package com.k2js.aboutconditions.practise;

class DivideTerenaryGood{
	
	static String divideTerenaryGood(int num){
		String result=null;
		result=(num%3==0 && num%5==0)?"Hello World":(num%3==0)?"Hello":(num%5==0)?"World":"Input Valid";
		return result;
	}
}

class DivideTerenaryGoodTest{
	
	public static void main(String...xxyy){
		int num=1;
		String result=DivideTerenaryGood.divideTerenaryGood(num);
		System.out.println(num +" : "+ result);
	}
}
		