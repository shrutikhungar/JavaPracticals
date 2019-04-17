//Request

package com.k2js.allprograms.practise;

class PatternNumberPrint{
	
	static int countOfDigits(int num){
		int countOfDigits=0;
		for(;num!=0;)
		{
			num=num/10;
			countOfDigits++;
		}
		return countOfDigits;		
	}
	static void patternNumber(){
		int num=456738,p=1;
		int countOfDigits=PatternNumberPrint.countOfDigits(num);
		//System.out.println(countOfDigits);
		for(int i=1;i<=countOfDigits;i++)
		{
			int digit=num%10;
			if(i/2==0){
				System.out.println(digit);
			}
			num=num/10;
		}			
	}
}

class PatternNumberPrintTest{
	
	public static void main(String...xxyy){
		PatternNumberPrint.patternNumber();
	}	
}