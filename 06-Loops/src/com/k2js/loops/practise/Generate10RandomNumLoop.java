//Requirement: To generate 10 Random number below 100 and sum those numbers and return to the main

package com.k2js.loops.practise;

class Generate10RandomNum{
	static int generate10RandomNum(){
		int sum=0;
		for (int i=0;i<=10;i++){
			int num=(int)(Math.random()*99+1);
			sum+=num;
		}
		return sum;
	}
}

class Generate10RandomNumTest{
	public static void main(String...xxyy){
		int sum = Generate10RandomNum.generate10RandomNum();
		System.out.println(sum);
	}
}