//Requirement: Print like this
//      H
//    H E
//  H E L
//H E L L

package com.k2js.string.practise;

class Pattern{
	static void m(String str){
		int ptp=str.length()-1,count=0;
		for(int i=0;i<str.length();i++){
			System.out.println("");
			if(i==ptp-1 && count<str.length()){
				System.out.println(str.substring(0,count+1));
				i=++count;
				ptp--;
			}
		}
	}
}

class PatternTest{
	
	public static void main(String...s){
		Pattern.m("Hello");
	}
}