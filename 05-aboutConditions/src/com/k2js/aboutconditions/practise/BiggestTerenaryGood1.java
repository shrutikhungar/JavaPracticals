//Requirement: To find out the biggest number of three inputs using ternary: Good method

package com.k2js.aboutconditions.practise;

class BiggestTerenaryGood1{
	
	static String biggestTerenaryGood(int num1,int num2,int num3){
		return ((num1>num2)?(num1>num3)?num1:num3
					:(num2>num3)?num2:num3))+": is big";
	}
}

class BiggestTerenaryGood1Test{
	
	public static void main(String...xxyy){
		String biggest=BiggestTerenaryGood1.biggestTerenaryGood(103,334,45);
		System.out.println(biggest);
	}
}