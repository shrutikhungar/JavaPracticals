/*Requirement : To print small letters abc ASCII value sum in single digit
78912
34567
89123
45678
91234
5
*/
package com.k2js.loops.practise;

class PatternASCIIabcSum{
	
	static void patternASCIIabcSum(){
		for(int i=0;i<26;i++){
			if(i%5==0 && i>0)
				System.out.println("");
				
			System.out.print(PatternASCIIabcSum.SumOfTwoDigit(i+97));
		}
	}
	
	static int SumOfTwoDigit(int num){
		int sum=0;
		
		for (;num!=0;){			
			int lastDigit=num%10;
			sum+=lastDigit;
			num/=10;	
			if(num==0 && sum>9){
				num=sum;
				sum=0;
			}
		}
		return sum;		
	}
}

class PatternASCIIabcSumTest{
	
	public static void main(String...xxyyy){
		PatternASCIIabcSum.patternASCIIabcSum();
	}
}