//Req: to find out the nth biggest num from array

package com.k2js.homeworks.practise;

class NthBiggestNum{
	
	static int biggestNum(int[] intArr){
		int biggestNum=0;
		for(int intArrEle:intArr){
			biggestNum=intArrEle>biggestNum?intArrEle:biggestNum;
		}
		return biggestNum;
	}
	
	static int nthBiggestNum(int[] intArr, int nthBiggest){
		int biggestNum=NthBiggestNum.biggestNum(intArr);
		System.out.println(biggestNum);
		for(int i=1;i<nthBiggest;i++){
			int nthBiggestNum=0;
			for(int intArrEle:intArr){
				nthBiggestNum=(intArrEle<biggestNum && intArrEle>nthBiggestNum)?intArrEle:nthBiggestNum;
			}
			biggestNum=nthBiggestNum;
			nthBiggestNum=0;
		}
		
		
		return biggestNum;
	}
}

class NthBiggestNumTest{
	public static void main(String...xxyy){
		int biggestNum=NthBiggestNum.nthBiggestNum(new int[]{34,66,88},1);
		System.out.println(biggestNum);
	}
}