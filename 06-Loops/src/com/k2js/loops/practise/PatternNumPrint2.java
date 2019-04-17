/*Requirement: Print star pattern
1
12
123
1234
12345

*/

package com.k2js.loops.practise;

class PatternNumPrint2{
	static void patternNumPrint2(){
		for(int row=1;row<=5;row++){
			for(int cell=1;cell<=row;cell++){
				System.out.print(cell);
			}
			System.out.println("");
		}
	}
}

class PatternNumPrintTest{
	
	public static void main(String...xxyy){
		PatternNumPrint2.patternNumPrint2();
	}
}