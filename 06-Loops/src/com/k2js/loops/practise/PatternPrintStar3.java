/*Requirement: Print star pattern
    *
   **
  ***
 ****
*****
*/

package com.k2js.loops.practise;

class PatternPrintStar3{
	
	static void patternPrintStar3(){
		int  positionToPrintSar=5;
		for(int row=0;row<5;row++){			
			for(int cell=0;cell<=5;cell++){
				if(positionToPrintSar<=cell)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
		}
		System.out.println();
		positionToPrintSar--;
	}
}

class PatternPrintStar3Test{
	
	public static void main(String...xxyy){
		PatternPrintStar3.patternPrintStar3();
	}
}