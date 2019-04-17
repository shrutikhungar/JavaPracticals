//Requirement: To remove array values

package com.k2js.arrays.practise;

class RemoveArrayValues{
	
	static int getIndexOfValToRem(int[] intArr,int valToRem){
		int index=0;
		for(int i=0;i<intArr.length;i++){
			if(intArr[i]==valToRem){
				index=i;
				break;
			}
		}
		return index;
	}
	
	static int[] removeArrayValues(int[] intArr,int valToRem){
		int index=RemoveArrayValues.getIndexOfValToRem(intArr,valToRem);	
		System.out.println(index);
		int[] intTempArr=new int[intArr.length-1];
		int j=0;
		for(int i=0;j<intArr.length-1;i++){
			if(index!=i)
				intTempArr[j++]=intArr[i];	
		}		
		return (index>0)?intTempArr:intArr;
	}
}

class RemoveArrayValuesTest{
	public static void main(String...args){
		int[] intArr=new int[]{3,68,8};
		System.out.println("Before Removing: "+java.util.Arrays.toString(intArr));
		intArr=RemoveArrayValues.removeArrayValues(intArr,9);
		System.out.print("After Removing:");
		for(int intArrEle:intArr)
			System.out.print(intArrEle+",");
		
	}
}