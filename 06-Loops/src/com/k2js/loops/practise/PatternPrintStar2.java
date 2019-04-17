/*Requirement: Print star pattern
* * * * *
* * * * 
* * *
* * 
* 

*/

package com.k2js.loops.practise;

class PatternStarPrint2{
	static void printStarPattern2(){
		for(int row=0;row<5;row++){
			//for(int cell=0;cell=5-row;cell++)
			for(int cell=5;cell>row;cell--){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

class PatternStarPrint2Test{
	
	public static void main(String...xxyy){
		PatternStarPrint2.printStarPattern2();
	}
}