//Requirement to find sum of prime number in an array

package com.k2js.homeworks.practise;

class SumPrimeArr{
	
	static String primeOrNot(int intArrEle){
		System.out.println(intArrEle);
		String primeOrNot="";
		int primeFact=0;
		for(int i=1;i<=intArrEle/2;i++){
			primeFact=(intArrEle%i==0)?++primeFact:primeFact;
			System.out.println(primeFact);
		}
		return primeFact;
	}
	
	static void sumPrimeArr(int[] intArr){
		int sum=0;
		for(int intArrEle:intArr){
			int primeFact=SumPrimeArr.primeOrNot(intArrEle);
			if(primeFact.equals("Prime")){
				sum+=intArrEle;
			}
		}
		System.out.println(sum);
	}
}

class SumPrimeArrTest{
	
	public static void main(String...xxyy){
		SumPrimeArr.sumPrimeArr(new int[]{11,11,7});
	}
}