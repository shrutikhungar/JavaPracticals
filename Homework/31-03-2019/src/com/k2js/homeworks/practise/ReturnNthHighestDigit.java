//Requireent: to return nth highest digit

package com.k2js.homeworks.practise;

class ReturnNthBiggest{
	
	static int biggestDigit(int num){
		int biggestDigit=0;
		for(;num!=0;){
			int digit = num%10;	
			biggestDigit=(digit>biggestDigit)?digit:biggestDigit;
		}
		return biggestDigit;
	}
	
	static void returnNthBiggest(int num, int nthBig){
		int nthBiggest=-1;
		int originalNum=num;
		int biggestDigit=ReturnNthBiggest.biggestDigit(num);
		for(int i=1;i<=nthBig;i++){
			for(;num!=0;){
				int digit=num%10;
				nthBiggest=(digit>nthBiggest && digit<biggestDigit)?digit:nthBiggest;			
				num=num/10;
			}
		biggestDigit=nthBiggest;
		num=originalNum;
		System.out.println(nthBiggest);	
		}
	}
}

class ReturnNthBiggestTest{
	public static void main(String...xxyy){
		ReturnNthBiggest.returnNthBiggest(394642,2);
	}
}