/*Requirement: to print below pattern
  
1
22
333
4444
*/
package com.k2js.loops.practise;

class PatternNumber122333{
	
	static void patternNumber122333(){
		for(int row=1;row<=4;row++){
			
			for(int col=1;col<=row;col++){
				System.out.print(row);
			}
			System.out.println("");
		}
	}
}

class PatternNumber122333Test{
	
	public static void main(String...xxyy){
		PatternNumber122333.patternNumber122333();
	}
}