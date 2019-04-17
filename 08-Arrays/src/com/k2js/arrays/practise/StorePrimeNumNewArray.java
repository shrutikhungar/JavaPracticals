//Requirement: to store prime numbers from old array to new Array

package com.k2js.arrays.practise;

class StorePrimeNumNewArray{
	
	static int[] storePrimeNumNewArray(int[] intOldArray){
		int intOldArraySize=0;
		for(int intOldArrayEle:intOldArray){
			
			int primeFact=0;
			for(int i=1;i<=intOldArrayEle/2;i++){
				if(intOldArrayEle%i==0){
					primeFact++;
				}
			}
			if(primeFact==1)
			{
				intOldArraySize++;
			}			
		}
		
		//to  create new array
		int[] intNewArray=new int[intOldArraySize];
		//to  create index
		int index=0;
		
		//to insert values
		for(int intOldArrayEle:intOldArray){
			int primeFact=0;
			for(int i=1;i<=intOldArrayEle/2;i++){
				if(intOldArrayEle%i==0){
					primeFact++;
				}
			}
			if(primeFact==1)
			{
				intNewArray[index++]=intOldArrayEle;
			}			
		}
		
		return intNewArray;
	}
}

class StorePrimeNumNewArrayTest{
	
	public static void main(String...xxyy){
		int[] intNewArray=StorePrimeNumNewArray.storePrimeNumNewArray(new int[]{13,37,8,9,3,2,7});
		System.out.println(java.util.Arrays.toString(intNewArray));
	}
}