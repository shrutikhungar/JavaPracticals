/*Requirement: Print star pattern
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

*/

package com.k2js.loops.practise;
/*
class PatternStarPrint{
	
	static void printStarPattern(){
		for(int row=0;row<5;row++){
			for(int cell=0;cell<5;cell++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
ISSUE BELOW. NEED TO CHECK*/
class PatternStarPrint{
	
	static void printStarPattern(){
		for(int row=0;row<5;row++,System.out.println());
			for(int cell=0;cell<5;cell++,System.out.print("*"));
	}
}

class PatternStarPrintTest{
	
	public static void main(String...xxyy){
		PatternStarPrint.printStarPattern();
	}
}