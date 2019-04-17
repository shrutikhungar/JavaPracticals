//Requiremnet: to find nth biggest numn from an array

package com.k2js.homeworks.practise;

class ReturnNthBiggestNumArray{
	
	static void returnNthBiggestNumArray(int[] intArr,int nthBig){
	}
	
	static void getBiggest(){
	}
	/*
	static void returnNthBiggestNumArray(int[] intArr,int nthBig){
		int biggestNum=0;
		int nthBiggest=intArr[0];
		for(int intArrEle:intArr){
			biggestNum=(intArrEle>biggestNum)?intArrEle:biggestNum;	
		}
		System.out.println(biggestNum);
		for(int i=1;i<=nthBig;i++){
			for(int intArrEle:intArr){
				nthBiggest=(intArrEle>nthBiggest && intArrEle<biggestNum)?intArrEle:nthBiggest;
			}				
			biggestNum=nthBiggest;
		}
		System.out.println(nthBiggest);
	}*/
	
	
}

class ReturnNthBiggestNumArrayTest{
	
	public static void main(String...xxyy){
		ReturnNthBiggestNumArray.returnNthBiggestNumArray(new int[]{34,78,25},3);
	}		
}