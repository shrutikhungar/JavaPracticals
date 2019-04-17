//Requirement: To check if local variable gives error again

package com.k2js.aboutlocalvariables.practise;

class LocalvariableReDeclareSubblock{
	public static void main(String...xxyy){
		int i =10;
		{
			int i=50;
			System.out.println(i);
		}
		a:{
			i=40;
			System.out.println(i);
		}
		System.out.println(i);
	}
}