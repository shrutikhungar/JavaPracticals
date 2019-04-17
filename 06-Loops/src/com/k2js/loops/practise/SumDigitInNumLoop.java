//Requirement: To find the sum of all the digits in a number

package com.k2js.loops.practise;

class SumDigitNumLoop{
	
	static int sumDigitNum(){
		int num=232,sum=0;
		
		for(;num!=0;){
			sum+=num%10;
			num/=10;
		}
		
		return sum;
	}
}

class SumDigitNumLoopTest{
	
	public static void main(String...xxyy){
		int sum=SumDigitNumLoop.sumDigitNum();
		System.out.println(sum);
	}
}