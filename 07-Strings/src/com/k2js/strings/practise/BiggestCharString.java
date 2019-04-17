//requirement: To find Biggest character of String

package com.k2js.strings.practise;

class BiggestCharString{
	
	static void biggestCharString(String str){
		char bigChar = 'A';
		for(int i=0;i<=str.length()-1;i++){
			char c=str.charAt(i);
			bigChar= (bigChar<str.charAt(i))?c:bigChar;
		}
		System.out.println(bigChar);
	}
}

class BiggestCharStringTest{
	
	public static void main(String...xxyy){
		BiggestCharString.biggestCharString("KeysToJava");
	}
}