//Requirement: to store factor of each element of array in a new array

package com.k2js.arrays.practise;

class StoreEachEleFactNewArr{
	
	static void storeEachEleFactNewArr(int[] intArr){
		int index=0;
		int[] intNewArr=null;
		int lengthOfNewArr=0;
		
		//to find out new array should be created with what size
		for(int intArrEle:intArr){	
			for(int i=1;i<=intArrEle/2;i++){
				if(intArrEle%i==0)
					lengthOfNewArr++;
			}		
		}
		
		//create new array with size found above
		intNewArr=new int[lengthOfNewArr];
		
		//inserting values
		for(int intArrEle:intArr){	
			for(int i=1;i<=intArrEle/2;i++){
				if(intArrEle%i==0)
				intNewArr[index++]=i;
			}		
		}
		System.out.println(java.util.Arrays.toString(intNewArr));		
	}
}

class StoreEachEleFactNewArrTest{
	
	public static void main(String...xxyy){
		StoreEachEleFactNewArr.storeEachEleFactNewArr(new int[]{10,4});
	}
}