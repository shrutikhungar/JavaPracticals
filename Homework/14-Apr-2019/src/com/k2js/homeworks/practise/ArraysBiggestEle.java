//Requirement: to find out biggest element from an array

package com.k2js.homeworks.practise;

class NthArrBiggest{
	
	static int biggestVal(int[] intArr){
		int biggest=0;
		for(int intArrEle:intArr){
			biggest=(intArrEle>biggest)?intArrEle:biggest;
		}
		return biggest;
	}
	
	static void NthBiggest(int[] intArr, int nthBig){
		int biggest=NthArrBiggest.biggestVal(intArr);
		System.out.println(biggest);
		
		for(int i=1;i<nthBig;i++)	{
			int nthBiggest=0;
			for(int intArrEle:intArr){
				nthBiggest=(intArrEle<biggest && intArrEle>nthBiggest)?intArrEle:nthBiggest;
			}
			System.out.println(nthBiggest);
			biggest=nthBiggest;
			nthBiggest=0;
		}
	}
}

class NthArrBiggestTest{
	public static void main(String...xxyy){
		NthArrBiggest.NthBiggest(new int[]{23,45,67,34},4);
	}
}