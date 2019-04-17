/*Requirement: to find first 3 letter and last 3 letter of string and reverse and concatenate
    H
   HE
  HEL
 HELL
HELLO
*/
package com.k2js.strings.practise;

class StringPattern{
	
	static void stringPattern(String str){
		int posToPrint=str.length();
		for(int i =0;i<str.length();i++){
			for(int j =i;j<str.length()-1;j++){
				System.out.print(" ");
			}
			System.out.println(str.substring(0,i+1));
		}		
	}
}

class StringPatternTest{
	
	public static void main(String...xxyy){
		StringPattern.stringPattern("HELLO");
	}
}