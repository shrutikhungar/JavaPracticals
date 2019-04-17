//Requirement: To check whether string is Upper case or Lower case

package com.k2js.string.practise;

class LetterLower{
	
	static String LetterLowerUpper(String s){
		char firstChar=s.charAt(0);
		return (firstChar < 'Z')? "Upper" : "Lower";
	}
}

class LetterTest{
	
	public static void main(String...ss){
		String str=LetterLower.LetterLowerUpper("hello");
		System.out.println(str);
	}
}