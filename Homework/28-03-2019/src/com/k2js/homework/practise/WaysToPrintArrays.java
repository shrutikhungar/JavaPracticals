/*Requirement: to sort Int Array
*/

package com.k2js.homework.practise;

import java.util.Arrays;

class PrintArray{

	static void printArray(String[] strArr){
		//1
		System.out.println(Arrays.toString(strArr));//[h,k]
					
		//2
		Arrays.asList(strArr);
		System.out.println(Arrays.toString(strArr)); //[h,k]
		
		//4
		System.out.println(Arrays.deepToString(strArr));
		
		//5
		for(int i=0;i<=strArr.length-1;i++)
			System.out.println(strArr[i]);
		//6
		for(String ele:strArr)
			System.out.println(ele);
		
		//7
		Arrays.stream(strArr).forEach((str)->System.out.println(str));
		
		//8
		Arrays.stream(strArr).forEach(System.out::println);	
	}
}

class PrintArrayTest{
	
	public static void main(String...xxyy){
			
		PrintArray.printArray(new String[]{"hh","k"});		
	}
}