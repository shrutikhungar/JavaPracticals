//Requirement: to reverse a num

package com.k2js.homeworks.practise;

class ReverseNum{
	
	void revNum(int num){
		int revDigit=0;
		for(;num!=0;){
			int digit=num%10;
			revDigit=revDigit*10+digit;
			num=num/10;
		}			
		System.out.println(revDigit);
	}
}

class ReverseNumTest{
	public static void main(String...xxyy){
		new ReverseNum().revNum(1234);
	}
}