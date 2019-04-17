//Requirement: find the bigget char using ascii value

package com.k2js.string.practise;

class BiggestChar{
	
	static void bigchar(String str){
		char maxchar='0';
		for(int i=0;i<str.length()-1;i++){
			char c1=str.charAt(i);
			maxchar=(maxchar<c1)?c1:maxchar;
		}
		System.out.println(maxchar);
	}
}
class BiggestTest{
	
	public static void main(String...ss){
		BiggestChar.bigchar("Keys2JavaSelenium");
	}
}