//requiremment: to print elements of an array in sorting order

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
	
	static  int index=0,sa[];
	static void PrintGivenVal(int intArr,int v){
		for(int i:arr){
			if(i==v)
				sa[index++]=v;
		}
	}
	
}

class NthHigestValArrayTest{
	
	public static void main(String...xxyy){
		int[] intArr={5,8,93,3};
		int[] sa=intArr;
		
		for(int nthHighest=1;nthHighest<=intArr.length;nthHighest++){
			printGivenVal(intArr,nthHigestValArray(intArr,nthHighest));
		}
	}
}