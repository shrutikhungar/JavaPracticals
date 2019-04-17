//Requirement Store prime num elem in new array

package com.k2js.homeworks.practise;

class StorePrimeNumNewArr{
	
	static void storePrimeNumNewArr(int...intOldArr){
		//declare a new array
		int[] intNewArr=null;
		int intNewArrLen=0;
		
		//to find out the length of new array
		for(int intOldArrEle:intOldArr){
			int primeNumFact=0;
			for(int i=1;i<=intOldArrEle/2;i++)
				primeNumFact=(intOldArrEle%i==0)?++primeNumFact:primeNumFact;
			if(primeNumFact==1)
				intNewArrLen++;
		}
		System.out.print(intNewArrLen);
		
		//creating index for new array
		int index=0;
		
		//create new array
		intNewArr=new int[intNewArrLen];
		
		//inserting elements in new array
		for(int intOldArrEle:intOldArr){
			int primeNumFact=0;
			for(int i=1;i<=intOldArrEle/2;i++)
				primeNumFact=(intOldArrEle%i==0)?++primeNumFact:primeNumFact;
			if(primeNumFact==1)
				intNewArr[index++]=intOldArrEle;
		}
		
		System.out.println(java.util.Arrays.toString(intNewArr));	
	}
}

class StorePrimeNumNewArrTest{
	
	public static void main(String...xxyy){
		StorePrimeNumNewArr.storePrimeNumNewArr(new int[]{5,9,3,8,10,37,7,113});
	}
}