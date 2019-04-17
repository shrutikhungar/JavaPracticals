//Requirement: to find the bbiggest of even number sum and sum of add numbers

package com.k2js.arrays.practise;

class SumEvenSumOddBiggest{
	
	static void sumEvenSumOddBiggest(int[] intArr){
		int evenSum=0,oddSum=0;
		for(int intArrEle:intArr){
			if(intArrEle%2==0)
				evenSum+=intArrEle;
			else if((intArrEle%2)!=0)
				oddSum+=intArrEle;
		}
		if(evenSum>oddSum)
				System.out.println("Even Sum is bigger: "+evenSum);
		else
			System.out.println("Odd Sum is bigger: "+oddSum);
	}
}

class SumEvenSumOddBiggestTest{
	
	public static void main(String...xxyy){
		SumEvenSumOddBiggest.sumEvenSumOddBiggest(new int[]{1,2,3,4,3,7,9,2});
	}
}