//Requirement: to print sum of all the ascii value of prime characters in String

package com.k2js.homework.practise;

class SumPrimeASCIICharStr{
	
	static void sumPrimeASCIICharStr(String[] strArr){
		int sum=0;
		for(String strEle:strArr){
			char[] charArr=strEle.toCharArray();
			for(char charEle:charArr){
				int factorCount=SumPrimeASCIICharStr.primeOrNot((int)(charEle));
				sum+=(factorCount==1)?charEle:0;
			}
		}
		System.out.println(sum);		
	}
	/*
	static String primeOrNot(int num){
		String result = null;
		for (int i=2;i<num;i++)
			if(num%i==0){
				result="Not Prime";
				break; 
			}
			else
				result="Prime";
		return result;
	}*/	
	
	static int primeOrNot(int num){
		int factorCount = 0;
		for (int i=2;i<num/2;i++)
			factorCount=(num%i==0)?++factorCount:factorCount;
		return factorCount;
	}	
}	

 class SumPrimeASCIICharStrTest{
	
	public static void main(String...xxyy){
		//l,n,b is not prime
		SumPrimeASCIICharStr.sumPrimeASCIICharStr(xxyy);
	}
}
	

