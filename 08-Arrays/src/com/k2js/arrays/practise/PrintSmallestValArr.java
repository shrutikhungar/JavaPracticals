//Requirement: to print smallest values in an array

package com.k2js.arrays.practise;

class PrintSmallestValArr{
	
	static int printSmallestValArr(int[] intArr){
		int smallestVal=intArr[0];
		for(int intArrEle:intArr){
			smallestVal=intArrEle<smallestVal?intArrEle:smallestVal;
		}
		return smallestVal;
	}
}

class PrintSmallestValArrTest{
	
	public static void main(String...xxyy){
		int smallestVal=PrintSmallestValArr.printSmallestValArr(new int[]{34,833,229});
		System.out.println(smallestVal);
	}	
}