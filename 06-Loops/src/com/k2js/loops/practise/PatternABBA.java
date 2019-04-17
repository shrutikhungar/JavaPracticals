/*Requirement : To print below pattern
    A
   BA
  CBA
 DCBA
EDCBA
*/

package com.k2js.loops.practise;

class PatternABBA{
	
	static void patternABBA(){
		
		for(int row=1;row<=5;row++){
			for(int space=1;space<=5-row;space++){
				System.out.print("*");
			}
			for(int i=row;i>=1;i--){
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
	}
}

class PatternABBATest{
	
	public static void main(String...xxyy){
		PatternABBA.patternABBA();
	}
}