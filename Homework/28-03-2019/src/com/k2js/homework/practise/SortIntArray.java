/*Requirement: to sort Int Array
*/

package com.k2js.homework.practise;

import java.util.Arrays;

class SortIntArray{
	
	static void sortIntArray(int[] intArr){
		System.out.println(Arrays.toString(intArr));
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
	}
}

class SortIntArrayTest{
	
	public static void main(String...xxyy){
		SortIntArray.sortIntArray(new int[]{5,7,2,9,3});		
	}
}