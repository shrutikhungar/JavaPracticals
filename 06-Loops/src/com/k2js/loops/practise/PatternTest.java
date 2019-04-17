/*Requirement : To print below pattern
 ****
  ***
   **
    *
*/

package com.k2js.loops.practise;

class PatternTest{
	
	static void patternTest(){
		
		for(int row=1;row<=5;row++){

			for(int space=4;space>=row-i;space--){
				System.out.print(" ");
			}
			for(int col=1;col<=;col++){
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}

class PatternTestTest{
	
	public static void main(String...xxyy){
		PatternTest.patternTest();
	}
}