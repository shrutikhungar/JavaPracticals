//Requirement Store alternate elem in new array

package com.k2js.homeworks.practise;

class StoreAlterEleNewArr{
	
	static void storeAlterEleNewArr(int...intOldArr){
		//declare a new array
		int[] intNewArr=null;
		int countOfOldArrEle=0;
		int lengthNewArr=0;
		
		//find length to be kept for new array
		for(int intOldArrEle:intOldArr)
			countOfOldArrEle++;
		if(countOfOldArrEle%2==0)
			lengthNewArr=intOldArr.length/2;
		else 
			lengthNewArr=intOldArr.length/2+1;
		
		//Create a new array
		intNewArr=new int[lengthNewArr];
		
		//setting index for new array
		int index=0;
		
		//inserting elements in new array
		for(int i=0;i<=intOldArr.length-1;i+=2)
			intNewArr[index++]=intOldArr[i];	

		System.out.println(java.util.Arrays.toString(intNewArr));	
	}
}

class StoreAlterEleNewArrTest{
	
	public static void main(String...xxyy){
		StoreAlterEleNewArr.storeAlterEleNewArr(new int[]{5,9});
	}
}