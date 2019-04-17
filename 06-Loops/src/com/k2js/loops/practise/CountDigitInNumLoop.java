//Requirement: Print how many digits are there in given num

package com.k2js.loops.practise;

class NumOfDigitInNum{
	
	static int numOfDigitInNum(){
		int num=43326;
		int NumOfDigitInNum=0;
		
		for(;num!=0;){
			NumOfDigitInNum++;
			num/=10;
		}
		return NumOfDigitInNum;
	}
}
			
class NumOfDigitInNumTest{
	
	public static void main(String...xxyy){
		int count=NumOfDigitInNum.numOfDigitInNum();
		System.out.println(count);
	}
}