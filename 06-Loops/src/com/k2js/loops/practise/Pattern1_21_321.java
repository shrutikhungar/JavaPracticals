/*Requirement: Print star pattern
1
21
321
4321
54321

*/

package com.k2js.loops.practise;

class Pattern1_21_321{
	
	static void pattern1_21_321(){		
		for(int row=1;row<=5;row++){
			for(int col=row;col>=1;col--){
				System.out.print(col);
			}
			System.out.println("");
			

		}
	}
}

class Pattern1_21_321Test{
	
	public static void main(String...xxyy){
		Pattern1_21_321.pattern1_21_321();
	}
}