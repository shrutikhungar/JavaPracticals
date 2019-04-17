/*Requirement: to print below pattern
1
23
456
78910

*/
package com.k2js.loops.practise;

class PatternNumber123456{
	
	static void patternNumber123456(){
		int count = 0;
		for(int row=1;row<=4;row++){
					
			for(int col=1;col<=row;col++){
				count++;
				System.out.print(count+" ");
			}
			System.out.println("");
		}
	}
}

class PatternNumber123456Test{
	
	public static void main(String...xxyy){
		PatternNumber123456.patternNumber123456();
	}
}