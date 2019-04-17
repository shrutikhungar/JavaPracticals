/*Requirement:
1
26
3710
481113
59121415

*/

package com.k2js.loops.practise;

class Pattern1_26_3710{
	
	static void pattern1_26_3710(){
		for(int row=1;row<=5;row++){
			int num=row;
			for(int col=1;col<=row;col++){
				System.out.print(num);
				num=num+5-col;
			}
			System.out.println();
		}
	}
}

class Pattern1_26_3710Test{
	
	public static void main(String...xxyy){
		Pattern1_26_3710.pattern1_26_3710();
	}
}