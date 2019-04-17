//Requirement: to print hellow infinite times

package com.k2js.loops.practise;

class A{
	
	public static void main(String...xxyy){
		int i=1;
		a: for (;;)
			if ( i<=5 ){
				System.out.println(i);
				i++;
			}
			else 
				break a;		
	}
}