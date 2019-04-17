//Requirement: To find out the biggest number of three inputs using Math.max()

package com.k2js.aboutconditions.practise;

class BiggestMaxGood{
	
	static int biggestMaxGood(int num1,int num2,int num3){
		return Integer.max(Math.max(num1,num2),num3);
	}
}

class BiggestMaxGoodTest{
	
	public static void main(String...xxyy){
		int big=BiggestMaxGood.biggestMaxGood(120,23,7);
		System.out.println(big);
	}
}