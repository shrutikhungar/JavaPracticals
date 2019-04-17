//Requirement: no of times each element appear in an array

package com.k2js.homeworks.practise;

class NoOfTimesEachEleAppear{
	
	static int noOfTimeEleAppear(int[] intArr,int eleToFind){
		int count=0;
		for(int intArrEle:intArr){
			if(intArrEle==eleToFind)
				count++;
		}
		return count;
	}
	
	static void noOfTimeEachEleAppear(int[] intArr){
		for(int intArrEle:intArr){
			int count=NoOfTimesEachEleAppear.noOfTimeEleAppear(intArr,intArrEle);
			System.out.println(intArrEle+ " is appearing. "+count);
		}
	}
}

class NoOfTimesEachEleAppearTest{
	public static void main(String...xxyy){
		NoOfTimesEachEleAppear.noOfTimeEachEleAppear(new int[]{2,4,5,6,7,7,5});
	}
}