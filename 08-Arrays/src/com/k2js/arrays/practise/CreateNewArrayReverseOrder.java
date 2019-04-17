//Requirement: to create a  new array from old array with vallues in reverse order

package com.k2js.arrays.practise;

class CreateNewArrValInReverse{
	
	static void createNewArrValInReverse(int[] intOldArr){
		//declaring variable of new array
		int[] intNewArr=null;
		//checking size of old array
		int oldArrSize=intOldArr.length;
		//creating new array with size same as old array
		intNewArr=new int[oldArrSize];
		//creating index for new array
		int index=0;
		//inserting values into new array in reverse order
		for(int i=oldArrSize-1;i>=0;i--)
			intNewArr[index++]=intOldArr[i];
		//printing new array
		for(int intNewArrEle:intNewArr)
			System.out.println(intNewArrEle);		
	}
}

class CreateNewArrValInReverseTest{
	
	public static void main(String...xxyy){
		CreateNewArrValInReverse.createNewArrValInReverse(new int[]{23,4,6});
	}
}