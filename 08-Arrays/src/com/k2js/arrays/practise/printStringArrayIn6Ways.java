//requirement: To print String array in 6 ways
/*
1. Arrays.toString(strArr);
2. Arrays.deepToString(strArr);
3. Arrays.stream(strArr).forEach((str)
4. Arrays.stream(strArr).forEach((str)
4. Arrays.asList(strArr)
5. for-each enhanced
6. for index
*/
package com.k2js.arrays.practise;

import java.util.Arrays;

class printStringArray6Ways{
	
	static void stringArrayPrint(String[] strArr){
		System.out.println("1 way to print Array");
		System.out.println(Arrays.toString(strArr));
		System.out.println("2 way to print Array through lambda");
		Arrays.stream(strArr).forEach((str)->System.out.println(str));
		System.out.println("3rd way to print Array");
		Arrays.stream(strArr).forEach(System.out::println);
		System.out.println("5th way to print Array");
		System.out.println(Arrays.deepToString(strArr));
		System.out.println("6th way to print Array");
		for(int i=0;i<=strArr.length-1;i++)
			System.out.println(strArr[i]);	
		
		System.out.println("7th way to print Array");
		for(String str:strArr)
			System.out.println(str);
		
		System.out.println("8th way to print Array");
		System.out.println(Arrays.asList(strArr));
	}
}

class printStringArray6WaysTest{
	
	public static void main(String...xxyy){
		printStringArray6Ways.stringArrayPrint(new String[]{"AB","BC"});
	}
}