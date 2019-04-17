//requirement: to store even numbers in the new array

package com.k2js.arrays.practise;

class StoreEvenNumNewArray{
	
	static int[] storeEvenNumNewArray(final int[] intOldArr){
		int oldArrSize=0;
		
		//finding size of old array for only even numbers
		for(int intOldArrEle:intOldArr)
			if(intOldArrEle%2==0)
				oldArrSize++;
		
		//creating new array with old array size
		int[] intNewEvenArr=new int[oldArrSize];
		
		//creating index of new array;
		int index=0;
		
		//inserting values into array
		for(int intOldArrEle:intOldArr){
			if(intOldArrEle%2==0)
				intNewEvenArr[index++]=intOldArrEle;
		}
		return intNewEvenArr;
	}
}

class StoreEvenNumNewArrayTest{
	public static void main(String...xxyy){
		int[] intNewEvenArr=StoreEvenNumNewArray.storeEvenNumNewArray(new int[]{8,53});
		System.out.println(java.util.Arrays.toString(intNewEvenArr));
	}
}