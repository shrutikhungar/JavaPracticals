/*Requirement: num is 123456
print 
654
321
*/

package com.k2js.homeworks.practise;

class RevNumEvery3Dig{
	static int revNum(int threeDigNum){
		int revDigit=0;
		for(;threeDigNum!=0;){
			int digit=threeDigNum%10;
			revDigit=revDigit*10+digit;
			threeDigNum/=10;
		}
		return revDigit;
	}
	
	static void revNumEvery3Digit(int num){
		for(;num!=0;){
			int power=(int)(Math.pow(10,3));
			int threeDigNum=num%power;
			int revNum=RevNumEvery3Dig.revNum(threeDigNum);
			System.out.println(revNum);
			num/=power;
		}
	}
}

class RevNumEvery3DigTest{
	public static void main(String...xyy){
		RevNumEvery3Dig.revNumEvery3Digit(123456);
	}
}