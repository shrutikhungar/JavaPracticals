//Requirement: To insert values into arrays

package com.k2js.arrays.practise;

class InsertValIntoArray{
	
	static void insertValIntoArray(){
		int[] intArr=new int[2];
		System.out.println(java.util.Arrays.toString(intArr));
		intArr[0]=23;
		intArr[1]=87;
		//public static java.lang.String toString(int[]); //input can be char[],byte[],long[],float[],boolean[],short[],double[],object[]
		System.out.println(java.util.Arrays.toString(intArr));
		System.out.println(intArr[0]+intArr[1]);		
	}
}

class InsertValIntoArrayTest{
	public static void main(String[] xxyy){
		InsertValIntoArray.insertValIntoArray();
	}
}