//Requirement: Reverse the string using Substring:

package com.k2js.string.practise;

class ReversString{
	static void reversesub(String str){
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.substring(i,i+1));
		}
	}
}
class ReverseT{
	public static void main(String...s){
		ReversString.reversesub("Selenium");
	}
}