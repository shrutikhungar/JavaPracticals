/*Requirement : To print below pattern
    1
   12
  123
 1234
12345
*/

package com.k2js.loops.practise;

class Pattern12345{
	
	static void pattern12345(){
		for (int i = 1; i <= 5; i++) 
        {
            for (int space = 1; space <= 5-i; space++)
			{				
				System.out.print(" ");
			} 
				for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }             
            System.out.println();
        }
	}
}
	
	
class Pattern12345Test{
	
	public static void main(String...xxyy){
		Pattern12345.pattern12345();
	}
}
	