/*Requirement: to create below string pattern
    H
   HE
  HEL 
*/

package com.k2js.homework.practise;

class StringPattern{
	
	static void stringPattern(String str){
		int posToPrint=str.length();
		for(int i =0;i<str.length();i++){
			
			System.out.println(str.substring(0,i+1));
		}	
	}
}

class StringPatternTest{
	
	public static void main(String...xxyy){
		StringPattern.stringPattern("hello");		
	}
}