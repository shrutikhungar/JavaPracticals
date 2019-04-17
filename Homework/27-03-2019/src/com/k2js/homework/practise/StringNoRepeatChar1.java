/*Requirement: to print a string without repeating a character-METHOD2

*/
package com.k2js.strings.practise;

class StringNoRepeatChar1{
	
	static void stringNoRepeatChar(String str){
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(!str.substring(0,i).contains(c+""))
				System.out.print(c);
		}
	}
}

class StringNoRepeatChar1Test{
	
	public static void main(String...xxyy){
		StringNoRepeatChar1.stringNoRepeatChar("dwoamsflllg");
	}
}