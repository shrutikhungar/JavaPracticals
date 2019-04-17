//Requirement to find nth highest digit in a num

package com.k2js.homeworks.practise;

class NthHighestDigit{
	
	public static int highestDigit(int num){
		int biggestDigit=0;
		for(;num!=0;){
			int digit = num%10;
			biggestDigit=(digit>biggestDigit)?digit:biggestDigit;
			num=num/10;
		}
		return biggestDigit;
	}
	
	public static void nthHigestDigit(int num,int nthHigest){
	
		for(int i=0;i<=nthHigest;i++){
			int nthBiggestDigit=0;
			int biggestDigit=NthHighestDigit.highestDigit(num);
			for (num!=0){
				int digit=num%10;
				nthBiggestDigit=(digit>nthBiggestDigit && digit<nthHigest)?digit:nthBiggestDigit;
				num=num/10;
			}
			biggestDigit=nBigDigit;
			num=originalNum;
		}
	}
}

class NthHighestDigitTest{
	
	public static void main(String[] str){
		NthHighestDigit.nthHigestDigit(89237,1);
	}
}