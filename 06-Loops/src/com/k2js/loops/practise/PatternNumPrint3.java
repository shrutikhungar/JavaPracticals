/*Requirement: Print star pattern
12345
1234
123
12
1
*/

package com.k2js.loops.practise;

class PatternNumPrint3{
	static void patternNumPrint3(){
		for(int row=0;row<=5;row++){
			for(int cell=1;cell<=5-row;cell++){
				System.out.print(cell);
			}
			System.out.println("");
		}
	}
}

class PatternNumPrint3Test{
	
	public static void main(String...xxyy){
		PatternNumPrint3.patternNumPrint3();
	}
}