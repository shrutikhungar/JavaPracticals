//Requirement: to sort String Array

package com.k2js.homework.practise;

import java.util.Arrays;

class SortStrArray{
	
	static void sortStrArray(String...strArr){
		System.out.println(Arrays.toString(strArr));
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
	}
}

class SortStrArrayTest{
	
	public static void main(String...xxyy){
		SortStrArray.sortStrArray(new String[]{"Sh","Vas","Nysa"});		
	}
}