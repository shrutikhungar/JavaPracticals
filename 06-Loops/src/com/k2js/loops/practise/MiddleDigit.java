//Requirement: To find the middle digit

package com.k2js.loops.practise;

class MiddleDigitNumber{
	
	static int countOfDigit(int num){
		int countOfDigit=0;
		for(;num!=0;){
			num=num/10;
			countOfDigit++;
		}
		return countOfDigit;
	}
	
	static int getPositionNum(int num, int pos){
		System.out.println("postion: "+pos);
		int startDigit=0;
		for(;num!=0;num/=10){
			int digit=num%10;
			startDigit++;

			if(startDigit==pos)
				return digit;
		}
		return -1;
	}
	
	static int getMiddleDigitNum(int num){
		int countOfDigit=MiddleDigitNumber.countOfDigit(num);
		System.out.println("Count of digit: "+countOfDigit);
		int middleDigitNum=MiddleDigitNumber.getPositionNum(num,(countOfDigit%2==0)?countOfDigit/2:countOfDigit/2+1);
		return middleDigitNum;
		
	}
}

class MiddleDigitTest{
	
	public static void main(String...xxyy){
		int num=1234;		
		int middleDigitNum=MiddleDigitNumber.getMiddleDigitNum(num);
		System.out.println(middleDigitNum);
	}
}