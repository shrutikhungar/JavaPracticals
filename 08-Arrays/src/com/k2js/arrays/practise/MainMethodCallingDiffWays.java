//requirement: To call main method in different ways

package com.k2js.arrays.practise;

class StringPrint{
	
	//1 Way to make argument optional
	public static void stringPrint(String...strArr){
		Arrays.toSting(strArr);
	}
}

class StringPrintTest{
	
	public static void main(String...xxyy){
		StringPrint.stringPrint(new String[]{"A","B"});
	}
}
