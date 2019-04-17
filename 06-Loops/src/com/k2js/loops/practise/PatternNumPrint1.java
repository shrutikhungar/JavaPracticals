/*Requirement: Print star pattern
12345
12345
12345
12345
12345

*/

package com.k2js.loops.practise;

class PatternNumPrint1{
	static void patternNumPrint1(){
		for(int row=1;row<=5;row++){
			for(int cell=1;cell<=5;cell++){
				System.out.print(cell);
			}
			System.out.println("");
		}
	}
}

class PatternNumPrint1Test{
	
	public static void main(String...xxyy){
		PatternNumPrint1.patternNumPrint1();
	}
}