//Requirement: to check weather two arrays are equal or not

package com.k2js.homeworks.practise;

class CheckTwoArrEqual{
	
	static void checkTwoArrEqual(int[] intArr1,int[] intArr2){
		boolean result=java.util.Arrays.equals(intArr1,intArr2);
		System.out.println(result);
	}
}

class CheckTwoArrEqualTest{
	
	public static void main(String...xxyy){
		CheckTwoArrEqual.checkTwoArrEqual(new int[]{1,2,4,5},new int[]{1,2,4,6});
	}
}