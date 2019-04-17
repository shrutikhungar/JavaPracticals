//requiremment: to print nth higest value in array

package com.k2js.arrays.practise;

class NthHigestValArray{

	static int higestValArray(int[] intArr){
		int highestVal=(intArr!=null)?intArr[0]:0;
		for(int intArrEle:intArr)
			highestVal=(intArrEle>highestVal)?intArrEle:highestVal;
		return highestVal;
	}
	
	static int nthHigestValArray(int[] intArr,int indxHigVal){
		int highestVal=NthHigestValArray.higestValArray(intArr);
		for(int i=1;i<indxHigVal;i++){			
			int nhighestVal=intArr[0];
			for(int intArrEle:intArr){		
				nhighestVal=(nhighestVal<intArrEle && intArrEle<highestVal)?intArrEle:nhighestVal;
			}
			highestVal=nhighestVal;
		}
		return highestVal;
	}
}

class NthHigestValArrayTest{
	
	public static void main(String...xxyy){
		int[] intArr={5,8,93,3};
		int highestVal=0;
		for(int nthHighest=1;nthHighest<=intArr.length;nthHighest++){
			highestVal= NthHigestValArray.nthHigestValArray(new int[]{4,7,9,2},nthHighest);
		}
		System.out.println(highestVal);
	}
}