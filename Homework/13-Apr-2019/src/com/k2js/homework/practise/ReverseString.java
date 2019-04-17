//Requirement: to reverse a string in java

package com.k2js.homeworks.practise;

class StringReverse{
	String strRev(String str){
		String strRev="";
		for(int i=str.length()-1;i>=0;i--){
			strRev+=str.charAt(i);
		}
		return strRev;
	}
}

class StringReverseTest{
	public static void main(String...xxyy){
		String strRev=new StringReverse().strRev("Shruti");
		System.out.println(strRev);
	}
}