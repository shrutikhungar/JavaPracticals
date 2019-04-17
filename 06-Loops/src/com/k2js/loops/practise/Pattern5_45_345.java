/*Requirement : To print below pattern
    5
   45
  345
 2345
12345
*/

package com.k2js.loops.practise;

class Pattern5_45_345{
	
	static void pattern5_45_345(){
		
		for(int row=5;row>=1;row--){
			for(int space=1;space<=row-1;space++){
				System.out.print("*");
			}
			for(int i=5;i>row-1;i--){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

class Pattern5_45_345Test{
	
	public static void main(String...xxyy){
		Pattern5_45_345.pattern5_45_345();
	}
}