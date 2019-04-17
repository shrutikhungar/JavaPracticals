//Requirement: 

package com.k2js.loops.practise;

class Pattern_ABCD_12345{
	
	static void pattern_ABCD_12345(){
		for(int row=1;row<=5;row++){
			for(char c=1;c<=5-row;c++){
				System.out.print((char)(c+64));
			}	
			
			for(int i=1;i<=row;i++){
				System.out.print(i);
			}
			System.out.println();			
		}
	}
}

class Pattern_ABCD_12345Test{
	
	public static void main(String...xxyy){
		Pattern_ABCD_12345.pattern_ABCD_12345();		
	}
}