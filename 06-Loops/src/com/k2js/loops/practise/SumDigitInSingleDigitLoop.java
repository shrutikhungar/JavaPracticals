//Requirement: To sum all the digits in a number till we get sum as single digit number

package com.k2js.loops.practise;

class SumSingleDigit{
	
	static int sumSingleDigit(){
		int sum=0, num=3455;
		
		for(;num!=0;){
			sum+=num%10;
			num/=10;
					
			if (num==0 && sum>9){
				num=sum;
				sum=0;
			}
		}
		
		return sum;
	}
}

class SumSingleDigitTest{
	
	public static void main(String...xxyy){
		int sum= SumSingleDigit.sumSingleDigit();
		System.out.println(sum);
	}
}