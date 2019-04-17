/*Requirement:

*
 *
  *
   *
    *
	
*/

package com.k2js.loops.practise;

class PatternStarDiagonal{
	
	static void patternStarDiagonal(){
		for(int row=1;row<=5;row++){
			
			for(int col=1;col<=row;col++){
				
				if(col<=row-1){
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}

class PatternStarDiagonalTest{
	
	public static void main(String...xxyy){
		PatternStarDiagonal.patternStarDiagonal();
	}
}