/*Requirement: to print a string without repeating a character

*/
package com.k2js.strings.practise;

class StringNoRepeatChar{
	
	static void stringNoRepeatChar(String str){
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(!str.substring(0,i).contains(c+""))
				System.out.print(c);
		}
	}
}

class StringNoRepeatCharTest{
	
	public static void main(String...xxyy){
		StringNoRepeatChar.stringNoRepeatChar("key2javaselenium");
	}
}