//Requirement: To find out biggest number from int array

package com.k2js.homework.practise;

class BiggestIntArray{
	
	static int biggestIntArray(int[] intArr){
		int biggestIntEle=0;
		for(int ele:intArr)
			biggestIntEle=(ele>biggestIntEle)?ele:biggestIntEle;
		return biggestIntEle;
	}
}

class BiggestIntArrayTest{
	
	public static void main(String[] strArr){		
		int biggestIntEle=BiggestIntArray.biggestIntArray(new int[]{56,83,23});
		System.out.println(biggestIntEle);
	}
}