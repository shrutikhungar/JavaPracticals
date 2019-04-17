/*Requirement: num is 123456
print 321
654
*/

package com.k2js.homeworks.practise;

class RevNumEvery3DigForward{
	static void revNumEvery3DigitForward(int num){
		for(;num!=0;){
			int threeDigitNum/=1000;
			System.out.println(threeDigitNum)
		}
	}
}

class RevNumEvery3DigForwardTest{
	public static void main(String...xxyy){
		RevNumEvery3DigForward.revNumEvery3DigitForward(123456);
	}
}