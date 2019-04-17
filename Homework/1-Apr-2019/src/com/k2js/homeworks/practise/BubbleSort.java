//Requirement: to sort using bubble sort

package com.k2js.homeworks.practise;

class BubbleSort{
	
	static void bubbleSort(int[] intArr){
		for(int i=0;i<intArr.length-1;i++){
			int temp=0;
			for(int j=0;j<intArr.length-1-i;j++){
				if(intArr[j]>intArr[j+1]){
					temp=intArr[j];
					intArr[j]=intArr[j+1];
					intArr[j+1]=temp;
				}					
			}
			System.out.println(java.util.Arrays.toString(intArr));
		}
	}
}

class BubbleSortTest{
	
	public static void main(String...xxyy){
		BubbleSort.bubbleSort(new int[]{3,2,4,1});
	}
}