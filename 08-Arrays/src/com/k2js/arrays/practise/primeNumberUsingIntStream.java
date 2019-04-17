//Requirement: To find sum of prime char in string array

package com.k2js.arrays.practise;

import java.util.stream.IntStream;


class PrimeNumIntStream{
	
	static int primeNumIntStream(String[] strArr){		
		int sum=0;
		for(String strEle:strArr){
			int factorCount=0; 
			for(char c:strEle.toCharArray()){
				//public static java.util.stream.IntStream range(int, int);
				//public abstract long count();
				//public abstract java.util.stream.IntStream filter(java.util.function.IntPredicate);
				factorCount=(int)(IntStream.range(1,c/2+1).filter(i->c%i==0).count());
				sum+=(factorCount==1)?c:0;
			}
			System.out.println(strEle+ "\t" +sum);
		}
		return sum;
	}
}

class PrimeNumIntStreamTest{
	
	public static void main(String[] strArr){		
		int sumPrime=PrimeNumIntStream.primeNumIntStream(strArr);
		System.out.println(sumPrime);
	}
}