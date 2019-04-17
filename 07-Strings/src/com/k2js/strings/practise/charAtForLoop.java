//Requirement: Print the characters  using For loop

package com.k2js.string.practise;

class StringFor{
	static void charAtFor(String s){
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			System.out.print(c);
		}
	}
}

class StringTest{
	public static void main(String...ss){
		StringFor.charAtFor("JavaSelenium");
	}
}