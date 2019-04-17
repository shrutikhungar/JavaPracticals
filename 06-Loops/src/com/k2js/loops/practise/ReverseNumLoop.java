//Requirement: To reverse a number

package com.k2js.loops.practise;

class ReverseNum{
	
	static int  reverseNum(){
		int num=568,reverse=0;
		for(;num!=0;){
			int remainder=num%10;
			reverse=reverse*10+remainder;
			num/=10;
		}
		return reverse;
	}
}

class ReverseNumTest{
	
	public static void main(String...xxyy){
		int reverse=ReverseNum.reverseNum();
		System.out.println(reverse);
	}
}