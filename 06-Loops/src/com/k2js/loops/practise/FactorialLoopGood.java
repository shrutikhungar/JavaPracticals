//Requirement: To print factorial of a given number: good method

package com.k2js.loops.practise;

class FactorialLoopGood{
	
	static int factorialLoopGood(int num){
		int factorial = 1;
		for (int i=1;i<=num;i++)
			factorial*=i;
		return (factorial);
	}	
}	

class FactorialLoopGoodTest{
	
	public static void main(String...xxyy){
		int factorial=FactorialLoopGood.factorialLoopGood(5);
		System.out.println(factorial);
	}
}
	