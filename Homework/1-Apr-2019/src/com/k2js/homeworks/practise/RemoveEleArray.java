//Requirement : to remove an element frm an array

package com.k2js.homeworks.practise;

class RemoveEleArray{
	
	static int getIndexEleToRem(int[] intArr,int eleToRem){
		int index =0;
		for(int i=0;i<=intArr.length-1;i++){
			if(intArr[i]==eleToRem)
				index=i;
		}
		return index;
	}
	
	static void removeEleArray(int[] intArr,int eleToRem){
		int index=RemoveEleArray.getIndexEleToRem(intArr,eleToRem);
		int[] intTempArr=new int[intArr.length-1];
		int j=0;
		for(int i=0;i<=intArr.length-1;i++){
			if(i!=index){
				intTempArr[j++]=intArr[i];
			}
		}
		System.out.println(java.util.Arrays.toString(intTempArr));
	}
}

class RemoveEleArrayTest{
	
	public static void main(String...xxyy){
		RemoveEleArray.removeEleArray(new int[]{44,77,99},44);
	}
}