//Requirement to reverse a string

package com.k2js.homeworks.practise;

class StringReverse{
	String strRev(String str){
		String strRev="";
		char[] charArr=str.toCharArray();
		for(int i=charArr.length-1;i>=0;i--)
			strRev+=charArr[i];
		return strRev;
	}
}

class StringReverseTest{
	public static void main(String...xxyy){
		String revStr=new StringReverse().strRev("abcd");
		System.out.println(revStr);
	}
}