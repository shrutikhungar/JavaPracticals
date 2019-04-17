/*Requirement: to print below pattern
  
    1
   22
  333
 4444
*/
package com.k2js.loops.practise;

class PatternNumber122333Space{
	
	static void patternNumber122333Space(){
		for(int row=1;row<=4;row++){
			
			for(int space=4;space>=row;space--){
				System.out.print(" ");
			}
			
			for(int col=1;col<=row;col++){
				System.out.print(row);
			}
			System.out.println("");
		}
	}
}

class PatternNumber122333SpaceTest{
	
	public static void main(String...xxyy){
		PatternNumber122333Space.patternNumber122333Space();
	}
}