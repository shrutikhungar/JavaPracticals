//Requirmeent: to print sum of length of all the strings in an array using enhanced for loop

package com.k2js.arrays.practise;

class SumStrLengthArrayEnhLoop{
	
	static void sumStrLengthArrayEnhLoop(String...strArr){
		int sum=0;
		for(String str:strArr)
			sum+=str.length();		
		System.out.println(sum);
	}
	
}

class SumStrLengthArrayEnhLoopTest{
	
	public static void main(String[] strArr){
		SumStrLengthArray.sumStrLenArray();
	}
}