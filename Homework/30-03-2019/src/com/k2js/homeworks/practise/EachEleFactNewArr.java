/*Requirement Each elemen factor store new array*/

package com.k2js.homeworks.practise;

class EachEleFactStoreNewArr{
	
	static void eachEleFactStoreNewArr(int...intOldArr){
		//declare a new array
		int[] intNewArr=null;
		int factCount=0;
		//find out the length to be kept for new array
		System.out.println(java.util.Arrays.toString(intOldArr));
		for(int intOldArrEle:intOldArr){
			for(int i=1;i<=intOldArrEle;i++){
				if(intOldArrEle%i==0)
					factCount++;
			}
		}
		System.out.println(factCount);
		
		//create new array
		intNewArr=new int[factCount];
		
		//index of new array
		int index=0;
		
		//insert elements in new array
		for(int intOldArrEle:intOldArr){
			for(int i=1;i<=intOldArrEle;i++){
				if(intOldArrEle%i==0)
					intNewArr[index++]=i;
			}
		}
		System.out.println(java.util.Arrays.toString(intNewArr));

	}
}

class EachEleFactStoreNewArrTest{
	
	public static void main(String...xxyy){
		EachEleFactStoreNewArr.eachEleFactStoreNewArr(new int[]{5,8,9});
	}
}