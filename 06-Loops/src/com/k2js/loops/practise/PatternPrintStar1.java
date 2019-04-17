/*Requirement: Print star pattern
* 
* *
* * *
* * * *
* * * * *

*/

package com.k2js.loops.practise;

class PatternStarPrint1{
	static void printStarPattern1(){
		//Option 1
		/*for(int row=1;row<=5;row++){
			for(int col=1;col<=row;col++){
				System.out.print("*");
			}
			System.out.println("");
		}*/
		
		//Option 2
		for(int row=1;row<=5;row++){
			for(int col=row;col>=1;col--){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

class PatternStarPrint1Test{
	
	public static void main(String...xxyy){
		PatternStarPrint1.printStarPattern1();
	}
}