//Requirment: how many times each values of array is getting repeated

package com.k2js.arrays.practise;

class NoOfTimesEachValRepeat{
	
	static void noOfTimeEachValRepeat(int[] intArr){
		
		for(int intArrEle:intArr){
			int count=0;
			int valToFind=intArrEle;
			for(int intArrEle1:intArr){
				if (intArrEle1==valToFind)
				count++;
			}
			System.out.println(intArrEle+ " is getting repeated "+count+ " times");
		}
	}
}

class NoOfTimesEachValRepeatTest{
	public static void main(String...xxyy){
		NoOfTimesEachValRepeat.noOfTimeEachValRepeat(new int[]{3,3,6,6,6,7});
	}
}