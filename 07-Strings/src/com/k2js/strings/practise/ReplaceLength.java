//Requirement: to replace the character with space and find out length

package com.k2js.string.practise;
 
class ReplaceLen{
	static void replaceLen(String str){
		System.out.println(str.length()-str.replace("l","").length());
	}
}

class ReplaceTest{
	public static void main(String...ss){
		ReplaceLen.replaceLen("Hello");
	}
}
