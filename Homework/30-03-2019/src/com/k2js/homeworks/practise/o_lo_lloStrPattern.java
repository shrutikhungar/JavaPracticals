/*Requirement to print below

     o
    lo
   llo
  ello
 hello
*/

package com.k2js.homeworks.practise;

class Print_o_lo_llo_Pattern{
	
	static void print_o_lo_Pattern(String str){
		for(int i=str.length()-1;i>=0;i--){
			for(int space=0;space<=i;space++)
				System.out.print(" ");	
			String substr=str.substring(i,str.length());
			System.out.print(substr);
			System.out.println();
		}
	}
}

class Print_o_lo_llo_PatternTest{
	
	public static void main(String...xxyy){
		Print_o_lo_llo_Pattern.print_o_lo_Pattern("Hello");
	}
}