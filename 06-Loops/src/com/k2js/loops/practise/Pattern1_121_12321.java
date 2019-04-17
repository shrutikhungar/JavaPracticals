/*Requirement: To print below pattern
1
121
12321
1234321
123454321
*/
package com.k2js.loops.practise;

class Pattern1_121_12321{
	
	static void pattern1_121_12321(){
		for(int row=1;row<=5;row++){
			for(int col=1;col<=row;col++){
				System.out.print(col);
			}
			for(int col1=row-1;col1>=1;col1--){
				System.out.print(col1);
			}
			System.out.println();
		}
	}
}

class Pattern1_121_12321Test{
	
	public static void main(String...xxyy){
		Pattern1_121_12321.pattern1_121_12321();
	}
}