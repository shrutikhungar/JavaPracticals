/*Requirement:
54321
5432
543
54
5
*/

package com.k2js.loops.practise;

class Pattern54321_5432{
	
	static void pattern54321_5432(){
		for(int row=1;row<=5;row++){
			for(int col=5;col>=row;col--){
				System.out.print(col);
			}
			System.out.println();
		}
	}
}

class Pattern54321_5432Test{
	
	public static void main(String...xxyy){
		Pattern54321_5432.pattern54321_5432();
	}
}