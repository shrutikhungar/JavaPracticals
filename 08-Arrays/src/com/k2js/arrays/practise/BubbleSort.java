//Requirement: to sort an array

package com.k2js.arrays.practise;

class BubbleSort{
	
	static void bubbleSort(int[] intArr){
		for(int i=0;i<intArr.length-1;i++){
			for(int j=0;j<intArr.length-i-1;j++){
				if(intArr[j]>intArr[j+1]){
					int temp=intArr[j];
					intArr[j]=intArr[j+1];
					intArr[j+1]=temp;
				}
			}
		}
		System.out.println(java.util.Arrays.toString(intArr));
	}
}

class BubbleSortTest{
	public static void main(String...xxyy){
		BubbleSort.bubbleSort(new int[]{3,8,5,2});
	}
}