//requirement: to print characters in ascending order

package com.k2js.homework.practise;

class PrintCharAscOrder{
	
	static char printCharAscOrder(String str){
		char smallestChar=str.charAt(0);
		for(int i=0;i<=str.length()-1;i++){
			char c = str.charAt(i);
			smallestChar=(c<smallestChar)?c:smallestChar;
		}
		return smallestChar;
	}
	
	static void printAsceChar(String str){
		for(;str.length()!=0;){
			char smallestChar=PrintCharAscOrder.printCharAscOrder(str);
			System.out.print(smallestChar);
			str=str.replace(smallestChar+"","");	
		}		
	}
}

class PrintCharAscOrderTest{
	public static void main(String...str){
		PrintCharAscOrder.printAsceChar("hello");
	}
}