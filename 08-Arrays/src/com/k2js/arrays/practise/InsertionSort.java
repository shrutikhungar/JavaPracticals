/*Requirement: insertion sort
Sorting way 1: bubble sort
Sorting way 2: insertion sort
*/

package com.k2js.arrays.practise;

class InsertionSort{
	
	static void insertionSort(int[] intArr){
		for(int i=1;i<intArr.length;i++){
			int key=intArr[i];
			for(j=i-1;j>=0 && intArr[j]>key;j--){
				intArr[j+1]=intArr[j];
				System.out.println("Inner step: "+java.util.Arrays.toString(intArr));
			}
			intArr[j+1]=key;
			System.out.println("Outer step: "+java.util.Arrays.toString(intArr));
		}		
	}
}

class InsertionSortTest{
	
	public static void main(String...xxyy){
		InsertionSort.insertionSort(new int[]{6,8,3,2,1});
	}
}