//Requirement: To find sum of all the ineteger values in an array

package com.k2js.arrays.practise;

class ArrSumIntValues{
	
	static void arrSumIntValues(int...intArr){
		int sum=0;
		//Method 1
		for(int ele:intArr){
			sum+=ele;
		}
		
		System.out.println(sum);
	}
}

class ArrSumIntValuesTest{
	
	public static void main(String...xxyy){
		ArrSumIntValues.arrSumIntValues(new int[]{1,2,4,5});
	}
}