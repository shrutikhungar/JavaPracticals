//requirement: to print characters in ascending order 

package com.k2js.strings.practise;

class PrintCharAscOrder{
	
	static char smallestChar(String str){
		char smallestChar=str.charAt(0);
		for(int i=0;i<=str.length()-1;i++){
			char c = str.charAt(i);
			smallestChar=(c<smallestChar)?c:smallestChar;
		}
		return smallestChar;
	}
	
	static void printAsceChar(String str){
		String originalStr=str;
		for(;str.length()!=0;){
			char smallestChar=PrintCharAscOrder.smallestChar(str);
			str=str.replace(smallestChar+"","");
			for(int j=0;j<((originalStr.length()-originalStr.replace(smallestChar+"","").length()));j++)
				System.out.print(smallestChar);				
		}		
	}
}

class PrintCharAscOrderTest{
	public static void main(String...str){
		PrintCharAscOrder.printAsceChar("hello");
	}
}