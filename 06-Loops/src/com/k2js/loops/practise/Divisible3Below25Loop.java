//Requirement: to find whether num is prime or not

package com.k2js.loops.practise;

class Divisible3LoopGood{
	
	static String divisible3LoopGood(int divisor){
		int count = 1;
		String numbers=divisor+"";
		for (int num=divisor+1;num<=25;num++)
			if(num%divisor==0){
				count++;
				numbers=numbers+","+num;
			}
		return (count+" numbers are divisble by 3:"+numbers);
	}	
}	

class Divisible3LoopGoodTest{
	
	public static void main(String...xxyy){
		String result=Divisible3LoopGood.divisible3LoopGood(5);
		System.out.println(result);
	}
}
	