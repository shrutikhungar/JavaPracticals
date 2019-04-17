//Requirement: To declare the local variable in one block and redeclare it again in another sub block

package com.k2js.aboutlocalvariables.practise;

class localvariableReDeclareSubBlock1{
	
	public static void main(String...xxyy){
		
		{
			int i =10;
			System.out.println(i);
		}
		a: {
			int i =20;
			System.out.println(i);
		}
		int i=30;
		System.out.println(i);
	}
}