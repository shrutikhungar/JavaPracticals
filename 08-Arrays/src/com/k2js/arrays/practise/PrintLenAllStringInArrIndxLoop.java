//Requirement: To print the sum of length of all strings in array using index loop

package com.k2js.arrays.practise;

class SumAllStrLenArray{
	
	static void sumAllStrLenArray(String[] strArr){
		int sum=0;
		for (int i=0;i<=strArr.length-1;i++){
			sum+=strArr[i].length();
		}
		System.out.println(sum);
	}
}

class SumAllStrLenArrayTest{
	
	public static void main(String...xxyy){
		SumAllStrLenArray.sumAllStrLenArray(new String[]{"hello","keys","java","selenium"});
	}
}
