//Requirement: to find whether num is prime or not

package com.k2js.loops.practise;

class PrimeLoopGood{
	
	static String primeLoopGood(int num){
		String result = null;
		for (int i=2;i<num;i++)
			if(num%i==0){
				result="Not Prime";
				break; 
			}
			else
				result="Prime";
		return result;
	}	
}	

// class PrimeLoopGoodTest{
	
	public static void main(String...xxyy){
		String result=PrimeLoopGood.primeLoopGood(4);
		System.out.println(result);
	}
}
	