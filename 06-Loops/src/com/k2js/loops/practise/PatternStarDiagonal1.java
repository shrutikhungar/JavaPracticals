/*Requirement:


	
*/

package com.k2js.loops.practise;

class PatternStarDiagonal1{
	
	static void patternStarDiagonal1(){
		for(int row=1;row<=5;row++){
			
			for(int col=0;col<=5-row;col++){
				
				if(col<=4-row)
					System.out.print(" ");
				else	 
					System.out.print((char)(col+65));
			}
			System.out.println();
		}
	}
}

class PatternStarDiagonal1Test{
	
	public static void main(String...xxyy){
		PatternStarDiagonal1.patternStarDiagonal1();
	}
}