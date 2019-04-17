//requirement: to print characters in ascending order without repeating char

package com.k2js.strings.practise;

class PrintCharAscOrderNoRepeat{
	
	static char smallestChar(String str){
		char smallestChar=str.charAt(0);
		for(int i=0;i<=str.length()-1;i++){
			char c = str.charAt(i);
			smallestChar=(c<smallestChar)?c:smallestChar;
		}
		return smallestChar;
	}
	
	static void printAsceChar(String str){
		for(;str.length()!=0;){
			char smallestChar=PrintCharAscOrder.smallestChar(str);
			System.out.print(smallestChar);
			str=str.replace(smallestChar+"","");	
		}		
	}
}

class PrintCharAscOrderNoRepeatTest{
	public static void main(String...str){
		PrintCharAscOrderNoRepeat.printAsceChar("hello");
	}
}