//requirement: to return array value

package com.k2js.arrays.practise;

class ReturnArrayVal{
	
	static int[] returnArrVal(){
		int[] intArr=null;
		intArr=new int[3];		
		System.out.println(java.util.Arrays.toString(intArr));
		intArr[0]=23;
		intArr[1]=77;
		return intArr;
	}
}

class ReturnArrayValTest{
	public static void main(String...xxyy){
		int[] intArr=ReturnArrayVal.returnArrVal();
		System.out.println(java.util.Arrays.toString(intArr));
	}
}

