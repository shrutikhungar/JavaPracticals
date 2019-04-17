//Requirement: nth highest, print all digit at once, coount occurance of digit

package com.k2js.constructors.practise;

class CountOfOccurance{
	
	static void m(int num){
		//1. get digit count
		int dc=0;
		for(int tnum=num;tnum!=0;tnum/=10,dc++);
		System.out.println("Digit Count:"+dc);
		
		//2. get 10 power
		int tens=1;
		for(int t=1;t<dc;t++,tens*=10);
		System.out.println("power:"+tens);
		
		//3. print num only once
		for(int t=1;t<dc;t++,tens/=10){
			int digit=(num/tens)%10;
			int numBeforeDigit=num/tens,repCount=1;
			
			for(int tnum=numBeforeDigit;tnum!=0;tnum/=10){
				int digit2=tnum%10;
				repCount=(digit==digit2)?++repCount:repCount;
			}
			
			if(repCount==1){
				int c=0;
				for(int t1=num;t1!=0;t1/=10){
				int digit2=t1%10;
				c=(digit==digit2)?++c:c;
			}	
			System.out.println(digit +":"+ c);
			}
		}
	}
}

class CountOfOccuranceTest{
	public static void main(String...xxyy){
		CountOfOccurance.m(4564);
	}
}