/*Requirement: to print below pattern
     *
    * *
   * * *
  * * * *
*/
package com.k2js.loops.practise;

class PatternStarPyramid1{
	
	static void patternStarPyramid1(){
		for(int row=1;row<=4;row++){
			for(int space=4;space>=row;space--){
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int row=1;row<=4;row++){
			for(int col=1;col<=row;col++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

class PatternStarPyramid1Test{
	
	public static void main(String...xxyy){
		PatternStarPyramid1.patternStarPyramid1();
	}
}