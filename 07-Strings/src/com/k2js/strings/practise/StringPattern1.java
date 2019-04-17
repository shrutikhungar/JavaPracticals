//INCOMPLETE
/*Requirement: to print below pattern
    H
   HE
  HEL
 HELL
HELLO
*/
package com.k2js.strings.practise;

class StringPattern1{
	
	static void stringPattern1(String str){
		int posToPrint=str.length()-1,counter=0;
		for(int i =0;i<str.length();i++){
			System.out.print(" ");
			if(i==posToPrint-1 && counter<str.length()){		
				System.out.println(str.substring(0,counter+1));
				i=++counter;
				posToPrint--;
			}
			System.out.println(str.substring(0,i+1));
		}		
	}
}

class StringPattern1Test{
	
	public static void main(String...xxyy){
		StringPattern1.stringPattern1("HELLO");
	}
}