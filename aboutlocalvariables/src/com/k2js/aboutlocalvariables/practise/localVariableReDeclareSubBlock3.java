//Requirement: accessing a local variable in nested block

package com.k2js.aboutlocalvariables.practise;

class localvariableAccessingInnerBlock{
	
	public static void main(String...xxyy){
		int i = 10;
		System.out.println(i);
		{
			i=20;
			System.out.println(i);
			{
				i=30;
				System.out.println(i);
			}
		}
	}
}