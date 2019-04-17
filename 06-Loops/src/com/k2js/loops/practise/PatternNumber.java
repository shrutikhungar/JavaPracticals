/*Requirement : To print below pattern
4134672
         2
        72
       672
      4672
     34672
    134672
   4134672
*/

package com.k2js.loops.practise;

class PatternNumber{
	
	static int countOfDigits(int num){
		int countOfDigits=0;
		for(;num!=0;){
			num=num/10;
			countOfDigits++;
		}		
		return countOfDigits;
	}
	static void patternNumber(int num){
		int countOfDigits=PatternNumber.countOfDigits(num);
		int p=1,originalNum=num, spaceCounter=countOfDigits;
		for(;num!=0;){
			int power=(int)(Math.pow(10,p++));
			int digits=originalNum%power;
			for(int j=spaceCounter-1;j>=1;j--){
					System.out.print(" ");				
			}				
			spaceCounter--;
			System.out.println(digits);
			num=originalNum/power;
		}		
	}
}

class PatternNumberTest{
	
	public static void main(String...xxyy){
		PatternNumber.patternNumber(4134672);
	}
}