//Requirement: To find out the biggest number of three inputs using ternary: Good method

package com.k2js.aboutconditions.practise;

class BiggestTerenaryGood{
	
	static int biggestTerenaryGood(int num1,int num2,int num3){
		int biggest=(num1>num2 && num1>num3)?num1:(num2>num1 && num2>num3)?num2:(num3>num2 && num3>num1)?num3:0;
		return biggest;
	}
}

class BiggestTerenaryGoodTest{
	
	public static void main(String...xxyy){
		int biggest=BiggestTerenaryGood.biggestTerenaryGood(103,334,45);
		System.out.println(biggest);
	}
}