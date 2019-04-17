//Requirement: To illustrate the use of local variable and store result temporarily to reuse and to reduce complexity

package com.k2js.aboutlocalvariables.practise;

class localVariableUse{
	
	public static void main(String...xxyy){
		int i =10;
		int j =20;
		int big=(i>j)?i:j;
		
		System.out.println(big*2);
		
		//complex way
		System.out.println((i>j?i:j)*2);
	}
}