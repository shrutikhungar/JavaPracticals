//Requirement: to remove a specific eleement from an array

package com.k2js.homeworks.practise;

class ArrayRemEle{
	
	static void arrayRemEle(int[] intArr,int eleToRem){
		System.out.println(java.util.Arrays.toString(intArr));
		int[] intNewArr=null;
		int count=0;
		//finding size to be kept for new array
		for(int intArrEle:intArr){
			if(intArrEle==eleToRem)
				count++;
		}
		System.out.println(count);
		
		//creating a new array
		intNewArr=new int[intArr.length-count];
		
		//creating index for new array
		int index=0;
		
		//inserting values
		for(int intArrEle:intArr){
			if(intArrEle!=eleToRem)
				intNewArr[index++]=intArrEle;
		}
		System.out.println(java.util.Arrays.toString(intNewArr));
	}
}

class ArrayRemEleTest{
	
	public static void main(String...xxyy){
		ArrayRemEle.arrayRemEle(new int[]{2,3,3,3,4,5},3);
	}
}