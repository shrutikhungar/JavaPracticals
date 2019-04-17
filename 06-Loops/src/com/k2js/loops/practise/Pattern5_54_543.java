/*Requirement : To print below pattern
    5
   54
  543
 5432
54321
*/

package com.k2js.loops.practise;

class Pattern5_54_543{
	
	static void pattern5_54_543(){
		
		for(int row=5;row>=1;row--){
			
			for(int i=5;i>row-1;i--){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

class Pattern5_54_543Test{
	
	public static void main(String...xxyy){
		Pattern5_54_543.pattern5_54_543();
	}
}