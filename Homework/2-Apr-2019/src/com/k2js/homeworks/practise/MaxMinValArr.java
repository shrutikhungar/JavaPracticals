//Requirement: Min and Max value array

package com.k2js.homeworks.practise;

class MaxMinValArr{
		
	static void getMaxVal(int[] intArr){
		int maxVal=intArr[0];
		for(int i=0;i<=intArr.length-1;i++){
			if(intArr[i]>maxVal);
			maxVal=intArr[i];
		}
		System.out.println(maxVal);
	}
		
	static void getMinVal(int[] intArr){
		int minVal=intArr[0];
		for(int j=0;j<=intArr.length-1;j++){	
		if(intArr[j]<minVal);
			minVal=intArr[j];
		}
		System.out.println(minVal);
	}
}

class MaxMinValArrTest{
	public static void main(String...xxyy){
		MaxMinValArr.getMaxVal(new int[]{2,4,6,7});
		MaxMinValArr.getMinVal(new int[]{2,4,6,7});
	}
}