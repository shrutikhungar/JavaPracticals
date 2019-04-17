//Requirement: sort array ad find nth hightest element

package com.k2js.homeworks.practise;

class ArrSortNthHighest{
	
	static void arrSortNthHighest(int[] intArr,int nthBiggest){
		java.util.Arrays.sort(intArr);
		System.out.print(java.util.Arrays.toString(intArr));
		nthBiggest=intArr[nthBiggest-1];
		System.out.print(nthBiggest);
	}
}

class ArrSortNthHighestTest{
	
	public static void main(String...xxyy){
		ArrSortNthHighest.arrSortNthHighest(new int[]{3,6,7,9},4);
	}
}