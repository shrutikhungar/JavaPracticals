//Requirement: To print sum of 1 to 10 using loop

package com.k2js.loops.practise;

class Sum10NumLoopGood{
	
	static int sum10NumLoopGood(){
		int sum = 0;
		for (int i=0;i<=10;sum+=i,i++);
		return sum;
	}	
}	

class Sum10NumLoopGoodTest{
	
	public static void main(String...xxyy){
		int sum=Sum10NumLoopGood.sum10NumLoopGood();
		System.out.println("Sum is: "+sum);
	}
}
	