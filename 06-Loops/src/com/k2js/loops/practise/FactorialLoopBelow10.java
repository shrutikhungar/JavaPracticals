//Requirement: To find factorial of numbers below 10

package com.k2js.loops.practise;

class FactorialNumBelow10{
	
	static void factorialNumBelow10(){
		for(int givenNum=1;givenNum<=10;givenNum++){
			int factorial=1;
			for(int j=1;j<=givenNum;j++){
				factorial=factorial*j;				
			}
			System.out.println(factorial);
		}
	}
}

class FactorialNumBelow10Test{
	
	public static void main(String...xxy){
		FactorialNumBelow10.factorialNumBelow10();
	}
}