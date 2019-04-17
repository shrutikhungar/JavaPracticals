//Requirement: to print sum of all the ascii value of prime characters in String

package com.k2js.homework.practise;

class SumPrimeASCIICharStr{
	
	static void sumPrimeASCIICharStr(String[] strArr){
		String result="";
		int sum=0;
		for(String strEle:strArr){
			char[] charArr=strEle.toCharArray();
			for(char charEle:charArr){
				result=SumPrimeASCIICharStr.primeOrNot((int)(charEle));
				System.out.println(result+":"+charEle);
				if(result.equals("Prime"))
					sum+=(int)(charEle);
			}
		}
		System.out.println(sum);		
	}
	
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
	}	
}	

 class SumPrimeASCIICharStrTest{
	
	public static void main(String...xxyy){
		//l,n,b is not prime
		SumPrimeASCIICharStr.sumPrimeASCIICharStr(new String[]{"an","gmb","kl"});
	}
}
	

