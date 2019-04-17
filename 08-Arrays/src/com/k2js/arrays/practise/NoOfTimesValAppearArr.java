//Requirement: to find out how many times a values in appearing in an array

package com.k2js.arrays.practise;

class NoOfTimeValAppear{
	
	static int noOfTimeValAppear(int[] intArr,int valToFind){
		int count=0;
		for(int intArrEle:intArr){
			if(intArrEle==valToFind)
				count++;
		}
		return count;
	}
}

class NoOfTimeValAppearTest{
	
	public static void main(String...xxyy){
		int count=NoOfTimeValAppear.noOfTimeValAppear(new int[]{4,66,88,99,66,66},66);
		System.out.println(count);		
	}
}