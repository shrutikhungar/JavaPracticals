//Requirement: No of times val appearing in an array

package com.k2js.homeworks.practise;

class NoOfTimesValAppear{
	
	static int noOfTimesValAppear(int[] intArr,int valToFind){
		int count=0;
		for(int intArrEle:intArr){
			if(intArrEle==valToFind)
				count++;
		}
		return count;
	}
}

class NoOfTimesValAppearTest{
	
	public static void main(String...xxyy){
		NoOfTimesValAppear.noOfTimesValAppear(new int[]{3,6,8,9,9},9);
	}
}