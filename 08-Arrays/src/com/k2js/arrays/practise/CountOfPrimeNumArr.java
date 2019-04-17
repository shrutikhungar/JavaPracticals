//Requirement: to count how many prime numbers are there in an array

package com.k2js.arrays.practise;

class CountPrimeNumArr{
	
	static int countPrimeNumArr(int[] intArr){
		int count=0;
		for(int intArrEle:intArr){
			int primeFact=0;
			for(int i=1;i<=intArrEle/2;i++){
				if(intArrEle%i==0)
					primeFact++;
			}
			if(primeFact==1)
				count++;
		}
		return count;
	}
}

class CountPrimeNumArrTest{
	
	public static void main(String...xxyy){
		int count = CountPrimeNumArr.countPrimeNumArr(new int[]{33,7,3,4,6,8});
		System.out.println(count);
	}
}