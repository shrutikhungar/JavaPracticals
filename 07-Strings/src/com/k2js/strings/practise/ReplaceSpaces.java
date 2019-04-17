//Requirement: Replace the spaces with blank. "Hello   java    selenium" change it into "Hello Java Selenium"

package com.k2js.string.practise;

class ReplaceSpaces{
	
	static String replaceSpaces(String s){
		return s.replace(" ","");
	}
}

class ReplaceTest{
	
	public static void main(String...ss){
		String str=ReplaceSpaces.replaceSpaces("Hello   Java   Selenium");
		System.out.println(str);
	}
}